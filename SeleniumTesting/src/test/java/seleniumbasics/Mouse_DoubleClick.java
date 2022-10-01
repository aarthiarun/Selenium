package seleniumbasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_DoubleClick {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Thilak");
		WebElement button =driver.findElement(By.xpath("//input[@type='submit']"));
		act.doubleClick(button).build().perform();
		}}


