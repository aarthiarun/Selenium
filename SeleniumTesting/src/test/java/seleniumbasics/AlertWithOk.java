package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithOk {
	static WebDriver driver;

	public static void main(String [] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		WebElement clickbutton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickbutton.click();
		//This alert appeared after 5 seconds so our execution is paused for 6 seconds.
		Thread.sleep(6000);
		Alert alertbox = driver.switchTo().alert(); 
		System.out.println	(alertbox.getText());
		alertbox.accept();
}}
