import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.0.103", 12345);
             BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            String userInput;
            while ((userInput = input.readLine()) != null) {
                output.println(userInput);
                System.out.println("Server response: " + serverInput.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}