package seleniumbasics;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithOkCancel {
	

		public static void main(String [] args)  {
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 driver.get("https://demoqa.com/alerts");
		WebElement clickbutton1 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click()",clickbutton1);
			clickbutton1.click();
		
			Alert alertbox1 = driver.switchTo().alert(); 
			System.out.println(alertbox1.getText());
			alertbox1.dismiss();
		//Thread.sleep(3000);
		//System.out.println	(driver.findElement(By.xpath("//div//span[@id='confirmResult']")).getText());
			
	}
	
	
}


