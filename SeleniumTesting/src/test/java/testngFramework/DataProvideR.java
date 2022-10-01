package testngFramework;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import datafilesPackage.Utili;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvideR extends Utili {
		
		public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();     
		
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get(getpropvalue("URL"));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(getExceldata("Fb", 1, 0));
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(getExceldata("Fb", 1, 1));
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(getExceldata("Fb", 1, 2));
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(getExceldata("Fb", 1, 3));
		}}