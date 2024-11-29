package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class LinkValidation {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.chittorgarh.com/");
        List<WebElement> elements=driver.findElements(By.tagName("a"));
        elements.size();
        Iterator<WebElement> webElementIterator=elements.iterator();
        while (webElementIterator.hasNext()){
            WebElement element=webElementIterator.next();
            String link=element.getAttribute("href");
            System.out.println(link);
        }
    }
}
