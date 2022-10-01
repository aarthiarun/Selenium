package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPagePixel {
	public static void main (String[]args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
	
	driver.manage().window().maximize();
	
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    WebElement Element=driver.findElement(By.xpath("//a[text()='VBScript']"));
   
   // js.executeScript("arguments[0].scrollIntoView();", Element);
    
	//expression for window scroll by pixel
    //js.executeScript("window.scrollBy(0,500)");
    //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    //Scroll horizontal till the element
    
    js.executeScript("arguments[0].scrollIntoView();", Element);
	}
}