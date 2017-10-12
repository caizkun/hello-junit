package timeout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTimeOut {

    String message = "Catherine";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(timeout=50)
    public void testPrintMessage() {
        System.out.println("In testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
    public void testSaluteMessage() {
        System.out.println("In testSaluteMessage()");
        message = "Hello! " + message;
        assertEquals(message, messageUtil.saluteMessage());
    }
}
