package dragan;

import java.util.logging.*;

public class LoggerHierarchyAndLogLevelsDemo {
    public static void main(String[] args) {
        Logger logger      = Logger.getLogger("");
        Logger logger1     = Logger.getLogger("1");
        Logger logger1_2   = Logger.getLogger("1.2");

        logger1    .addHandler(new ConsoleHandler());
        logger1_2  .addHandler(new ConsoleHandler());

        logger1.setLevel(Level.WARNING);

        logger     .info("msg:");
        logger1    .info("msg: 1 info");
        logger1    .warning("msg: 1 warning");
        logger1_2  .info("msg: 1.2 info");
        logger1_2  .severe("msg: 1.2 severe");
    }
}
