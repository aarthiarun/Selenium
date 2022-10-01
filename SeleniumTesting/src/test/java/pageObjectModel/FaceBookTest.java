package pageObjectModel;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import datafilesPackage.Utili;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTest extends Utili {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get(getpropvalue("URL"));  //already done
	}	
		@Test(priority=1)
		public void Testcase1() throws Exception {
		LoginPageFaceBook lg = new LoginPageFaceBook(driver);
	//	lg.firstName("Thilak");
		lg.firstName(getExceldata("Fb", 1, 0));
		lg.lastName(getExceldata("Fb", 1, 1));
		Thread.sleep(2000);
		lg.Num(getExceldata("Fb", 1, 2));
		
		lg.Pass(getExceldata("Fb", 1, 3));
		
		lg.Date();
		lg.Mon();
		lg.yrs();
		}	
		
		
		@AfterMethod
		public void clos() {
			//driver.close();
		}
		 
}
