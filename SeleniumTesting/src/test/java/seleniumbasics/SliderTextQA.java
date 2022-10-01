package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderTextQA {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/sliders/#Steps");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/slider/steps.html']"));
		
	  driver.switchTo().frame(s);
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(slider).dragAndDropBy(slider, 3, 0).build().perform();
}}

