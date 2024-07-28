package PoiApiDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().browserVersion("").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String path ="C:\\Users\\ASUS\\eclipse-workspace\\mvnAndJenkinSession25\\Screenshot/abc.png";
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(temp, new File(path));

	}

}
