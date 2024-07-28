package mvnAndJenkinSession25.mvnAndJenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PoiApiDemo.poiDemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mod2Ass3 {
	WebDriver driver;
	
	@BeforeMethod
	public void Test1() {
			
	WebDriverManager.chromedriver().browserVersion("").setup();
	 driver = new ChromeDriver();
	
}
//	@Test(dataProvider = "getData")
	@Test(dataProvider = "getExcelData")
	public void Test2(String email , String password) {
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();
		
		
	}
	
	@AfterMethod
	public void Test3() {
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] getExcelData() {
	return poiDemo.getData();
		
	}
	
//	@DataProvider
//	public Object[][] getData() {
//		Object[][] data = new Object[3][2];
//		data[0][0] = "Admin";
//		data[0][1] = "Password";
//		
//		data[1][0]= "Smruti";
//		data[1][1] ="Smruti123";
//		
//		data[2][0] = "asdfg";
//		data[2][1] = "12tre";
//		
//		return data;
//		
//	}
	
}
