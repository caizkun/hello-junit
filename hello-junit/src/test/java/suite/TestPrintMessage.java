package suite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrintMessage {

    String message = "Linda";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
