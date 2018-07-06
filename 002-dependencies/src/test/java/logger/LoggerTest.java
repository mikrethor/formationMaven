package logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

public class LoggerTest{

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLogger() {
        logger.debug("hello");
    }
}