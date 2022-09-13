package no.kristiania;

import java.io.IOException;
import java.net.Socket;

public class MyHttpClient {

    public MyHttpClient(String host, int port, String req) throws IOException {


        Socket socket = new Socket(host, 80);


        String request = "GET /" + req + " HTTP/1.1 \r\n" +
                "Connection: keep-alive\r\n" +
                "Connection: close \r\n"+
                "Host: " + host + "\r\n " +
                "\r\n\r\n";

        socket.getOutputStream().write(request.getBytes());

        int c;
        while ((c = socket.getInputStream().read()) != -1) {
            System.out.print((char) c);
        }
    }



    public static int getStatusCode() {
        return 0;
    }

    public static void main(String[] args) throws IOException {



    }
}
