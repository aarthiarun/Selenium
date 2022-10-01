package testngFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgSample {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@Test(priority = 2)
	public void test1() {

		String s = driver.getTitle();
		System.out.println(s);
		Assert.assertEquals(s, "Google","Title is mismatched");

	}

	@Test(priority = 3)
	public void test3() {
		boolean b = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		Assert.assertTrue(b);
	}

	@Test(priority = 1)
	public void test2() {
		WebElement e = driver.findElement(By.xpath("//input[@name='q']"));
		boolean flag = e.isDisplayed();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}