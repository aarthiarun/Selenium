package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupAutomationOrangeHrm {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();

		By favname = By.xpath("//input[@id='Form_getForm_subdomain']");
        textbox(favname).sendKeys("ammua");
		
		By fullname = By.xpath("//input[@id='Form_getForm_Name']");
		textbox(fullname).sendKeys ("Aarthi");

		By email = By.xpath("//input[@id='Form_getForm_Email']");
		textbox(email).sendKeys ("aaa@gmail.com");

		By phone = By.xpath("//input[@id='Form_getForm_Contact']");
		textbox(phone).sendKeys ("0000099999");

		// for country
		By country = By.xpath("//select[@id='Form_getForm_Country']");
		dropdown(country);
	}
		static WebElement textbox(By loc) {
			return driver.findElement(loc);
		}
		
		static void dropdown(By loc) {
			  Select value2 = new Select(textbox(loc));
			  value2.selectByValue("Argentina");
		}

}
