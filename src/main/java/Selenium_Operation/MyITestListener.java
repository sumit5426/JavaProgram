package Selenium_Operation;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.*;
import com.aventstack.extentreports.*;


public class MyITestListener implements ITestListener{
ITestResult result;
ExtentReporter extentReporter;
ExtentSparkReporter extentSparkReporter;
ExtentTest extentTest;
}
