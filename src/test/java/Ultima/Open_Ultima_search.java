package Ultima;

import Ark.ArkSegmentation;
import RIS.RISSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Open_Ultima_search {


    public static void main(String[] args) throws Exception {
       // ArkSegmentation.Ark_Segmentation();
        RISSearch.Ris_Search();
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\107\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Mazimize current window
        driver.manage().window().maximize();
        driver.get("http://52.204.37.247");


        //provide test data csv file
        // String CSV_path = "D:\\Automation\\Ultima-master\\Ultima-master\\TestData4.csv";

        // CSVReader csvReader;
        //  String[] csvCell;


        // create an object of csvReader
        //csvReader = new CSVReader(new FileReader(CSV_path));
        // TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //You can use while loop like below, It will be executed until the last line in CSV used.
        long Count;
        for (Count = 0; Count <= 500000000; Count++) {
            // user name
            driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[2]/div/div/input")).clear();
            driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[2]/div/div/input")).sendKeys("shoaib");
            // Password
            driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[4]/div/div/input")).clear();
            driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[4]/div/div/input")).sendKeys("Test1234");
            // click login
            driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[3]/div[1]/div[1]/input[1]")).click();
            // go to work list
            driver.findElement(By.xpath(" /html/body/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/input")).click();
            //Thread.sleep(700);
            int x;
            for (x = 0; x <= 100000000; x++) {
                Thread.sleep(3000);
                // search
                driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[2]/div[2]/div[4]/table[2]/tbody/tr/td[1]/a")).click();
                // click filter444
                //  driver.findElement(By.xpath("/html/body/div[1]/form/div[9]/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
                // select filter
                //  driver.findElement(By.xpath("/html/body/div[1]/form/div[9]/div[2]/div/div/div[2]/div/div/div/div/ul/li[2]/span")).click();
            }

            //click logout
            driver.findElement(By.xpath("//*[@id=\"ctl00_span_FullName\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"ctl00_lnk_SignOut\"]")).click();
            // print count
            System.out.println(Count);

        }

        System.out.println("500");

        // Take screen shoot


// close application

        //   Screenshoot.captureScreenshot(driver, "name of screenshot");
    }


}
