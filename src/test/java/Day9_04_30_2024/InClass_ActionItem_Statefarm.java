package Day9_04_30_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import static org.testng.Assert.assertTrue;
import java.util.Formattable;

public class InClass_ActionItem_Statefarm {
    public static void main(String[] args) throws InterruptedException {
        //select start month from the dropdown on statefarm.com
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized","incognito");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");
        //start maximized


        WebDriver driver = new ChromeDriver();



        //wait few seconds for the browser session to load up
        Thread.sleep(3000);

        //create array list for variables
        ArrayList<String> zipCodes  = new ArrayList<>();
        zipCodes.add("11235");
        zipCodes.add("11204");

        ArrayList<String> policyStart = new ArrayList<>();
        policyStart.add("05/04/2024");
        policyStart.add("05/05/2024");

        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("John");
        firstName.add("Jane");

        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Doe");
        lastName.add("Dae");

        ArrayList<String> appfirstName = new ArrayList<>();
        appfirstName.add("Cody");
        appfirstName.add("Joe");

        ArrayList<String> applastName =new ArrayList<>();
        applastName.add("Doe");
        applastName.add("Doe");

        ArrayList<String> stAddress = new ArrayList<>();
        stAddress.add("3056 Brighton 13th Street");
        stAddress.add("6922 21st Avenue");

        ArrayList<String> doBirth = new ArrayList<>();
        doBirth.add("10/16/1990");
        doBirth.add("06/28/1992");



        for (int i= 0; i < 2; i++) {
            //navigate to fidelis care site
            driver.navigate().to("https://www.statefarm.com");

            //click on get a quote with try and catch
            try {
                driver.findElement(By.xpath("//*[text()='Get a Quote']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on get a quote" + e);
            }//end of try catch "click get quote"

            Thread.sleep(2000);

            //select dropdown and select homeowners
            try {
                WebElement product = driver.findElement(By.xpath("//*[@name='productName']"));
                Select dropDown = new Select(product);
                dropDown.selectByVisibleText("Homeowners");
            } catch (Exception e) {
                System.out.println("unable to select Homeowners from dropdown" + e);
            }//end of try catch "select homeowner from dropdown"

            Thread.sleep(2000);

            //input zipcode with try catch
            try {
             WebElement zipCode =   driver.findElement(By.xpath("//*[@name='zipCode']"));
             zipCode.click();
             zipCode.clear();
             zipCode.sendKeys(zipCodes.get(i));

            } catch (Exception e) {
                System.out.println("Unable to enter zipcode " + e);
            }//end of zip code  exception

            Thread.sleep(2000);

            //click start quote
            try {
                driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click start a quote " + e);
            }//end of start a quote  exception

            Thread.sleep(2000);

            //set policy start date
            try {
                WebElement strtDate = driver.findElement(By.xpath("//*[@id='effectiveDate']"));
                strtDate.click();
                strtDate.clear();
                strtDate.sendKeys(policyStart.get(i));
            } catch (Exception e) {
                System.out.println("unable to set start date" + e);
            }//end of try catch for start date

            Thread.sleep(2000);

            //enter first name
            try {
                driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter first name" + e);
            }//end of try catch for first name

            Thread.sleep(2000);

            //enter last name
            try {
                driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lastName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter last name" + e);
            }//end of try catch for last name

            Thread.sleep(2000);

            //enter valid street address
            try {
                driver.findElement(By.xpath("//*[@id='street']")).sendKeys(stAddress.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter street address" + e);
            }//end of try catch street address

            Thread.sleep(2000);

            //enter date of birth
            try {
                driver.findElement(By.xpath("//*[@id='dateOfBirth']")).sendKeys(doBirth.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter DOB" + e);
            }//end of try catch street address

            Thread.sleep(2000);

            //define the javascript executor
            JavascriptExecutor jse = (JavascriptExecutor) driver;

            try {
                //scroll into the webelement, we need to define continue button into webelement
                WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));

                //scroll into view of the continue button
                jse.executeScript("arguments[0].scrollIntoView(true);", contButton);
                Thread.sleep(2000);
                contButton.click();
            } catch (Exception e) {
                System.out.println("unable to click continue" + e);
            }//end of try catch continue

            Thread.sleep(2000);

            //assertTrue(driver.getTitle().contains("404"));
            //click continue again
            try {
                //scroll into the webelement, we need to define continue button into webelement
                WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
                contButton.click();
            } catch (Exception e) {
                System.out.println("unable to click continue" + e);
            }//end of try catch continue

            //select value for fire protection
            try{
            WebElement fireProtection = driver.findElement(By.xpath("//*[@id = 'fireProtectionAreaNameSelectId']"));
            Select fireProtectionDropDown = new Select(fireProtection);
            fireProtectionDropDown.selectByIndex(1);
        } catch (Exception e) {
            System.out.println("Unable to select Fire Protection from dropdown " + e);
        }//end of fire protection

            Thread.sleep(2000);

            //click continue again
            try {
                //scroll into the webelement, we need to define continue button into webelement
                WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
                contButton.click();
            } catch (Exception e) {
                System.out.println("unable to click continue" + e);
            }//end of continue button

            //capture personal info message
            try {
                String prsnlMessage = driver.findElement(By.xpath("//*[@class='sfx-pageDescription']")).getText();
                System.out.println("Personal message is " + prsnlMessage);
            }catch (Exception e) {
                System.out.println("unable to capture personal message " + e);
            }//end of personal message

            Thread.sleep(2000);

            //capture email info
            try {
                String emailMessage = driver.findElement(By.xpath("//*[@class='help-block']")).getText();
                System.out.println("Email info message is " + emailMessage);
            }catch (Exception e) {
                System.out.println("unable to capture email info message " + e);
            }//end of email message

            Thread.sleep(2000);

            //capture add applicant info
            try {
                String appMessage = driver.findElement(By.xpath("//*[@id='addApplicantDescription']")).getText();
                System.out.println("Application info message is " + appMessage);
            }catch (Exception e) {
                System.out.println("unable to capture application info message " + e);
            }//end of application message

            Thread.sleep(2000);

            //click on add co applicant
            try {
                //click on add co-op applicant
                driver.findElement(By.xpath("//*[@id = 'addApplicantModuleNewAdd']")).click();
            } catch (Exception e) {
                System.out.println("unable to click add applicant" + e);
            }//end of applicant info

            Thread.sleep(2000);

            //enter co first name
            try {
                driver.findElement(By.xpath("//*[@name ='additionalApplicants[0].client.firstName']")).sendKeys(appfirstName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter first name" + e);
            }//end of try catch for first name

            Thread.sleep(2000);

            //enter co last name
            try {
                driver.findElement(By.xpath("//*[@name= 'additionalApplicants[0].client.lastName']")).sendKeys(applastName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter last name" + e);
            }//end of try catch for last name

            Thread.sleep(2000);

            //click continue again
            try {
                //scroll into the webelement, we need to define continue button into webelement
                WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
                contButton.click();
            } catch (Exception e) {
                System.out.println("unable to click continue" + e);
            }//end of continue button

            //capture error message
            try {
                String errorMessage = driver.findElement(By.xpath("//*[@id='sfx_global_alert']")).getText();
                System.out.println("Error message is " + errorMessage);
            }catch (Exception e) {
                System.out.println("unable to capture error message " + e);
            }//end of error message

            Thread.sleep(2000);

            //click leave page
            try {
                //scroll into the webelement, we need to define continue button into webelement
                WebElement leaveButton = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-large']"));
                leaveButton.click();
            } catch (Exception e) {
                System.out.println("unable to click leave" + e);
            }//end of continue button

            try{
                WebElement xSurvey = driver.findElement(By.xpath("//*[@aria-label='Close Survey']"));
                xSurvey.click();
            }catch (Exception e){
                System.out.println("unable to close survey" +e);
            }//end of close survey
        }//end of for loop

        driver.quit();
        }//end of main
}//end of class
