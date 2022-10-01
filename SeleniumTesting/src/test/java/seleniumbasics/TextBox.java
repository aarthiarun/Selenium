package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {
	
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement txtbox=driver.findElement(By.xpath("//input[@name='q']"));
			txtbox.sendKeys("testing");
			txtbox.sendKeys(Keys.ENTER);
			WebElement lnk1=driver.findElement(By.xpath("//h3[text()='Top stories']"));
			lnk1.click();
}}
