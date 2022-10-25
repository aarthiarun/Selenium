package seleniumbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoominZoomout {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;  //driver is embedded with java script executor to work on html code.
		
		jse.executeScript("document.body.style.zoom='200%'");//Zoom in
		jse.executeScript("document.body.styyle.zoom='50%'");//Zoom out
	//	jse.executeScript("document.body.style.zoom='100%'");//Default Browser value
		
}}

