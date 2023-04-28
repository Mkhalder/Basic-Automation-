import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class XPathPractice {       //RelativeXpath

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicitlyWait(same page)
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[text()=\"First Name \"]/following-sibling::input[@name=\"name\"][1]")).sendKeys("Manotosh");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[text()=\"Last Name\"]/following-sibling::input[@name=\"name\"]")).sendKeys("Halder");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[text()=\"Email\"]/following-sibling::input[@type=\"text\"]")).sendKeys("manotosh.10@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[text()=\"Password\"]/following::input[@type=\"password\"][1]")).sendKeys("123456");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[text()=\"Repeat Password\"]/following-sibling::input[@type=\"password\"]")).sendKeys("123456");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(4000);
       // driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
       // Thread.sleep(4000);
       // driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("manotosh.10@gmail.com");
        //Thread.sleep(4000);
        //driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
        //Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()=\"YouTube Courses\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()=\"Selenium Practice\"]")).click();
        Thread.sleep(4000);
       // WebElement ele = driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Tutorials\"]"));
       // Actions action = new Actions(driver);
       // action.moveToElement(ele).perform();
        //Thread.sleep(4000);
        //driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Java\"]")).click();
        //Thread.sleep(4000);
        //driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Tutorials\"]")).click();
        //Thread.sleep(4000);
        WebElement e = driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Tutorials\"]"));
        Actions act = new Actions(driver);
        act.moveToElement(e).perform();
        Thread.sleep(4000);
       WebElement f= driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Testing\"]"));

        act.moveToElement(f).perform();
        driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Selenium\"]")).click();


    }
}
