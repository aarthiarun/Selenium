package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	static WebDriver driver;

	public static void main(String [] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		 driver.get("https://www.globalsqa.com/demo-site/");
		 
		// driver.findElement(By.xpath("//a[@class='icon_pinterest']")).click();
		driver.findElement(By.xpath("//a[@class='icon_linkedin']")).click();
		driver.findElement(By.xpath("//a[@class='icon_google']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		
		//parent window is url
		String parentid=it.next();
		System.out.println(parentid);
		
		String linid=it.next();
		System.out.println(linid);
		String gid=it.next();
		System.out.println(gid);
		
		driver.switchTo().window(linid);
		Thread.sleep(2000);
		System.out.println( driver.getTitle());
		driver.close();
		driver.switchTo().window(parentid);
		
		driver.switchTo().window(gid);
		Thread.sleep(2000);
		System.out.println( driver.getTitle());
		driver.close();
		driver.switchTo().window(parentid);
		
		Thread.sleep(2000);
		System.out.println( driver.getTitle());
		
		
}}
