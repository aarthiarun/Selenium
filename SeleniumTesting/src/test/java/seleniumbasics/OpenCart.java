package seleniumbasics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("aarthi04");
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Aarthi");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Nehrumohan");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("aaa@gmail.com");
		Select drpCountry = new Select(driver.findElement(By.name("country_id")));
		drpCountry.selectByVisibleText("Antarctica");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Nehrumohan");
		driver.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]"));
		
		
}
}