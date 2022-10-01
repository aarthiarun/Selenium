package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDropdown {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/#dropdown-month-year");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("//*[@id='content']/iframe"));
	      driver.switchTo().frame(e);
	      
	      //automate dropdown calender using methods
	     // driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		By datepicker=By.xpath("//input[@id='datepicker']");
		By month=By.xpath("//select[@class='ui-datepicker-month']");
		getlocator(datepicker).click();
	      getSelMon(month);
	    }
	
	public static void getSelMon(By month){
		WebElement m=getlocator(month);
	
		Select s = new Select(m);
	     s.selectByVisibleText("Jan");
	}
	public static WebElement getlocator(By loc){
	return driver.findElement(loc);
		
	}  
	
	
	  //Explicit code    
//	      driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//        chooseDate();
//}
//
//	public static void chooseDate() {
//		 WebElement m = driver
//			      .findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
//			      Select s = new Select(m);
//			     s.selectByVisibleText("Jan");
//			    }
}