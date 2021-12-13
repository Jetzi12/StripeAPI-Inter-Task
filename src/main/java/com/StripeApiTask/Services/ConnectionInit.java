package com.StripeApiTask.Services;

import com.StripeApiTask.Configuration.ConnectionConfig;
import org.springframework.http.HttpMethod;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionInit {

    public HttpURLConnection initConnection(String methodForConnection, URL url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        new ConnectionConfig().setConnectionProperties(connection);
        connection.setDoOutput(HttpMethod.POST.toString().equals(methodForConnection)); //to do stałej
        return connection;
    }
}
