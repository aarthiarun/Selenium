package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleSepWindow {
	static WebDriver driver;

	public static void main(String [] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		 driver.get("https://demo.automationtesting.in/Windows.html");
		 
		// driver.findElement(By.xpath("//a[@class='icon_pinterest']")).click();
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click ']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		String mainwindow = driver.getWindowHandle();

		for(String i:handles) {
			System.out.println(i);
			String title=driver.switchTo().window(i).getTitle();
			System.out.println(title);
			if(title.contains("Selenium")) {
				driver.close();
			}}
		driver.switchTo().window(mainwindow);
		driver.findElement(By.xpath("//a[text()='WebTable'] ")).click();
		
		}}
