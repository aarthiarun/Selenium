package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorUsingMethod {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		
		By favName=By.xpath("//input[@id='Form_getForm_subdomain']");
		WebElement value = locmethod(favName);
		value.sendKeys("Ammu");
}
		
		static  WebElement locmethod(By favName){
		 return driver.findElement(favName);
		}
}



