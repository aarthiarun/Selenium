package testngFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// precondition start with @Before annotation
//Postcondition start with @After annotation
//Test cases start with@Test annotation
public class TestngBasics {

	@BeforeSuite
	public void browserSetup() {
		System.out.println("Before suite:Browser setup");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Before Class:Browser launched");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Before Method:Login into the google");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before TEst");
	}

	@Test(priority = 0)
	public void googleTitleTest() {
		System.out.println("Priority0:Title verified");
	}

	@Test(priority = 1)
	public void checkingElement() {
		System.out.println("Priority1:All Elements displayed fine");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After TEst");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("After Method:Logout from google");
	}

	@AfterClass
	public void deleteallCookies() {
		System.out.println("After Class:Deleted all the cookies");
	}

	@AfterSuite
	public void tearDown() {
		System.out.println("After suite:Browser is closed");
	}

}
