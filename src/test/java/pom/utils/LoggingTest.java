package pom.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest {
    private static final Logger logger = LoggerFactory.getLogger(LoggingTest.class);

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.debug("This is a debug message");
    }
}
