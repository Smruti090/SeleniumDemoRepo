package TDDBaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    
    public static WebDriver driver;
    public static Properties prop;

    public void initializer() {  // Corrected method name
        WebDriverManager.chromedriver().browserVersion("126.0.6478.128").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Propertiesfile();  // Load the properties file
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    public void Propertiesfile() {
        prop = new Properties();
        String path = "./src/main/java/Config/Config.properties";
        try {
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("Config file is not found");
        } catch (IOException e) {
            System.out.println("Unable to read the config file");
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
