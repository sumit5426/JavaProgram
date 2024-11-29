package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement file= driver.findElement(By.linkText("File Upload"));
        file.click();
       WebElement fileupload= driver.findElement(By.id("file-upload"));
        fileupload.sendKeys("D:\\DE FORMAT\\ACTIVE_DE_NO_PROV.xls");


    }
}
