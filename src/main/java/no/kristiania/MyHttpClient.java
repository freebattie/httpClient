package no.kristiania;

import java.io.IOException;
import java.net.Socket;

public class MyHttpClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("httpbin.org", 80);
        String request = "GET / HTTP/1.1 \r\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" +
                "Accept-Encoding: gzip, deflate\r\n" +
                "Accept-Language: nb,en-US;q=0.9,en;q=0.8,nb-NO;q=0.7,no;q=0.6,nn;q=0.5\r\n" +
                "Cache-Control: max-age=0\r\n" +
                "Connection: keep-alive\r\n" +
                "Host: httpbin.org\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\r\n\r\n";

        socket.getOutputStream().write(request.getBytes());

        int c;
        while ((c = socket.getInputStream().read()) != -1) {
            System.out.print((char) c);
        }

    }
}
