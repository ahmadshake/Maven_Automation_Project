package Day15_05_21_2024;

import Day13_05_14_2024.Test_Parent;
import Day14_05_20_2024.ReusableMethods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import static Day13_05_14_2024.Test_Parent.driver;

public class Google_Reusable_Method extends Test_Parent {
    @Test
    public void googleSearch90(){
        driver.navigate().to("https://www.google.com");
        //enter a keyword on search field
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"//*[@name='q']","cars","Search Field");
        //click on Google Search button
        ReusableMethods_Loggers.submitMethod(driver,logger,"//*[@name='btnK']","Search Button");
        //capture the search results
        String results = ReusableMethods_Loggers.captureText(driver,logger,"//*[@id='result-stats']","Search Results");
        System.out.println("My search Result is " + results);
        logger.log(LogStatus.INFO,"My search Result is " + results);

    }//end of test

}//end of class
