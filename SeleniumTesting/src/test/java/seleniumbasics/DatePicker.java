package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("datepicker")).click();
		//selectdate("18");
		futuredate("May 2024","23");
		}
	
	public static void futuredate(String expMonthYr, String date) {
		if(Integer.parseInt(date)> 31) {
			System.out.println("Wrong date");
			return;
		}
		if(expMonthYr.contains("February") && Integer.parseInt(date)>=29) {
			System.out.println("Wrong date");
			return;
		}
		
		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		while(!actMonthYear.equalsIgnoreCase(expMonthYr)) {
			//click on next
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

		}
		selectdate(date);
	
	}
	
	public static void selectdate(String date) {
		//driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		//or
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//tr//td//a"));
	for(WebElement a:dates) {
	String date1=a.getText();
	date1.equalsIgnoreCase(date);
	a.click();
		
	}
	}
		
}
