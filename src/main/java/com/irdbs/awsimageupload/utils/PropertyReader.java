package com.irdbs.awsimageupload.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private static Properties properties;

    static {
        try(FileInputStream inputStream=new FileInputStream("src/main/resources/application.properties")){
        properties=new Properties();
        properties.load(inputStream);
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
