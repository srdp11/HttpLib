package http.test.com.httplib;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Http {

    public void useMethodFromLib() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://publicobject.com/helloworld.txt")
                .build();
    }
}
