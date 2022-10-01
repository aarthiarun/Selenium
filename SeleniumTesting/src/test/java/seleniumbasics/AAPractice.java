package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AAPractice {
	@Test
public  void verifyTitle() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement txtbox=driver.findElement(By.xpath("//input[@name='q']"));
	txtbox.sendKeys("selenium java tutorial");
	txtbox.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//h3[text()='Selenium Tutorial - Guru99']")).click();
	String actualTitle=driver.getTitle();
	String expTitle="Selenium Tutorial";
	Assert.assertEquals(expTitle,actualTitle);
	Assert.assertNotEquals(actualTitle, expTitle);
}
}
