package Day15_05_21_2024;

import Day13_05_14_2024.Test_Parent;
import Day14_05_20_2024.ReusableMethods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class yahoo_ReusableMethod extends Test_Parent {
    @Test
    public void yahooSearch(){
        driver.navigate().to("https://www.yahoo.com");
        //enter a keyword on search field
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"//*[@name='p']","cars","Search Field");
        //click on Google Search button
        ReusableMethods_Loggers.submitMethod(driver,logger,"//*[@id='ybar-search']","Search Button");
        //capture the search results
        String results = ReusableMethods_Loggers.captureText(driver,logger,"//*[@class='compTitle fc-smoke']","Search Results");
        System.out.println("My search Result is " + results);
        logger.log(LogStatus.INFO,"My search Result is " + results);
    }//end of test

}//end of class
