package seleniumbasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDynamic {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

     //selecting single check box	 
    driver.switchTo().frame(0);
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='checkbox-1']"));
    checkbox.click();
	}}


