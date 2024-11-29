package Selenium_Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        WebElement alertButton=driver.findElement(By.xpath("//button[@onclick=\"windowAlertFunction()\"]"));
        WebElement promptalertButton=driver.findElement(By.xpath("//button[@onclick=\"promptAlertFunction()\"]"));
        Thread.sleep(1500);
        alertButton.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1500);
        promptalertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alertt=driver.switchTo().alert();
        System.out.println(alertt.getText());
        alertt.sendKeys("YESSS");
        alertt.accept();
        driver.close();
    }
}
