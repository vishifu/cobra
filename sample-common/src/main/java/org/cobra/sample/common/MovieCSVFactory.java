package org.cobra.sample.common;

import java.util.List;

public class MovieCSVFactory {

    public static List<String> csvFiles() {
        // Convert URL to Path
//        String resourcePath = "/Users/shifuvn/CODES/UIT/cobra/tools/docker/dataset/";

        // DOCKER
//         String resourcePath = "/home/dataset/";

        // EC2
         String resourcePath = "/home/ec2-user/dataset/";

        return List.of(
                resourcePath + "netflix-movies_part_1.csv",
                resourcePath + "netflix-movies_part_2.csv",
                resourcePath + "netflix-movies_part_3.csv",
                resourcePath + "netflix-movies_part_4.csv",
                resourcePath + "netflix-movies_part_5.csv",
                resourcePath + "netflix-movies_part_6.csv",
                resourcePath + "netflix-movies_part_7.csv",
                resourcePath + "netflix-movies_part_8.csv",
                resourcePath + "netflix-movies_part_9.csv",
                resourcePath + "netflix-movies_part_10.csv",
                resourcePath + "netflix-movies_part_11.csv",
                resourcePath + "netflix-movies_part_12.csv",
                resourcePath + "netflix-movies_part_13.csv",
                resourcePath + "netflix-movies_part_14.csv",
                resourcePath + "netflix-movies_part_15.csv",
                resourcePath + "netflix-movies_part_16.csv",
                resourcePath + "netflix-movies_part_17.csv",
                resourcePath + "netflix-movies_part_18.csv"
        );
    }

}
