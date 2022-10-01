package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtablePrintRows {
	public class WebtableStatic {
		WebDriver driver ;
		public void main(String [] args)  {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize(); 
			
		
			//*[@id="customers"]/tbody/tr[2]/td[1]
			//*[@id="customers"]/tbody/tr[1]/td[1]
			//*[@id="customers"]/tbody/tr[2]/td[1]
			//*[@id="customers"]/tbody/tr[3]/td[1]
			int rowcount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
			
			
			String  bef="//*[@id='customers']/tbody/tr[";
			String afr="]/td[1]";
			
			for(int i=2;i<=rowcount;i++) {
				String xpath =bef+ i +afr;
				String text =driver.findElement(By.xpath(xpath)).getText();
				System.out.println(text);
			}}}

}

//table[@id='customers']//tr  --row
//table[@id='customers']//tr/td all column value