package dragan;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class LoggerHierarchyDemo {
    public static void main(String[] args) {
        Logger logger      = Logger.getLogger("");
        Logger logger1     = Logger.getLogger("1");
        Logger logger1_2   = Logger.getLogger("1.2");

        logger1    .addHandler(new ConsoleHandler());
        logger1_2  .addHandler(new ConsoleHandler());

        logger     .info("msg:");
        logger1    .info("msg: 1");
        logger1_2  .info("msg: 1.2");
    }
}
