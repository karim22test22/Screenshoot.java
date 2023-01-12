package Ark;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArkSegmentation {


    public static void Ark_Segmentation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\107\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Mazimize current window
        driver.manage().window().maximize();
        driver.get("http://192.168.5.187");


        //provide test data csv file
        // String CSV_path = "D:\\Automation\\Ultima-master\\Ultima-master\\TestData4.csv";

        // CSVReader csvReader;
        //  String[] csvCell;


        // create an object of csvReader
        //csvReader = new CSVReader(new FileReader(CSV_path));
        // TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //You can use while loop like below, It will be executed until the last line in CSV used.

        // user name
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[2]/div/div/input")).sendKeys("Taha");
        // Password
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[4]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[1]/div[4]/div/div/input")).sendKeys("Taha1234");
        // click login
        driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[3]/div[1]/div[1]/input[1]")).click();
        // go to work list
        driver.findElement(By.xpath(" /html/body/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/input")).click();
        Thread.sleep(700);
        long Count;
        for ( Count =0;Count<=500000000;Count ++) {
            // search
            driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[2]/div[2]/div[4]/table[2]/tbody/tr/td[1]/a")).click();
            // click filter
            //  driver.findElement(By.xpath("/html/body/div[1]/form/div[9]/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
            // select filter
            //  driver.findElement(By.xpath("/html/body/div[1]/form/div[9]/div[2]/div/div/div[2]/div/div/div/div/ul/li[2]/span")).click();



        }
        System.out.println("500");

              /* int Counter = 1;
        while ((csvCell = csvReader.readNext()) != null) {

             /*
            if (   Counter >= 500 )
            {

            }else   {

            }
            */


        //  String Patient_id = csvCell[0];
/*

            // enter Patient id
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[2]/div[1]/div[2]/input")).clear();
            //driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[2]/div[1]/div[2]/input")).sendKeys(Patient_id);

            // search
            driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[2]/div[2]/div[4]/table[2]/tbody/tr/td[1]/a")).click();


            // scroll down
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollBy(0,350)", "");


            // double click
            Thread.sleep(5000);
            WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/form/div[10]/div[2]/div/div[3]/div[1]/div[3]/div[3]/div/table/tbody/tr[2]/td[1]"));
            Actions act = new Actions(driver);
            act.doubleClick(ele).perform();
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));


            // click ARK
            Thread.sleep(8000);
            driver.findElement(By.xpath("//*[@id=\"ARKButton\"]")).click();


            //click Normal Study? no


            //explicit wait - to wait for the compose button to be click-able
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div")));


            Thread.sleep(7000);
            // Normal >> no
            driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[3]/div/div/div[2]/div[2]")).click();
// Logic
            // Answer yes
            // driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div/div/div/div/div/div/div[1]/div[2]")).click();

            // Answer No
             driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[4]/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]")).click();

// OCQ
            // Answer yes
            driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]")).click();

            // Answer No
            //driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]")).click();

// Numeric

            // Answer 2
            driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div[1]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div[1]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div[1]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div[1]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div[1]")).click();

            //driver.findElement(By.xpath("//*[@id=\"pnlGenFindingForm\"]/div/div/div/div[3]/div/div/div/div")).sendKeys("5");

            // drop down
            // select one
            //       driver.findElement(By.xpath("//*[@id=\"dx-65e9e128-9714-c696-64f5-63d0be3bcaee\"]/div[1]/div/div[1]/div[2]/div[1]/div")).click();
            // select two
            //driver.findElement(By.xpath("//*[@id=\"dx-2c8e525b-ba5e-d130-6dab-19049d77380f\"]/div[1]/div/div[1]/div[2]/div[2]/div")).click();
            // select three
            // driver.findElement(By.xpath("//*[@id=\"dx-2c8e525b-ba5e-d130-6dab-19049d77380f\"]/div[1]/div/div[1]/div[2]/div[3]/div")).click();

            //*[@id="dx-2c8e525b-ba5e-d130-6dab-19049d77380f"]/div[1]/div/div[1]/div[2]/div[2]/div


            // completed
            driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/div/div[1]/div[1]/div/div/div/div/span")).click();
            System.out.println("The Counter is " + Counter + " and Patient-id  "+Patient_id);
            Counter++;

            // Switch to tap 0
            driver.close();

            driver.switchTo().window(tabs2.get(0));

// Take screen shoot


// close application
        }*/
        //   Screenshoot.captureScreenshot(driver, "name of screenshot");
    }


}
