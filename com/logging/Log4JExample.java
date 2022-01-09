package com.logging;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.*;

public class Log4JExample {

    public static Logger logger = Logger.getLogger("the name is Log4JExample");

    // main class to use the logger
    public static void main(String[]args) {

        // we read the properties file
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("./myLogging.properties"));
        } catch (IOException ex) {
            System.out.println("Error when getting LogManager.");
            ex.printStackTrace();
        }

        // We'll overwrite some propertiess
        logger.setLevel(Level.FINE);
        logger.addHandler(new ConsoleHandler());

        //We define the fileHandler and its properties
        Handler fileHandler = null;
        try {
            fileHandler = new FileHandler("/tmp/logger.log",20000,5);
        } catch (IOException ex) {
            System.out.println("Error when creating new fileHandler");
            ex.printStackTrace();
        }
        assert fileHandler != null;
        fileHandler.setFormatter(new MyFormatter());
        fileHandler.setFilter(new MyFilter());
        logger.addHandler(fileHandler);




    }
}
