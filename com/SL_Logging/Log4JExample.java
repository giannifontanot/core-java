package com.SL_Logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;

public class Log4JExample {

    //Initialize the logger
    final static Logger logger = Logger.getLogger(String.valueOf(Log4JExample.class));

    // main class to use the logger
    public static void main(String[] args) throws IOException {
logger.info("this is a test");
        // we read the properties file
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("src/myLogging.properties"));
            String propertyFromFile = (String)LogManager.getLogManager().getProperty("java.util.logging.FileHandler.pattern");
            System.out.println("propertyFromFile" + propertyFromFile);
            Handler fileHandler = new FileHandler("src/com/logging/logs/logger.log", 20000, 5);
            //Let's overwrite the formatter and filter defined in LogManager
            fileHandler.setFormatter(new MyFormatter());
            fileHandler.setFilter(new MyFilter());
            logger.addHandler(fileHandler);
        } catch (IOException ex) {
            System.out.println("Error when getting LogManager.");
            ex.printStackTrace();
        }

        //We define the fileHandler and its properties
        try {



            //Create and fill the array from 1 to 1000
            int[] bigArray = new int[1000];
            for (int i = 0; i < 1000; i++) {
                bigArray[i] = i + 1;
            }

            // Now, lets make the array work and log what is happening
            for (int i : bigArray) {
                if (i % 7 == 0) {
                    logger.log(Level.SEVERE, "Something went wrong" + i);
                    continue;
                }

                if (i % 5 == 0) {
                    logger.log(Level.WARNING, "Just a warning message" + i);
                    continue;
                }

                logger.log(Level.INFO, "Logging message: " + i);
                logger.log(Level.CONFIG, "Config Data");
            }

        } catch (Exception ex) {
            System.out.println("Error when creating new fileHandler");
            ex.printStackTrace();
        }

        logger.info("this is a SECOND test");
    }

}












