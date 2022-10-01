package seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AAlertPractice {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        
        driver.switchTo().frame("frame2");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
        
        
//        dropdown
    //    WebElement dropdown=driver.findElement(By.xpath("//select[@name='continents']"));
//        Select s=new Select(dropdown);
//        List<WebElement> ddvalue =s.getOptions();
//        		for (WebElement a : ddvalue) {
//			String values = a.getText();            
//			if (values.equalsIgnoreCase("North America")) {
//               Thread.sleep(3000);
//				a.click();
//				break;
//			}}

        
        
    //checkbox
	//	List<WebElement> suggestions = driver.findElements(By.xpath("//input[@name='tool']"));
//		for (WebElement a : suggestions) {
//			String values = a.getAttribute("value");
//            if (values.equalsIgnoreCase("Selenium IDE")) {
//               Thread.sleep(3000);
//				a.click();
//				break;
//			}}
		
	}}
