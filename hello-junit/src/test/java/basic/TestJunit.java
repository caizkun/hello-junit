package basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message = "Hello JUnit";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
//        message = "Change message to let the test fail";
        assertEquals(message, messageUtil.printMessage());
    }
}
