package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerPractice {
	static WebDriver driver;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.findElement(By.id("datepicker")).click();
	
pastDate("April 2019","14");
//futureDate("March 2023","20");
	
}
public static void pastDate(String expMonYear, String expDate){
	if(Integer.parseInt(expDate)>31) {
		System.out.println("enter valid date");
		return;
	}
	if(expMonYear.contains("Febraury") && Integer.parseInt(expDate)>=29) {
		System.out.println("enter valid date");
		return;
	}
	//String defaultMonYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	String defaultMonYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	System.out.println(defaultMonYear);
	while(!expMonYear.equalsIgnoreCase(defaultMonYear)) {
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		 defaultMonYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	}
	selectDate(expDate);
	}

public static void futureDate(String expMonYear, String expDate){
	if(Integer.parseInt(expDate)>31) {
		System.out.println("enter valid date");
		return;
	}
	if(expMonYear.contains("Febraury") && Integer.parseInt(expDate)>=29) {
		System.out.println("enter valid date");
		return;
		
	}
	String defaultMonYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	System.out.println(defaultMonYear);
	while(!expMonYear.equalsIgnoreCase(defaultMonYear)) {
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		 defaultMonYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	}
	selectDate(expDate);
	}
 public static void selectDate(String date){
	 List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//tr//td//a"));
		for(WebElement a:dates) {
		String date1=a.getText();
		date1.equalsIgnoreCase(date);
		a.click();
			
 }
}}
