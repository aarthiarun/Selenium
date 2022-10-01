package seleniumbasics;

import java.util.List;
//print all sentences from the why choose open cart?
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextList {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	 //driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/ul/li[@class=\"dropdown\"]")).click();	
	 List<WebElement> option = driver.findElements(By.xpath("//div[@class=\"well\"]/ul//li//a"));	
		 for(WebElement e:option) {
	           String txt=e.getText(); 	
	           System.out.println(txt);
}}}
