package Restful;

import java.util.Map;

public class HttpRequest {
    private String url;
    private Map<String,Object> headers;

    public HttpRequest(String url) {
        this.url = url;
    }

    public HttpRequest setHeaders(Map<String,Object> headers){
        this.headers=headers;
        return this;
    }


}
