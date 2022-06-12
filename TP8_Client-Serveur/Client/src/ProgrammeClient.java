import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ProgrammeClient {

    private static final String HOST = "192.168.1.5"; // server host
    private static final int PORT = 1234; //server port
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            Socket socket = new Socket(HOST,PORT);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            System.out.print("Name : ");
            String name = scanner.nextLine();
            out.println(name);
            System.out.println(in.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
