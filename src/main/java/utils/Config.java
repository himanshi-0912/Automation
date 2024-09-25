package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
   public Properties properties;
    //String browser;


    public  Config() throws IOException {

        //initialization proprty
         properties = new Properties();

        //FileINputStream
        FileInputStream fis = new FileInputStream("src/test/resources/Properties/config.properties");

        //Property file load
        properties.load(fis);

        //print the username
       //browser= properties.getProperty("Browser"); //edge


    }

    public String getProperties(String key){
        return properties.getProperty(key); //Edge
    }
}
