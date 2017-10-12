package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestPrintMessage.class, TestSaluteMessage.class})
public class JUnitTestSuite {
}
