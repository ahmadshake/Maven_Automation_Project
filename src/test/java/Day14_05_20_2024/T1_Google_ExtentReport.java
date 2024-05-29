package Day14_05_20_2024;

import Day11_05_07_24.Reusable_Methods;
import Day13_05_14_2024.Test_Parent;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Day11_05_07_24.Reusable_Methods.setupChromeDriver;

public class T1_Google_ExtentReport extends Test_Parent {
    @Test(priority = 1)
    public void tc001_verifyGoogleTitle(){
        //navigate to google homepage
        driver.navigate().to("https://www.google.com");
        //store the title of google page in a string variable
        String actualTitle = driver.getTitle();
        //store the expected title
        String expectedTitle = "Google";
        //print result out on log
        ReusableMethods_Loggers.checkIfStringEquals(expectedTitle,actualTitle, logger);
        //assert the two titles
        Assert.assertEquals(actualTitle,expectedTitle);
    }//end of test case 1
    @Test(priority = 2)
    public void tc002_searchForACar(){
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //search for a car
        ReusableMethods_Loggers.sendKeysMethod(driver, logger,"//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        ReusableMethods_Loggers.submitMethod(driver, logger,"//*[@name = 'btnK']", "Submit Button");
    }//end of test case 2
    @Test(priority = 3)
    public void tc003_captureSearchResult(){
        // click on the tools button
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String actualGoogleSearchResult = ReusableMethods_Loggers.captureText(driver,logger,"//*[@id = 'result-stats']", "Search Result" );
        String expectedGoogleSearchResult = "About 1,390,000,000 results (0.51 seconds)";
        //print out result on the log
        ReusableMethods_Loggers.checkIfStringEquals(expectedGoogleSearchResult,actualGoogleSearchResult,logger);
        //Assert the search results
        Assert.assertEquals(actualGoogleSearchResult,expectedGoogleSearchResult);
    }//end of test case 3

}//end of class
