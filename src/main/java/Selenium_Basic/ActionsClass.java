package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dragAndDrop = driver.findElement(By.linkText("Drag and Drop"));
        Actions actions = new Actions(driver);
        actions.click(dragAndDrop).perform();
        WebElement drag = driver.findElement(By.id("column-a"));
        WebElement drop = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(drag, drop).build().perform();
        actions.clickAndHold(drop).release(drag).perform();
        actions.contextClick(drop).build().perform();
        actions.moveToElement(drop).perform();
        actions.doubleClick(drop).perform();
        driver.navigate().back();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.sendKeys(Keys.ENTER).perform(); // Simulates pressing Enter
        actions.sendKeys(drag, "text to type").perform();
        actions.scrollToElement(drag).perform();
        actions.scrollByAmount(0, 500).perform(); // Scroll down 500 pixels
        actions.moveToElement(drag)
                .moveToElement(drag)
                .click()
                .perform();
        Thread.sleep(2000);
        driver.close();
    }
}
