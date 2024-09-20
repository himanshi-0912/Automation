package utils;

import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
    Properties properties;



    public  Config() throws IOException {

        //initialization proprty
         properties = new Properties();

        //FileINputStream
        FileInputStream fis = new FileInputStream("src/test/resources/Properties/config.properties");

        //Property file load
        properties.load(fis);

    }

    public String test(String key){

        return  properties.getProperty(key);
    }
}
