package Day10_05_06_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T3_Explicit_Wait {
    public static void main(String[] args) {
        //declare the chromeOptions
        ChromeOptions options = new ChromeOptions();
        //run incognito
        options.addArguments("incognito");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);
        //navigate to ups.com
        driver.navigate().to("https://www.ups.com");

        //declare explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //click on tracking
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking"))).click();
        }catch(Exception e){
            System.out.println("unable to click on tracking "+e);
        }//end of clicking on tracking
        try{
        //click on track a package
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
    }catch (Exception e) {
        System.out.println("Unable to click on Track a package " +e);
    }//end of exception

    //quit the driver
    driver.quit();


    }//end of main
}//end of class
