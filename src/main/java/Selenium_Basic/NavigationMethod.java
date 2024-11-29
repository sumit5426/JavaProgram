package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationMethod {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
