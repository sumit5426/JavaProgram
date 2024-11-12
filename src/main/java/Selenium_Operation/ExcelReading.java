package Selenium_Operation;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReading {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        File file=new File(System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\testdataExcel.xlsx");
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(file);
        XSSFSheet sheet=xssfWorkbook.getSheet("Sheet1");
        Iterator<Row> rowIterator=sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()){
            Row row=rowIterator.next();
           Cell name= row.getCell(0);
            Cell password=row.getCell(1);
            System.out.println(name.toString()+" "+password.toString());

        }



    }
}
