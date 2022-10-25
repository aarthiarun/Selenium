package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggTextUsingActionsClass {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement searchfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchfield.sendKeys("t");
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.sendKeys(searchfield, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		}}
