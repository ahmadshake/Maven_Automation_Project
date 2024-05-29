package Day10_05_06_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class T2_Implicit_Wait {
    public static void main (String [] args) throws InterruptedException {

        //declare the chromeOptions
        ChromeOptions options = new ChromeOptions();
        //run incognito
        options.addArguments("incognito");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        //define and declare your global implicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //navigate to UPS
        driver.navigate().to("https://www.ups.com");
        Thread.sleep(2000);
        //click on tracking
        driver.findElement(By.xpath("//*[text()= 'Tracking")).click();
        //click on track a package
        driver.findElement(By.xpath("//*[text'Track a Package']")).click();

        driver.quit();


    }//end of main
}//end of class
