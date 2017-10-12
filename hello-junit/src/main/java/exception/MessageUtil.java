package exception;

public class MessageUtil {

    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    // method 1
    public void printMessage() {
        System.out.println(message);
        int a = 0;
        int b = 1 / a;
    }

    // method 2
    public String saluteMessage() {
        message = "Hello! " + message;
        System.out.println(message);
        return message;
    }
}
