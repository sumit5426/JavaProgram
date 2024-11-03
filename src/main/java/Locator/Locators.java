package Locator;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Locators {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
       // options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);
        driver.getWindowHandle();


        driver.get("https://phptravels.com/demo/");
        // driver.navigate().to("https://phptravels.com/demo/");
        WebElement countrydropdown = driver.findElement(By.cssSelector("#country_id"));
        countrydropdown.click();
        Select select = new Select(countrydropdown);
        select.selectByVisibleText("Netherlands +31");
        List<WebElement> dropdownlist = select.getOptions();
        System.out.println(dropdownlist.size());
        WebElement lastelement = dropdownlist.get(dropdownlist.size() - 1);
        System.out.println(lastelement);
        lastelement.sendKeys(Keys.ENTER);

        for (WebElement dpdown : dropdownlist) {
            //  System.out.println(dpdown.getText());
        }
        List<WebElement> image = driver.findElements(By.tagName("img"));
        System.out.println(image.get(2).getAttribute("src"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click", countrydropdown);
        js.executeScript("alert('This is a test alert');");
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        // wait.until(ExpectedConditions.visibilityOfAllElements());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(countrydropdown.isDisplayed());
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//        js.executeScript("window.scrollTo(0, 1500);");
//        WebElement learn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Learn More'])[2]")));
        WebElement prd= driver.findElement(By.xpath("//strong[text()='PRODUCT']"));
        js.executeScript("arguments[0].scrollIntoView(true);", prd);
        Actions act=new Actions(driver);
        WebElement subscribe =driver.findElement(By.cssSelector("#subBtn"));
        act.doubleClick(subscribe).build().perform();;
        Action ac=act.contextClick(subscribe).click().build();
        ac.perform();
        List<WebElement> li=driver.findElements(By.cssSelector("[type='text']"));
        Iterator<WebElement> ite=li.iterator();
        if(ite.hasNext()){
            WebElement single=ite.next();
            System.out.println(single.getAttribute("placeholder"));

        }
        Set<Cookie> ck=driver.manage().getCookies();
        for (Cookie one:ck){
            one.getExpiry();
        }
    }
}

