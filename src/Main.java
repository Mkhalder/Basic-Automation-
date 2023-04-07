import org.openqa.selenium.By;
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
        System.setProperty("webdriver.chrome.driver",path);
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<String, Object>();
        //SET CHROME OPTIONS
        // 0-DEFAULT; 1- ALLOW; 2- BLOCK
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);
        driver= new ChromeDriver(options);
        driver.get("https://chaldal.com");
        Thread.sleep(4000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/section/div/div/div/div/section/div[2]/div/a[2]/div/div[1]/img")).click();

    }
}