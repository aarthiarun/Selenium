package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		By country = By.xpath("//select[@name='Country']");
		doGetOptions(country, "india");
		System.out.println(getAllCountryName(country));

	}

	public static WebElement getElement(By loc) {
		return driver.findElement(loc);
	}

	static List<String> getAllCountryName(By loc) {
		Select s = new Select(getElement(loc));
		List<WebElement> ls = s.getOptions();
		List<String> optionsValList = new ArrayList<String>();
		for (WebElement e : ls) {
			String text = e.getText();
			optionsValList.add(text);
		}
		return optionsValList;
	}

	public static void doGetOptions(By loc, String countryname) {
		Select s = new Select(getElement(loc));
		List<WebElement> ls = s.getOptions();
		for (WebElement e : ls) {
			String text = e.getText();

			if (text.equalsIgnoreCase(countryname)) {
				e.click();
				break;
			}
		}
	}

}
