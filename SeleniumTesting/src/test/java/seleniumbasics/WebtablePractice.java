package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtablePractice {
	static WebDriver driver ;
	public static void main(String [] args) throws Exception  {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		int rowcount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		for(int i=2;i<=rowcount;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+ i +"]/td["+ j +"]")).getText());
			}
		}
		
}}

//table[@id='customers']//tr/td