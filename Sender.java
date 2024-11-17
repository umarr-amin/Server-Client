

public class Sender {
     MessageManager messageManager;

    public Sender(MessageManager messageManager) {
        this.messageManager = messageManager;
    }

    public void sendMessage(String senderId, String receiverId, String text) {
        Message message = new Message(senderId, receiverId, text);
        messageManager.sendMessage(message);
    }
}