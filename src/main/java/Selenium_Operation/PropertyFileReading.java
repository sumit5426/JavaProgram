package Selenium_Operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {
    public static void main(String[] args) throws IOException {
        File file=new File(System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\confg.properties");
        FileReader fileReader=new FileReader(file);
        Properties properties=new Properties();
        properties.load(fileReader);
        String envdetails=properties.getProperty("environment");
        System.out.println(envdetails);
    }
}
