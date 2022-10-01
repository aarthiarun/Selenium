package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableStatic{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		int numRow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println(numRow);
		
		int numColumn=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[2]/td")).size();
		System.out.println(numColumn);
		
		String a="//table[@id='table1']/tbody/tr[";
		String b="]/td[";
		String c="]";
		for(int i=2;i<=numRow;i++) {
			for(int j=1;j<=numColumn;j++){
				String Valuexpath= a+ i + b + j + c;
				String value=driver.findElement(By.xpath(Valuexpath)).getText();
				System.out.println(value);
			}
			
		}
		System.out.println("");
		  System.out.println("");
}}
