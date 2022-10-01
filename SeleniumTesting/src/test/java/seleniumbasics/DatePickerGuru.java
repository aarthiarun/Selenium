package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerGuru {
	public static void main(String [] args) throws Exception  {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(10000);
		 driver.get("https://demo.guru99.com/V4/manager/addcustomerpage.php");
	driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("05/03/2000");
}}
