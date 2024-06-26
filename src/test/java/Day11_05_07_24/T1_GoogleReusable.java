package Day11_05_07_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Day11_05_07_24.Reusable_Methods.setupChromeDriver;

public class T1_GoogleReusable {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver variable and set up the chrome driver
        WebDriver driver = setupChromeDriver();
        //go to google.com
        driver.navigate().to("https://www.google.com");
        //send keys from reusable methods
        Reusable_Methods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //submit using reusable methods
        Reusable_Methods.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
        // click on the tools button
        Reusable_Methods.clickMethod(driver, "//*[@id = 'hdtb-tls']", "Tools Button");
        //store the search result into a string variable
        String searchResult = Reusable_Methods.captureText(driver, "//*[@id = 'result-stats']", "Search Result");
        //print out the result stats
        System.out.println("Search Result is " + searchResult);
        //quit the chrome browser
        driver.quit();
    }//end of main
}//end of class