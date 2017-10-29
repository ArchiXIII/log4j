import org.apache.log4j.Logger;

/**
 * Created by Archi on 29.10.2017.
 */
public class ClassForLogs {
    private static final Logger log = Logger.getLogger("MyLoggerLog4j");

    private boolean done = false;

    public void doLogging(){
        log.trace("Log level - TRACE");
        log.debug("Log level - DEBUG");
        log.info("Log level - INFO");
        log.warn("Log level - WARN");
        log.error("Log level - ERROR");
        log.fatal("Log level - FATAL");
        done = true;
    }

    public boolean isDon(){
        return done;
    }
}
