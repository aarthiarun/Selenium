package seleniumbasics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipHandling {
	@Test
	public void tooltip() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String expected=driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("title");
		assertEquals("search", expected, "test passed");
}}
	