import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Archi on 29.10.2017.
 */
public class ClassForLogsTest {
    @Test
    public void doLogging() throws Exception {
        ClassForLogs classForLogs = new ClassForLogs();
        classForLogs.doLogging();
        Assert.assertTrue(classForLogs.isDon());
    }
}