package com.StripeApiTask.Configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {

    public String getProperties(String propertyValue) throws IOException {
        String result = "";
        Properties properties = new Properties();
        String propFileName = "config.properties";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            properties.load(inputStream);
        } else {
            throw new FileNotFoundException("nie ma pliku");
        }
        result = properties.getProperty(propertyValue);
        return result;
    }
}
