package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertUsingMethods {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		By alertokclick = By.xpath("//button[@id='alertButton']");
		alertwithok(alertokclick);
		
		By alertokCancelclick = By.xpath("//button[@id='alertButton']");
		By getingtext = By.xpath("//div//span[@id='confirmResult']");
		alertwithokCancel(alertokCancelclick, getingtext);
	}

	static WebElement locmethod(By loc) {
		return driver.findElement(loc);
	}

	static void alertwithok(By alertokclick) {
		locmethod(alertokclick).click();
		Alert alertbox = driver.switchTo().alert();
		System.out.println(alertbox.getText());
		alertbox.accept();
	}

	static void alertwithokCancel(By alertokCancelclick, By gettingtext) throws Exception {
		locmethod(alertokCancelclick).click();
		Alert alertbox = driver.switchTo().alert();
		alertbox.dismiss();
		//Thread.sleep(3000);
		//System.out.println	(driver.findElement(By.xpath("//div//span[@id='confirmResult']")).getText());
		//System.out.println(locmethod(gettingtext).getText());
	}
}
