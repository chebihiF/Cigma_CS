import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ProgrammeServer {

    public static final int PORT = 1234 ;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            while(true) {
                System.out.println("Waiting for client ... ");
                Socket socket1 = serverSocket.accept();
                System.out.println("IP : " + socket1.getRemoteSocketAddress() + " is connected");
                (new ThreadClient(socket1)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();}

    }
}
