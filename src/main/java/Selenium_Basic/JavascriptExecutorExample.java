package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //Scroll Down by Pixels
        js.executeScript("window.scrollBy(0,500);");
        //Scroll to the Bottom of the Page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1500);
        //Scroll to an Element
        WebElement element = driver.findElement(By.id("inp_val"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        //Sending Text to Input Fields
        js.executeScript("arguments[0].value='Test Value'", element);
        Thread.sleep(2000);
        //click
        js.executeScript("arguments[0].click();", element);
        //Highlighting an Element
        js.executeScript("arguments[0].style.border='3px solid red';", element);
        Thread.sleep(2000);
        //Fetching Page Title
        String title = (String) js.executeScript("return document.title;");
        System.out.println("Page Title: " + title);
        //Fetching URL
        String url = (String) js.executeScript("return document.URL;");
        System.out.println("Current URL: " + url);
        //Fetching Inner Text of the Entire Web Page
        String pageText = (String) js.executeScript("return document.documentElement.innerText;");
        System.out.println("Page Text: " + pageText);
        //Fetching Inner Text of a Specific Element
        String text = (String) js.executeScript("return arguments[0].innerText;", element);
        System.out.println("Element Text: " + text);
        //Disabling an Element
        //Enabling an Element
        //Handling Hidden Elements
        WebElement hiddenElement = driver.findElement(By.id("hiddenElementID"));
        js.executeScript("arguments[0].click();", hiddenElement);
        //Refreshing the Browser
        js.executeScript("location.reload();");
        //Triggering Browser Alerts
        js.executeScript("alert('This is a test alert!');");
        //Executing Custom JavaScript Code
        js.executeScript("console.log('Hello from Selenium');");
        //Zooming the Page
        js.executeScript("document.body.style.zoom='50%';"); // Zoom out
        js.executeScript("document.body.style.zoom='100%';"); // Reset zoom
        //Getting Browser Viewport Size
        Long viewportHeight = (Long) js.executeScript("return window.innerHeight;");
        Long viewportWidth = (Long) js.executeScript("return window.innerWidth;");
        System.out.println("Viewport Size: " + viewportWidth + "x" + viewportHeight);
        //Manipulating Cookies
        String cookieValue = (String) js.executeScript("return document.cookie;");
        System.out.println("Cookies: " + cookieValue);
        //Setting Browser Cookies
        js.executeScript("document.cookie='username=JohnDoe; expires=Fri, 31 Dec 2024 12:00:00 UTC';");

    }
}
