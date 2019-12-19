package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generic.basepage;

public class actitimelogin extends basepage

{
	WebDriver dummy;
	@FindBy(id="username")
	private WebElement username;

	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	
	public actitimelogin(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this); 
	}
	
	public void setusename(String un)
	{
		this.username.sendKeys(un);
	}
	
	public void setpassword(String pw)
	{
		this.password.sendKeys(pw);
	}
	
	public void clicklogin()
	{
		this.login.click();
	}
	
//	public void titlewait(String expected_title)
//	{
//		try
//		{
//			WebDriverWait wait=new WebDriverWait(dummy, 10);
//			wait.until(ExpectedConditions.titleIs(expected_title));
//			Reporter.log("pass:title is matching", true);
//		}
//		catch(Exception e)
//		{
//			Reporter.log("pass:title is matching", false);
//			Assert.fail();
//		}
//	}
}
