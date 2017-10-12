package basic;

class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    // print the message
    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
