package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot 
{
public static void getscreeshot(WebDriver driver,String script_name)
{
	TakesScreenshot t=(TakesScreenshot)driver;
	File src=t.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/"+script_name+".png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) 
	{
		
	}
}
}
