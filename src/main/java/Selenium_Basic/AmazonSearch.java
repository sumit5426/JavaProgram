package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonSearch {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement amazontextbox = driver.findElement(By.id("twotabsearchtextbox"));
        wait.until(ExpectedConditions.elementToBeClickable(amazontextbox));
        amazontextbox.click();
        amazontextbox.sendKeys("mobile");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".two-pane-results-container")));
        List<WebElement> searchResult = driver.findElements(By.xpath("//div[@role=\"button\" and @class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));
        System.out.println(searchResult.size());
        int total=searchResult.size();
        searchResult.get(total-4).click();
        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(driver.findElement(By.cssSelector(".nav-line-1-container"))).build();
        action.perform();
        driver.findElement(By.xpath("//span[contains(text(),\"Sign in\")]")).click();


    }
}
