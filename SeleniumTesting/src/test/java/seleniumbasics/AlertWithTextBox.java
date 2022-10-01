package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithTextBox {
	static WebDriver driver;

	public static void main(String [] args)  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		WebElement clickbutton2 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickbutton2.click();
		// ((JavascriptExecutor) driver).executeScript("arguments[0].click()",clickbutton2 );
		
		Alert promptalert = driver.switchTo().alert(); 
		System.out.println	(promptalert.getText());
		promptalert.sendKeys("ammuaarthi");
		promptalert.accept();
		//String value = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
		//System.out.println	(value);
		//alertbox.accept();
}}
