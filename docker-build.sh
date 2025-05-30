#!/bin/bash

set -e # exit on any error

# Configurations
BUILD_DIR="build-output"
DOCKER_CONTEXT_DIR="tools/docker/jar-context"
PROJECT_ROOT=$(pwd)

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Functions to print debug output
print_status() {
        echo -e "${BLUE}[INFO]${NC} $1"
}

print_success() {
        echo -e "${GREEN}[SUCCESS]${NC} $1"
}

print_error() {
        echo -e "${RED}[ERROR]${NC} $1"
}

# Function to clean up previous build
clean_build() {
        print_status "Cleaning previous build ..."

        if [ -f "pom.xml" ]; then
                ./mvnw clean
        elif [ -f "build.gradle" ]; then
                ./gradlew clean
        fi

        rm -rf "$BUILD_DIR"
        rm -rf "$DOCKER_CONTEXT_DIR"

        print_status "Cleanup completed!"
}

# Function to build all modules
build_modules() {
        print_status "Building all modules ..."

        if [ -f "pom.xml" ]; then
                print_status "Using maven to build modules"
                ./mvnw clean package -DskipTests
        elif [ -f "build.gradle" ]; then
                print_status "Using gradle to build modules"

                ./gradlew :cobra-core:jar
                ./gradlew :sample-common:jar
                ./gradlew :sample-model:jar
                ./gradlew :sample-cobra-producer-task:jar
                ./gradlew :sample-cobra-producer:bootJar
                ./gradlew :sample-cobra-consumer:bootJar
        else
                print_error "No build tool found in root project"
                exit 1
        fi

        print_success "All modules built successfully"
}

# Function collect jars to build folder
collect_jars() {
        print_status "Collecting JAR files ..."

        mkdir -p "$BUILD_DIR"
        jar_count=0

        # For gradle
        if [ -f "build.gradle" ]; then
                while IFS= read -r -d '' jar_file; do
                        if [[ ! "$jar_file" =~ -test\.jar$ ]] && [[ ! "$jar_file" =~ -tests\.jar$ ]]; then
                                module_name=$(basename "$(dirname "$(dirname "$jar_file")")")
                                jar_name=$(basename "$jar_file")

                                mkdir -p "$BUILD_DIR/$module_name"
                                cp -v "$jar_file" "$BUILD_DIR/$module_name/"

                                print_status "Collected: $module_name/$jar_name"
                                ((jar_count++))
                        fi
                done < <(find . -name "*.jar" -path "*/build/libs/*" -print0)
        fi

        if [ $jar_count -eq 0 ]; then
                print_error "No JAR found!"
                exit 1
        fi

        print_success "Collected $jar_count JAR files into $BUILD_DIR"
}

# Function prepare docker-context
prepare_docker_context() {
        print_status "Preparing docker context ..."

        mkdir -p "$DOCKER_CONTEXT_DIR"

        # copy jar files to docker context
        cp -vr "$BUILD_DIR"/* "$DOCKER_CONTEXT_DIR/"


        print_success "Docker context prepared in $DOCKER_CONTEXT_DIR"
}

# Function build images base on Dockerfile
build_images() {
        print_status "Building images ..."

        # work dir docker
        cd tools/docker/

        # build images
        docker build -f Dockerfile.cobra-consumer -t cobra-consumer .
        docker build -f Dockerfile.cobra-producer -t cobra-producer .

        # list images
        docker images | grep "cobra"

        print_success "Build images successfully"
}

# Main execution
main() {
        print_status "Starting builder docker images ..."

        clean_build
        build_modules
        collect_jars
        prepare_docker_context
        build_images

        print_success "Done!"
}

# Parse line command
case "${1:-}" in
        "clean")
                clean_build
                ;;
        "build")
                build_modules
                ;;
        "collected")
                collect_jars
                ;;
        "prepare-context")
                prepare_docker_context
                ;;
        "images")
                build_images
                ;;
        *)
                main
                ;;
esac
