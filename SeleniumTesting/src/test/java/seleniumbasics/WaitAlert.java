package seleniumbasics;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
//wait on alert
public class WaitAlert {

	static WebDriver driver; 
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		
	String name=getTextAlert(8);
	System.out.println(name);
    acceptAlert(5);
		//driver.switchTo().alert();
		//you don't have to switch to alert also
		
}
	public static Alert waitForAlert(int time) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
	return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static String getTextAlert(int time) {
		return waitForAlert(time).getText();
	}
	
	public static void acceptAlert(int time) {
		waitForAlert(time).accept();
	}
	public static void dismissAlert(int time) {
		waitForAlert(time).dismiss();
	}
	
	
// also write for send keys
}

