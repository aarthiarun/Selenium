package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // for page load
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407"); // Testing webpage
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for Implicit wait

		JavascriptExecutor js = (JavascriptExecutor) driver; // Scrolling using JavascriptExecutor
		js.executeScript("window.scrollBy(0,380)");// Scroll Down to file upload button (+ve)
		Thread.sleep(3000);

		// FILE UPLOADING USING SENDKEYS ....

		WebElement browse = driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']"));
		// click on ‘Choose file’ to upload the desired file
		browse.sendKeys("C:\\Users\\Aarthi\\Desktop\\file1.txt"); // Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");

	}
}
