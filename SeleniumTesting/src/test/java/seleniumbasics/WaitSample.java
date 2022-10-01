package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
//wait on webelement(locators)
public class WaitSample {
	static WebDriver driver;
	public static void main(String[] args)  {
			
			WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.opencart.com/index.php?route=account/login");
			driver.manage().window().maximize();
			By email=By.xpath("//input[@id='input-email']");
			By pwd = By.xpath("//input[@id='input-password']");
			login(10,email).sendKeys("RON");
			WebElement e=getElement(pwd);
			e.sendKeys("abc@1");
			
	}
	public static WebElement login(int time, By loc) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}

	public static  WebElement getElement(By loc) {
		return  driver.findElement(loc);
}}
