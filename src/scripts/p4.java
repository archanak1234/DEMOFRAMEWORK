package scripts;

import org.testng.annotations.Test;

import generic.basetest;
import generic.basetest1;
import generic.data;
import pom.actitimelogin;

public class p4 extends basetest1
{
	@Test
	public void pomactilogin()
	{
actitimelogin ob = new actitimelogin(driver);
	ob.setusename(data.getdata(excelpath, "sheet1", 0, 0));
	ob.setpassword(data.getdata(excelpath, "sheet1", 0, 1)); 
	ob.clicklogin();
	ob.titlewait("actiTIME - Enter Time-Trac");//fails the script to takes screenshot.
} 
}



