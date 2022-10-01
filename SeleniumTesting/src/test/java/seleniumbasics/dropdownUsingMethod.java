package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class dropdownUsingMethod {
	static WebDriver driver;

	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize(); 
		
		 By value5 = By.xpath("//select[@id='Form_getForm_Country']");
         func(value5,"Argentina");
	}
         
        static  void func(By value,String value1){
       Select value2=new Select (driver.findElement(value));
        value2.selectByValue(value1);
         }
}
