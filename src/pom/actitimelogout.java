package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.basepage;

public class actitimelogout extends basepage
{
@FindBy(id="logoutLink")
private WebElement logout;

  public actitimelogout(WebDriver driver) 
	 {
	  super(driver);
		 PageFactory.initElements(driver, this);
	 }

	public void clicklogout() 
	{
		this.logout.click();
	}
	
	public WebElement getlogout()
	{
		return logout;
	}
}
