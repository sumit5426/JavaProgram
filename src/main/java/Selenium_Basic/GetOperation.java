package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetOperation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String url = driver.getCurrentUrl();
        String page = driver.getPageSource();
        String title = driver.getTitle();
        System.out.println("url :" + url + "page source :" + page + "title :" + title);
    }
}
