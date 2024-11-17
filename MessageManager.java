import java.util.ArrayList;

public class MessageManager {
    private ArrayList<Message> messages = new ArrayList<>();

    public MessageManager(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public MessageManager() {

    }

    public void sendMessage(Message message) {
        messages.add(message);
    }

    public void searchMessagesBySender(String senderId) {
        for (Message message : messages) {
            if (message.getSenderId().equals(senderId)) {
                message.displayMessageDetails();
            }
        }
    }

    public void deleteMessagesForContact(String contactId) {
        messages.removeIf(message -> message.getSenderId().equals(contactId) ||
                message.getReceiverId().equals(contactId));
    }

    public void markMessagesAsRead(String contactId) {
        for (Message message : messages) {
            if (message.getReceiverId().equals(contactId)) {
                message.updateStatus(true);
            }
        }
    }

    public void displayAllMessagesForContact(String contactId) {
        for (Message message : messages) {
            if (message.getSenderId().equals(contactId) || message.getReceiverId().equals(contactId)) {
                message.displayMessageDetails();
            }
        }
    }
}