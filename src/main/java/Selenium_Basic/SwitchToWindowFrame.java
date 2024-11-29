package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class SwitchToWindowFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.linkText("SelectorsHub Youtube channel"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> windows = driver.getWindowHandles();
        String mainWindow = driver.getWindowHandle();
        for (String window : windows) {
            driver.switchTo().window(window);
            String title = driver.getTitle();
            System.out.println(title);
            if (title.contains("YouTube")) {
                System.out.println("YouTube Window Found!");
                String url = driver.getCurrentUrl();
                System.out.println("YouTube URL: " + url);
                break;
            }

        }
        driver.switchTo().window(mainWindow);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        WebElement frameElement = driver.findElement(By.linkText("Click here to practice iframe and nested iframe scenarios."));
        frameElement.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        Set<String> windowss = driver.getWindowHandles();
        Iterator<String> singleWindow = windowss.iterator();
        while (singleWindow.hasNext()) {
            String framewindow = singleWindow.next();
            driver.switchTo().window(framewindow);
            String url = driver.getCurrentUrl();
            if (url.contains("iframe-scenario")) {
                System.out.println("FOUND");
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.switchTo().frame("pact1");
        driver.switchTo().frame("pact2");
        driver.findElement(By.id("jex")).sendKeys("sumit");

    }
}
