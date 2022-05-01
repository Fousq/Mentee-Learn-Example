package kz.zhanbolat.example.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NonStaticLogClass {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void execute() {
        logger.info("Non static");
    }

    public Logger getLogger() {
        return logger;
    }
}
