package com.StripeApiTask.Configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {
    private final String PROP_FILE_NAME = "config.properties";

    public String getProperties(String propertyValue) throws IOException {
        String result = "";
        Properties properties = new Properties();
        String propFileName = PROP_FILE_NAME;

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            properties.load(inputStream);
        } else {
            throw new FileNotFoundException("There isn't any file with that name");
        }
        result = properties.getProperty(propertyValue);
        return result;
    }
}
