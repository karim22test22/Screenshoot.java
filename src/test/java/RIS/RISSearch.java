package RIS;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RISSearch {
    public static void Ris_Search() throws InterruptedException, IOException, CsvValidationException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\107\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Mazimize current window
        driver.manage().window().maximize();
        driver.get("http://52.4.57.48/RIS");


        //provide test data csv file
        String CSV_path = "D:\\Automation\\UltimaRis\\Create study Parameters .csv";

        CSVReader csvReader;
        String[] csvCell;


        // create an object of csvReader
        csvReader = new CSVReader(new FileReader(CSV_path));
        // TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //You can use while loop like below, It will be executed until the last line in CSV used.

        // user name
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[1]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[1]/div/div/input")).sendKeys("test11");
        // Password
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[3]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[3]/div/div/input")).sendKeys("Test1234");
        // click login
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[3]/div[1]/div[1]/input[1]")).click();


        Thread.sleep(700);
        // add New J.O.

        driver.findElement(By.xpath("//*[@id=\"NewJobOrder\"]")).click();
        while ((csvCell = csvReader.readNext()) != null){
            String patient_first = csvCell[0];
            String patient_last = csvCell[1];
            String patient_age = csvCell[2];
            // read first name
            driver.findElement(By.xpath("//*[@id=\"FName\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"FName\"]")).sendKeys(patient_first);
            // read lastname
            driver.findElement(By.xpath("//*[@id=\"LName\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"LName\"]")).sendKeys(patient_last);
            // read age
            driver.findElement(By.xpath("//*[@id=\"Age\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"Age\"]")).sendKeys(patient_age);
            // add and close
            driver.findElement(By.xpath("/html/body/div[5]/button[2]")).click();
        }


    }
}
