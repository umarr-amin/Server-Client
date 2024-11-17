import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static MessageManager messageManager = new MessageManager();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is listening on port 12345");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            new Thread(new ServerTask(socket)).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ServerTask implements Runnable {
    private Socket socket;

    public ServerTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            String text;
            while ((text = input.readLine()) != null) {
                System.out.println("Received: " + text);
                output.println("Echo: " + text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}