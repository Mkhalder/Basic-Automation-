import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class RelativeXpath {
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
        driver.get("https://chaldal.com");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }
}
