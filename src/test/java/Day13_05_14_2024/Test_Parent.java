package Day13_05_14_2024;

import Day11_05_07_24.Reusable_Methods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class Test_Parent {
    public static WebDriver driver;

    public static ExtentReports reports;

    public static ExtentTest logger;

    //declare a global public webDriver variable
    //declare a global public webDriver variable
    @BeforeSuite
    public void setUpReports() {
        reports = new ExtentReports("src/main/java/HTML_Report/AutomationReport.html");
    }//end of before suite

    //declare a global public webDriver variable
    @BeforeClass
    public void setUpDriver() {
        driver = Reusable_Methods.setupChromeDriver();
    }//end of before class

    @BeforeMethod
    public void setTestName(Method methodName) {
        logger = reports.startTest(methodName.getName());
    }//end of before method

    @AfterMethod
    public void endTest (){
        reports.endTest(logger);
    }//end of before method

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }//end of after class

    @AfterSuite
    public void flushReport() {
        reports.flush();
    }//end of after suite
    public void cleanUpDriver() {
        driver.quit();
    }//end of after suite


}//end of class
