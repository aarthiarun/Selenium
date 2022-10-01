package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//get all the list of auto suggestions from chrome.

public class TextAutoSuggestion {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
    Thread.sleep(3000);
   List<WebElement> option= driver.findElements(By.xpath("//ul[@role='listbox']//ul/li//div[@class='wM6W7d']/span"));
    
   for(WebElement e:option) {
           String txt=e.getText(); 	
           System.out.println(txt);
           
    }
    

}
	
	
}