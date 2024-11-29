package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriver {
    public static void main(String[] args) {
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--headless");
       // WebDriver driver=new RemoteWebDriver(option);
        WebDriver driver=new ChromeDriver(option);
        driver.get("https://www.google.co.in/");
        String uri=driver.getCurrentUrl();
        System.out.println(uri);
    }
}
