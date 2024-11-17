public class Receiver {
     MessageManager messageManager;

    public Receiver(MessageManager messageManager) {
        this.messageManager = messageManager;
    }

    public void receiveMessage(String contactId) {
        messageManager.displayAllMessagesForContact(contactId);
    }
}