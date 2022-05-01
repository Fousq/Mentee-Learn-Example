package kz.zhanbolat.example.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticLogClass {

    private static final Logger logger = LoggerFactory.getLogger(StaticLogClass.class);

    public void execute() {
        logger.info("Static");
    }

    public Logger getLogger() {
        return logger;
    }
}
