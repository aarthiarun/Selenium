package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
//wait on non webelement =frame
public class WaitFrame {
	static WebDriver driver; 
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();
		By frname=By.xpath("//frame[@name='main']");
		driver=meth1(10,frname);
		String s=driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(s);
		driver.switchTo().defaultContent();
	}
	public static WebDriver meth1(int time, By loc)	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		 return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loc));
	}
}
