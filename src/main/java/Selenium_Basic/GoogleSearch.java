package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.google.co.in/");
        WebElement googletextbox = driver.findElement(By.id("APjFqb"));
        wait.until(ExpectedConditions.elementToBeClickable(googletextbox));
        googletextbox.click();
        googletextbox.sendKeys("java");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@jsname=\"aajZCb\"]")));
        List<WebElement> searchResult = driver.findElements(By.xpath("//div[@class=\"wM6W7d\" and @role=\"presentation\"]"));
        System.out.println(searchResult.size());
        for (WebElement oneElement:searchResult){
            System.out.println(oneElement.getText());
            if(oneElement.getText().trim().equals("javatpoint")){
                oneElement.click();
                break;
            }
        }
Thread.sleep(10000);
driver.quit();
    }
}
