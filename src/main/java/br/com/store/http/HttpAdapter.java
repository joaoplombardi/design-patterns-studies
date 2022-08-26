package br.com.store.http;

import java.util.Map;

public interface HttpAdapter {
    void post(String url, Map<String, Object> params);
}
