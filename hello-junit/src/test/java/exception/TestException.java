package exception;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class TestException {

    String message = "Catherine";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(expected = ArithmeticException.class)
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
