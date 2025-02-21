package Java_Coding_Programming.String_Manupulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Actions actions=new Actions(driver);
        WebElement signelement=driver.findElement(By.xpath("//span[contains(text(),'Hello']"));
        actions.moveToElement(signelement);
    }
}
