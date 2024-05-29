package Action_Items;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class weight_watchers {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome option
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //add option to start it incognito
        options.addArguments("incognito");
        //define webdriver
        WebDriver driver = new ChromeDriver(options);
        ArrayList<String> zipCode = new ArrayList<>();
        //declare an array list
        zipCode.add("11209");
        zipCode.add("11218");
        zipCode.add("10306");
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to weightwatchers website
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //pause for 3 seconds
            Thread.sleep(3000);
            //click on Find a Workshop
            driver.findElement(By.xpath("//*[@class='secondaryWrapper-lMu0i']")).click();
            //click on in person link
            driver.findElement(By.xpath("//*[@class='buttonText-0YATk']")).click();
            //pause 3 seconds
            Thread.sleep(3000);
            //declare and store locator as a webElement
            WebElement location = driver.findElement(By.xpath("//*[@id='location-search']"));
            //clear the search field
            location.clear();
            //enter my zipcode
            location.sendKeys(zipCode.get(i));
            //click on search arrow
            driver.findElement(By.xpath("//*[@class='rightArrow-C_sUu']")).click();
            //pause for 3 seconds
            Thread.sleep(3000);
            // store studio links in arraylist of webelements
            ArrayList<WebElement> studioLink = new ArrayList<>(driver.findElements(By.xpath("//*[@class='linkContainer-C5n9z']")));
            if (i == 0) {
                studioLink.get(1).click();
            } else if (i == 1) {
                studioLink.get(2).click();
            } else if (i == 2) {
                studioLink.get(0).click();
            }//end of if else
            // pause for 3 seconds
            Thread.sleep(3000);
            //store address
            String address = driver.findElement(By.xpath("//*[@class='address-FnT8k']")).getText();
            //print the address
            System.out.println("Address: " + address);
            //define javascriptexecutor
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //define webelement
            WebElement workshops = driver.findElement(By.xpath("//*[@class='title-UbUc9']"));
            //scroll into view of workshops
            jse.executeScript("arguments[0].scrollIntoView(true);", workshops);
            //capture schedule
            String schedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-ps6Rm']")).getText();
            //print out table
            System.out.println("Schedule: " + schedule);
        }//end of for loop

        //quit driver
        driver.quit();

    }//end of main
}//end of class