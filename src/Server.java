import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server() {
        int port = 1234;
        String user;
        boolean run = true;
        ServerSocket serverSocket;
        Socket socket;
        System.out.println("Server started");

        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                System.out.println("Waiting for connection");
                socket = serverSocket.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("Client connected");

                String name = in.readLine();
                if (name.equals("Shutdown")) {
                    out.println("SERVER: I am being shut down...");
                    in.close();
                    out.close();
                    socket.close();
                    System.out.println("Shutting down...");
                    System.exit(0);
                } else {
                    while (run) {
                        System.out.println("Client name is \"" + name + "\"");
                        System.out.println("Sending feedback");
                        out.println("SERVER: Welcome " + name + "! Keep up the good work");
                        name = in.readLine();
                    }
                }
                in.close();
                out.close();
                socket.close();

                System.out.println("Closing down " + name);
            }
        } catch (Exception e) {
            System.out.println("Server fail");
        }
    }
}
