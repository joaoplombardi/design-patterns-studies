package br.com.store.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> params) {
        try {
            URL apisUrl = new URL(url);
            URLConnection connection = apisUrl.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Error sending HTTP request", e);
        }
    }

}
