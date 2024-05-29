package Day10_05_06_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_Mouse_Action {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        //run in incognito and start maximize
        options.addArguments("start-maximized","incognito");

        WebDriver driver = new ChromeDriver(options);

        //navigate to USPS
        driver.navigate().to("https://www.usps.com");

        //define action command
        Actions mouseAction = new Actions(driver);

        //hover over the send tab to open up the drop down list
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[text()= 'Send']"));
            mouseAction.moveToElement(sendTab).perform();
        }catch (Exception e) {
            System.out.println("Unable to hover over Send Tab" + e);
        }//end of mouse hover to "Send Tab"

        //click on find cities by zipcode
        try {
            WebElement findCitiesByZipCode = driver.findElement(By.xpath("//*[text()= 'Find Cities by ZIP']"));
            mouseAction.moveToElement(findCitiesByZipCode).click().perform();
        }catch (Exception e){
            System.out.println("unable to click on 'find cities by zipcode' " +e);
        }//end of clicking on find cities by zipcode

        //click on look up a zip code from the drop down list
        try{
            WebElement zipCodeLookUp = driver.findElement(By.xpath("//*[text()= 'Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookUp).click().perform();
        }catch(Exception e){
            System.out.println("unable to click on " +e);
        }//end of clicking ZipCode

        //enter a zipcode
        try{
            WebElement ZipCode = driver.findElement(By.xpath("//*[@id='tZip']"));
            mouseAction.moveToElement(ZipCode).sendKeys("11221").perform();
        }catch(Exception e){
            System.out.println("Unable to enter zipcode " +e);
        }//end of entering zipcode

    }//end of main method
}//end of class
