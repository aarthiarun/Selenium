package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenPopup {
	static WebDriver driver;

	public static void main(String [] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	//Set the user name
	String username = "admin";
	
	//Set the password
	String password = "admin";
	
	//Syntax for authentication pop ups
	String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
	driver.get(URL);
	
//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	String title = driver.getTitle();
	
	System.out.println("The page title is "+title);
	
	String text = driver.findElement(By.tagName("p")).getText();
	System.out.println("The test present in page is ==> "+text);
}
}