package suite;

public class MessageUtil {

    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    // method 1
    public String printMessage() {
        System.out.println(message);
        return message;
    }

    // method 2
    public String saluteMessage() {
        message = "Hello! " + message;
        System.out.println(message);
        return message;
    }
}
