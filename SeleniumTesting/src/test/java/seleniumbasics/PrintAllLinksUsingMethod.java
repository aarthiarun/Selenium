package seleniumbasics;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinksUsingMethod {
	static WebDriver driver;

	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		By tag1 = By.tagName("a");
		System.out.println(getLinks(tag1));

	}

	public static  List<WebElement> getElement(By tag1) {
		return driver.findElements(tag1);
	}

	public static List<String> getLinks(By tag1) {

		List<WebElement> links = getElement(tag1);
		List<String> al = new ArrayList();
		for (WebElement e : links) {
			String txt = e.getText();
			if (!txt.isEmpty()) {
				al.add(txt);
			}
		}
		return al;

	}}

