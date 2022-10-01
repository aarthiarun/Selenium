package seleniumbasics;
//get all the list of auto suggestions from chrome.and if contain expected value ,click it.

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionTesting {
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("naveen automation");
		Thread.sleep(2000);
		List<WebElement> lsss =driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span"));	
		
		for(WebElement a: lsss) {
			String text= a.getText();
			System.out.println(text);
			if(text.contains("youtube")) {
				a.click();
				break;
			}}}}
