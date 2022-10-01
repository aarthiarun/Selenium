package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDynamic {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/manager/addcustomerpage.php");
     	driver.manage().window().maximize();
     	 Thread.sleep(5000);
     	driver.findElement(By.xpath("//a[text()='New Customer']")).click();
     	 Thread.sleep(10000);
     	 
/*     	 //Below code print all the radio button values one by one
     	List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
     	for(int i=0;i<radio.size();i++)  {

     		WebElement gender_radio=radio.get(i);
     		String values=gender_radio.getAttribute("value");
     		System.out.println(values);
     		}
     	*/
     	
     	 
     	//Below code select the particular value.
     	List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
     	for(int i=0;i<radio.size();i++)  {

     		WebElement gender_radio=radio.get(i);
     		String value=gender_radio.getAttribute("value");
     	if (value.equalsIgnoreCase("f")) {
     		gender_radio.click();
     	}
     		}
}}





