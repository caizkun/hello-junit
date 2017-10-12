package suite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSaluteMessage {

    String message = "Kevin";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSaluteMessage() {
        System.out.println("Inside testSaluteMessage()");
        message = "Hello! " + message;
        assertEquals(message, messageUtil.saluteMessage());
    }
}
