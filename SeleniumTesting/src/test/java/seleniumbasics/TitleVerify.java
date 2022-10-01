package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleVerify {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String name=driver.getTitle();
		System.out.println(name);
		if(name.equalsIgnoreCase("google")) {
			System.out.println("Title is correct");}
			else {
				System.out.println("Title is wrong");
			}

		String urlname=driver.getCurrentUrl();
		System.out.println(urlname);
		if(urlname.equalsIgnoreCase("https://www.google.com/")) {
			System.out.println("Title is correct");}
			else {
				System.out.println("Title is wrong");
			}
	}

}
