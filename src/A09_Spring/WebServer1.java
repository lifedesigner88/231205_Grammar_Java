package A09_Spring;

import A00_Print.Print;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WebServer1 extends Print {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            print("8080 서비스 시작");
            while (true){

                try (Socket socket = serverSocket.accept()) {
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "Hello World";
                    socket.getOutputStream().write(httpRes.getBytes(StandardCharsets.UTF_8));
                }
            }
        } catch (IOException ignored) {}
    }
}
