package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Robot robot = new Robot();
        // Simulate Ctrl + A (Select All)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        // Move mouse to coordinates (x=500, y=300)
        robot.mouseMove(500, 300);
        // Simulate a left mouse click
        robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        // Scroll down (positive value) or up (negative value)
        robot.mouseWheel(5); // Scroll down by 5 notches
        robot.mouseWheel(-5); // Scroll up by 5 notches



    }
}
