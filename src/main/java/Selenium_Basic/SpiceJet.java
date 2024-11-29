package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SpiceJet {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        WebElement first = driver.findElement(By.cssSelector(".awe-autocomplete"));
        first.click();
        first.sendKeys("a");
        WebElement list = driver.findElement(By.cssSelector("#Meal-dropmenu"));
        WebElement apple=driver.findElement(By.xpath("(//div[@class='o-igit' and text()='Apple'])[1]"));
        js.executeScript("arguments[0].click()", apple);
        wait.until(ExpectedConditions.visibilityOf(list));

        driver.findElement(By.xpath("//button[text()='Grains']")).click();
        driver.findElement(By.id("ChildDd-awed")).click();
        driver.findElement(By.xpath("//li[text()='Wheat']")).click();
        WebElement cookies = driver.findElement(By.cssSelector("#btnCookie"));
        wait.until(ExpectedConditions.visibilityOf(cookies));
        cookies.click();

        WebElement dropdown = driver.findElement(By.cssSelector("#AllMeals-awed"));
        dropdown.click();
        List<WebElement> dropdowndata = driver.findElements(By.cssSelector(".o-itm"));
        for (WebElement fruit : dropdowndata) {
            System.out.println(fruit.getText());
            if (fruit.getText().trim().equals("Tomato")) {
                wait.until(ExpectedConditions.elementToBeClickable(fruit));
                fruit.click();
                break;
            }
        }
        WebElement invisble = driver.findElement(By.id("AllMeals-dropmenu"));
        //  wait.until(ExpectedConditions.invisibilityOf(invisble));
        WebElement combo = driver.findElement(By.id("AllMealsCombo-awed"));
        wait.until(ExpectedConditions.elementToBeClickable(combo));
        combo.click();
        combo.sendKeys("ban");
        WebElement drop = driver.findElement(By.xpath("(//div[@data-i='AllMealsCombo'])[2]"));
        driver.findElement(By.xpath("(//button[@tabindex='-1' and @aria-label='decrease value'])[2]")).click();
        driver.findElement(By.xpath("//div[@class='o-con' and text()='Fruits']")).click();

        WebElement check = driver.findElement(By.xpath("(//div[text()='Lettuce'])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);", check);
        js.executeScript("arguments[0].click();", check);
        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.visibilityOf(drop));
        drop.findElement(By.xpath("//li[text()='Banana']")).click();
        driver.findElement(By.cssSelector(".td"));



        driver.close();
    }
//        WebElement dryfrutitextbox=  driver.findElement(By.cssSelector("#Meal"));
//        dryfrutitextbox.click();
//        dryfrutitextbox.sendKeys("alm");

}


