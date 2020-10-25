package dragan;

import java.util.logging.ConsoleHandler;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LoggerHierarchyWithFilterDemo {
    public static void main(String[] args) {
        Logger logger      = Logger.getLogger("");
        Logger logger1     = Logger.getLogger("1");
        Logger logger1_2   = Logger.getLogger("1.2");

        logger1    .addHandler(new ConsoleHandler());
        logger1_2  .addHandler(new ConsoleHandler());

        logger1.setFilter(new Filter() {
            public boolean isLoggable(LogRecord record) {
                System.out.println(record);

                return !record.getMessage().contains("dragan");
            }
        });

        logger     .info("msg:");
        logger1    .info("msg: 1");
        logger1    .info("msg: 1 dragan");
        logger1_2  .info("msg: 1.2");
        logger1_2  .info("msg: 1.2 dragan");
    }
}