package no.kristiania;



import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MyHttpClientTest {

    @Test

    public void shouldGetSuccessfulResponseCode() throws IOException {
        var client = new MyHttpClient("httpbin.org",80,"/html");
        assertEquals(200,MyHttpClient.getStatusCode());

    }

}