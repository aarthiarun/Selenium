package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over {
	static WebDriver driver;

	public static void main(String [] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		 driver.get("https://demo.automationtesting.in/Register.html");
		 
		 Actions ac = new Actions(driver);
		WebElement more=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li//a[text()='More']"));
		ac.moveToElement(more).build().perform();
		driver.findElement(By.xpath("//a[text()='ProgressBar']")).click();
		
		}}

