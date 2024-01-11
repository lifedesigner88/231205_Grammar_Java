package A09_Spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WebServer3 extends Print {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            print("8081 서비스 시작");

//                POST HTTP/1.1
//                Host: localhost:8081
//                Content-Type: application/x-www-form-urlencoded
//                Content-Length: xx
//
//                userInput=Hello World


            while (true) {
                try (Socket socket = serverSocket.accept()) {

//                    Request
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    StringBuilder sb = new StringBuilder();

                    String line;
                    while (!(line = br.readLine()).isBlank()) {
                        sb.append(line).append("\n");
                    }
                    if (sb.toString().contains("POST")) {
                        char[] buffer = new char[1024];
                        br.read(buffer);
                        print("Post Body is: " + new String(buffer));
                        print("All Header is: " + sb.toString());

                    }

//                    Request
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "ok";
                    socket.getOutputStream().write(httpRes.getBytes(StandardCharsets.UTF_8));
                }

}
        } catch (IOException ignored) {}
    }
}
