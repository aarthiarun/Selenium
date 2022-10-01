package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelect {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://jqueryui.com/selectmenu/");
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
		
		// Select value2=new Select (driver.findElement(By.xpath("//select[@id='speed']")));
		 Select value2=new Select (driver.findElement(By.xpath("//select[@id='Form_getForm_Country']")));
        value2.selectByIndex(1);
		
		 
}}
