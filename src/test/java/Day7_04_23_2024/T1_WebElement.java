package Day7_04_23_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_WebElement {

        public static void main(String[] args) throws InterruptedException {
            //declare and define chrome options
            ChromeOptions options = new ChromeOptions();

            //add option to start it maximized and incognito
            options.addArguments("start-maximized", "incognito");

            //declare web driver and pass chrome options
            WebDriver driver = new ChromeDriver(options);

            //go to yahoo.com
            driver.navigate().to("https://www.mortgagecalculator.org");

            //click on the finance header
           WebElement homeValue =  driver.findElement(By.xpath("//*[@id= 'homeval']"));

            //clear the home field
            homeValue.clear();

            //entern 950000 in the home value field
            homeValue.sendKeys("950000");

            //wait for 2 seconds
            Thread.sleep(2000);

            //quit the driver
            driver.quit();

        }//end of main
    }//end of class
