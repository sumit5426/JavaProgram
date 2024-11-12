package Selenium_Operation;

import com.google.gson.Gson;
import testdata.pojo.JsonLogin;
import testdata.pojo.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonReading {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File(System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\testdatajson.json");
        FileReader fileReader=new FileReader(file);
        Gson gson=new Gson();
        JsonLogin jsonLogin=gson.fromJson(fileReader, JsonLogin.class);
        List<Data> loginDetailsList=jsonLogin.getData();
        for(Data logdet:loginDetailsList){

            System.out.println( logdet.getEmailAddress()+" "+logdet.getPassword());
        }



    }
}
