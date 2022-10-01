package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datafilesPackage.Utili;



public class LoginPageFaceBook {
WebDriver driver;
	
@FindBy(xpath="//input[@name='firstname']")
WebElement fn;
@FindBy(xpath="//input[@name='lastname']")
WebElement ln;
@FindBy(xpath="//input[@name='reg_email__']")
WebElement ab;
@FindBy(xpath="//input[@name='reg_passwd__']")
WebElement pwd;
@FindBy(xpath="//select[@id='day']")
WebElement day;
@FindBy(xpath="//select[@id='month']")
WebElement mon;
@FindBy(xpath="//select[@id='year']")
WebElement year;


public LoginPageFaceBook(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
	public void firstName(String value) {
		fn.sendKeys(value);
	}
	public void lastName(String value) {
		ln.sendKeys(value);
	}
	public void Num(String value) {
		ab.sendKeys(value);
	}
	public void Pass(String value) {
		pwd.sendKeys(value);
	}
	
	public void Date() {
		Utili.dropDown(day,"22");
	}
	public void Mon() {
		Utili.dropDown(mon,"Apr");
	}
	public void yrs() {
		Utili.dropDown(year,"1990");
	}
	
	
	
	
}
