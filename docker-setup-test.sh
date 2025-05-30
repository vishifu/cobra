#!/bin/bash

PRODUCER_CONTAINER="producer-0"
CONSUMER_CONTAINER="consumer-1"

start() { 
        docker run -it -d -p 7070:7070 -p 8080:8080 --name "$PRODUCER_CONTAINER" cobra-producer:latest
        docker run -it -d -p 9000:8090 --name "$CONSUMER_CONTAINER" cobra-consumer:latest
}

stop() {
        docker rm -f "$PRODUCER_CONTAINER"
        docker rm -f "$CONSUMER_CONTAINER"
}


# Parse line command
case "${1:-}" in
        "start")
                start 
                ;;
        "stop")
                stop 
                ;;
        *)
                exit 1
                ;;
esac
