package com.muses.demo;

import java.io.IOException;

import com.muses.logger.CustomerLevel;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by Alexander on 15/11/18.
 */
public class MusesLoggerDemo {



    public static void main(String[] args) throws IOException {
        Logger logger =  LogManager.getLogger(MusesLoggerDemo.class);
          final Level PAYMENT = Level.forName("PAYMENT", 5);
        final Level MESSAGE = Level.forName("MESSAGE", 15);
        logger.log(MESSAGE, "a verbose message"); // use the custom VERBOSE level
        logger.log(CustomerLevel.PAYMENT,"");
// Create and use a new custom level "DIAG".
//        logger.log(Level.forName("TRADE", 350), "a diagnostic message");

// Use (don't create) the "DIAG" custom level.
// Only do this *after* the custom level is created!
        logger.log(PAYMENT,"12312312");
//        logger.log(Level.getLevel("MESSAGE"), "12312312");
// Using an undefined level results in an error: Level.getLevel() returns null,
// and logger.log(null, "message") throws an exception.
//        logger.log(Level.getLevel("FORGOT_TO_DEFINE"), "some message");
//        logger.debug("Hello world - debug log");
//        logger.info("Hello world - info log");
//        logger.warn("Hello world - warn log");
//        logger.error("Hello world - error log");
//        logger.trace("Hello world - error log");

    }
}
