package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotCapturing {
	static WebDriver driver;
		
		@BeforeClass
		public void setUp() throws Exception {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		driver.get("https://google.com");
		
		}
		@AfterClass
		public void tearDown() throws Exception {
		driver.quit();
		}
		 
		@Test
		public void test() throws IOException {
		// Code to capture the screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Aarthi\\Desktop\\Screenshot Testing\\google.jpg"));
		}
		}

