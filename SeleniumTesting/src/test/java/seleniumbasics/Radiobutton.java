package seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
 		driver.get("https://www.spicejet.com/");
 		driver.manage().window().maximize();
 	System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());  
     driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();  
     System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());  
 }}
     	
     	 
     	 
     	 
     	 
		
	

