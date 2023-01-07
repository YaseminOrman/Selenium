package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Day15_Log4J2 {
    //create object
    private static Logger logger = LogManager.getLogger(Day15_Log4J2.class.getName());

    @Test
    public void log4jTest(){
  // use
       logger.fatal("Fatal log !!!");
       logger.error("Error log!!!");
       logger.warn("Warning log !!!");
       logger.debug("Debug log !!!");
       logger.info("Info log!!!");

    }
}
