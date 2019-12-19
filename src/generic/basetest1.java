package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class basetest1 implements autoconstant 
{
public WebDriver driver;
static
{
	System.setProperty(chromekey, chromevalue);
	System.setProperty(geckokey, geckovalue);
}

@Parameters("browser")
@BeforeMethod(alwaysRun=true)
public void precond(String br)
{
	if(br.equals("chrome"))
	{
		driver=new ChromeDriver();	
	}
	else if(br.equals("firefox"))
	{
		driver=new FirefoxDriver();	
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
}
@AfterMethod(alwaysRun=true)
public void postcond()   
{
	
	driver.close();
}


/*
//for screenshot program
@AfterMethod
public void postcond(ITestResult r)   
{
	String script_name = r.getMethod().getMethodName();
	int status = r.getStatus();
	if(status==2)
	{
		screenshot.getscreeshot(driver, script_name);
	}
	driver.close();
	*/
}

