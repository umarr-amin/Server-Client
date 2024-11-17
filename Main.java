public class Main {
    public static void main(String[] args) {
        MessageManager messageManager = new MessageManager();
        Sender sender = new Sender(messageManager);
        Receiver receiver = new Receiver(messageManager);

        sender.sendMessage("1", "2", "Hello, this is a test message!");
        receiver.receiveMessage("2");
    }
}