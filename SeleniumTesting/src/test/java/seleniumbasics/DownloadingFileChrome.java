package seleniumbasics;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadingFileChrome {
	@Test
	public void  downloading() throws Exception {

		ChromeOptions options = new ChromeOptions();
		String downloadPath = System.getProperty("user.dir"); // download path of current directory where file should
																// download

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath); // Location where to download

		options.setExperimentalOption("prefs", chromePrefs);
		// the above 4 line of code for downloading on particular location.

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='ZIP file']")).click();

		// the below code are for assert checking.

		String filePathUpdated = downloadPath + "\\DownloadDemo-master.zip";
		File file = new File(filePathUpdated);
		
		Thread.sleep(20000);
		Assert.assertTrue(file.exists());
	if (file.exists()) {
		file.delete();
	}
	}
}
