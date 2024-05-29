package Action_Items;

import Day11_05_07_24.Reusable_Methods;
import Day13_05_14_2024.Test_Parent;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AI_Fidelis_Care extends Test_Parent {

    @Test (priority = 1)
    public void tc001_Search () throws InterruptedException {
        driver.navigate().to("https://www.fideliscare.org/");
        Reusable_Methods.clickMethod(driver, "//*[@class='tool dropdown search']", "search button");
        Thread.sleep(2000);
        Reusable_Methods.sendKeysMethod(driver, "//*[contains(@class,'form-control') and contains(@class,'search-input')]", "fidelis care members", "dental coverage");
        Thread.sleep(2000);
        Reusable_Methods.clickMethod(driver, "//*[contains(@class,'btn-primary') and contains(@class,'btn-search')]", "search icon");
        Thread.sleep(2000);

        String dentalResults = Reusable_Methods.captureText(driver, "//*[@class= 'gsc-result-info']", "capture results");
        String[] splitdentalResults = dentalResults.split(" ");
        System.out.println("Search results for dental coverage are " + splitdentalResults[1]);

        Reusable_Methods.clickMethod(driver, "//*[text()='Fidelis Care Members']", "fidelis care members");
        Thread.sleep(2000);

    }//end of test case 1

        @Test (dependsOnMethods = "tc001_Search")

                public void tc002_switchTab() throws InterruptedException {

            //store your tabs arraylist to switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

            //switch to the second tab
            driver.switchTo().window(tabs.get(1));
            Reusable_Methods.clickMethod(driver, "//*[contains(text(),'Renewal Help')]", "renewal help");
            Thread.sleep(2000);
            Reusable_Methods.clickMethod(driver, "//*[contains(text(),'When do you need to renew your coverage')]", "click when do you need to renew coverage");
            Thread.sleep(2000);
            String coverageMessage = Reusable_Methods.captureText(driver, "//*[@style= 'display: block;']", "capture renew coverage");
            System.out.println("Renewal Message is " + coverageMessage);
            Reusable_Methods.clickMethod(driver, "//*[contains(text(),'When do you need to renew your coverage')]", "click when do you need to renew coverage");
            Thread.sleep(2000);
            Reusable_Methods.clickMethod(driver, "//*[contains(text(),'What information do you need to renew your coverage')]", "click when do you need to renew coverage");
            String infoMessage = Reusable_Methods.captureText(driver, "//*[@style= 'display: block;']", "capture info coverage");
            Thread.sleep(2000);
            System.out.println("INFO TO RENEW MESSAGE: " + infoMessage);
            Thread.sleep(2000);
            driver.close();
        }//end of test case 2
            @Test (dependsOnMethods = {"tc001_Search", "tc002_switchTab" })

            public void tc003_switchTabByIndex () throws InterruptedException {
//switch back to the defult tab
Reusable_Methods.switchToTabByIndex(driver, 0, "Default Tab");

Reusable_Methods.scrollByPixelMethod(driver, "scroll");

Thread.sleep(2000);

 //click on login
Reusable_Methods.clickMethod(driver, "//*[@class = 'tool dropdown login']", "login");

//click n member portal
 Thread.sleep(2000);

Reusable_Methods.clickMethod(driver, "//*[@rel = 'noopener noreferrer']", "memberportal");

//new tab
Reusable_Methods.switchToTabByIndex(driver, 1,"newtab");
Thread.sleep(2000);

//capture the text
String helpfulHints = Reusable_Methods.captureText(driver,"//*[@id = 'dnn_ctr5328_ContentPane']", "helpful hints");
 System.out.println("MY HELPFUL HINTS Message is: " + helpfulHints);
 Thread.sleep(2000);

 driver.close();

            }//end of test case 3
}//end of class
