package com.StripeApiTask.Configuration;

import java.io.IOException;
import java.net.HttpURLConnection;

public class ConnectionConfig {
    private String authorizationKey;

    public ConnectionConfig() throws IOException {
        authorizationKey = new ReadPropertyFile().getProperties("authorizationKey");
    }

    public void setConnectionProperties(HttpURLConnection connection){
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Authorization", "Bearer " + authorizationKey);
    }
}
