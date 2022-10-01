package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableDynamic {
	static WebDriver driver;
	public static void main(String[] args) {
		int numRow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println(numRow);
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		String a="//table[@id='table1']/tbody/tr[";
		String b="]/td[";
		String c="]";
		
		for(int i=2;i<=numRow;i++) {
			
			int numColumn=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+ i +"]/td")).size();
			System.out.println(numColumn);
			
			for(int j=1;j<=numColumn;j++){
				String Valuexpath= a+ i + b + j + c;
				String value=driver.findElement(By.xpath(Valuexpath)).getText();
				System.out.println(value);
			}
			
		}
		System.out.println("");
		  System.out.println("");
}}
