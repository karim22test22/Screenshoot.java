package Ultima;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v106.browser.Browser;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.time.Duration;


public class OpenUrl {


    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\107\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Mazimize current window
        driver.manage().window().maximize();
        driver.get("http://192.168.5.108");


        //provide test data csv file
        String CSV_path = "D:\\Automation\\Ultima-master\\Ultima-master\\TestData.csv";

        CSVReader csvReader;
        String[] csvCell;


        // create an object of csvReader
        csvReader = new CSVReader(new FileReader(CSV_path));
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //You can use while loop like below, It will be executed until the last line in CSV used.

        // user name
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[2]/div/div/input")).sendKeys("test");
        // Password
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[4]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[4]/div/div/input")).sendKeys("Test1234");
        // click login
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[3]/div[1]/div[1]/input[1]")).click();

        while ((csvCell = csvReader.readNext()) != null) {

            String Patient_id = csvCell[0];

           /*
           try {
                // click Worklist
                driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/input")).click();

            }catch (Exception e) {

                System.out.println("Exception while click worklist " + e.getMessage());
            }
            */

            // enter Patient id
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[2]/div[1]/div[2]/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[2]/div[1]/div[2]/input")).sendKeys(Patient_id);

            // search
            driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[2]/div[2]/div[4]/table[2]/tbody/tr/td[1]/a")).click();


            // scroll down
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollBy(0,350)", "");
            // select account type
            //driver.wait(100);
            // driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/form/div[6]/div/div/span/span[1]/span/span[1]")).click();
            // click select one type
            //driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[3]")).click();
            // click not robot
            //driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();

            // double click
            Thread.sleep(5000);
            WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[3]/div[1]/div[3]/div[3]/div/table/tbody/tr[2]/td[1]"));
            Actions act = new Actions(driver);
            act.doubleClick(ele).perform();
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));


                // click ARK
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"ARKButton\"]")).click();


            //click Normal Study? no

           /* //explicit wait - to wait for the compose button to be click-able
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div")));
*/
            //driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div")).click();
            Thread.sleep(5000);
            // Normal >> no
            driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[3]/div/div/div[2]/div[2]")).click();

            // Answer
            driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[4]/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]")).click();

            // completed
            driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/div/div[1]/div[1]/div/div/div/div/span")).click();
            System.out.println("the Patient-id is " + Patient_id);

            // Switch to tap 0
            driver.close();

            driver.switchTo().window(tabs2.get(0));

// Take screen shoot


// close application
        }
        Screenshoot.captureScreenshot(driver, "name of screenshot");
    }


}
