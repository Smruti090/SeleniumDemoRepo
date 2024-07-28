package TDDFrameworkmain;

import org.openqa.selenium.By;

import TDDBaseClass.BaseClass;

public class TestPage extends BaseClass {
    
    public String getPageTitle() {
        return driver.getTitle();
    }
    
    public String ValidateLogin() {
        driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        return driver.getCurrentUrl();
    }
}
