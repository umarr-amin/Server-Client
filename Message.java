import java.util.Date;

public class Message {
    private String senderId;
    private String receiverId;
    private String text;
    private Date timestamp;
    private boolean isRead;

    public Message(String senderId, String receiverId, String text) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.text = text;
        this.timestamp = new Date();
        this.isRead = false;
    }

    public void updateStatus(boolean status) {
        this.isRead = status;
    }

    public void displayMessageDetails() {
        System.out.println("From: " + senderId + ", To: " + receiverId + ", Text: " + text +
                ", Timestamp: " + timestamp + ", Status: " + (isRead ? "Read" : "Unread"));
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public String getText() {
        return text;
    }
}