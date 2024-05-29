package Action_Items;

import Day11_05_07_24.Reusable_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

import static Day11_05_07_24.Reusable_Methods.setupChromeDriver;

public class Weight_Watchers_Reusable_Methods {

    public static void main(String[] args) throws InterruptedException {
        //set up chrome driver from reusable method
        WebDriver driver = setupChromeDriver();

        //create array list for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        //declare an array list
        zipCode.add("11209");
        zipCode.add("11218");
        zipCode.add("10306");

        //set up for loop
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to weightwatchers website
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //pause for 3 seconds
            Thread.sleep(3000);
            //click on Find a Workshop
            Reusable_Methods.clickMethod(driver, "//*[@class='secondaryWrapper-lMu0i']", "find workshop");

            //click on in person link
            Reusable_Methods.clickMethod(driver, "//*[@class='buttonText-0YATk']", "person link");

            //pause 3 seconds
            Thread.sleep(3000);

            //declare and store locator as a webElement
            Reusable_Methods.sendKeysMethod(driver,"//*[@id='location-search']", zipCode.get(i),
                    "zipcode search" );

            //click on search arrow
            Reusable_Methods.clickMethod(driver,"//*[@class='rightArrow-C_sUu']" , "person link");

            //pause for 3 seconds
            Thread.sleep(3000);

            // select studio link by index
            if (i == 0) {
                Reusable_Methods.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']",1, "studio link 2");
            } else if (i == 1) {
                Reusable_Methods.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']",2, "studio link 3");
            } else if (i == 2) {
                Reusable_Methods.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']",0, "studio link 1");
            }//end of select studio

            // pause for 3 seconds
            Thread.sleep(3000);

            //store address
            String address = Reusable_Methods.captureText(driver, "//*[@class='address-FnT8k']", "Store Address");
            //print the address
            System.out.println("Address: " + address);

            Reusable_Methods.scrollIntoView(driver, "//*[@class='title-UbUc9']", "workshops");

            //capture schedule
            String schedule = Reusable_Methods.captureText(driver, "//*[@class='scheduleContainerMobile-ps6Rm']", "Schedule");
            System.out.println("Schedule: " + schedule);
        }//end of for loop

        //quit driver
        driver.quit();

    }//end of main
}//end of class

