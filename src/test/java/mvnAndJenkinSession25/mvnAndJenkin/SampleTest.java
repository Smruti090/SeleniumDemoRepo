package mvnAndJenkinSession25.mvnAndJenkin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
    @Test
    public void testOne() {
        WebDriverManager.chromedriver().browserVersion("126.0.6478.127").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Find the element by id
        WebElement actualTestElement = driver.findElement(By.id("pah"));
        
        // Get the text of the element
        String actualText = actualTestElement.getText();
        System.out.println(actualText);
        
        // Compare the text with the expected value
        Assert.assertEquals(actualText, "PracticeAutomationHere");
        
        // Close the browser
        driver.quit();
    }
}
