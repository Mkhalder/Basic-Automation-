import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static WebDriver driver;// Setting

    public static void main(String[] args) throws InterruptedException {
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);
        String path = currentDir + "\\Resources\\chromedriver.exe";
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<String, Object>();
        //SET CHROME OPTIONS
        // 0-DEFAULT; 1- ALLOW; 2- BLOCK
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.get("https://chaldal.com");// Absolute XPath for Chaldal
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]")).click();//pharmacy page
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[3]")).click();//C00kups page
//        Thread.sleep(3000);
          driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys("egg");
          Thread.sleep(4000);
          driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys(Keys.ENTER);
          Thread.sleep(4000);
          driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/section/p")).click();//1click
          Thread.sleep(4000);
        //driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/div[2]/div/span[2]")).click();//2click
        //Thread.sleep(400);
          for(int i=0;i<4;i++) {
              driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/div[2]/button[2]")).click();//+button
        }
          Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys("Salt");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[2]/div[2]/div[1]/div/section")).click();
        Thread.sleep(4000);
        for(int i=0; i<2; i++){
            driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[2]/div[2]/div[1]/div/div[2]/button[2]")).click();//
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys("Potato");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[2]/div[2]/div[1]/div/section")).click();
        Thread.sleep(4000);
        for (int i=0; i<4; i++){
            driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[2]/div[2]/div[1]/div/div[2]/button[2]")).click();
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/div[4]/button")).click();
        Thread.sleep(400);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("mkhalder10@yahoo.com");
        Thread.sleep(400);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Rehan@12082020");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/section/div[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/div/button")).click();
        Thread.sleep(4000);
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/section/div/div/div/div/div/div/div[4]/div[2]/button/div/div[1]")).click();
//      Thread.sleep(4000);
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/section/div/div/div/div/div/div[2]/div[2]/a")).click();

    }
}