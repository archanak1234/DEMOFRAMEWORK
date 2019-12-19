package scripts;

import org.testng.annotations.Test;

import generic.basetest;
import generic.data;
import pom.actitimelogin;

public class p3 extends basetest 
	{
		@Test
		public void pomactilogin()
		{
	actitimelogin ob = new actitimelogin(driver);
		ob.setusename(data.getdata(excelpath, "sheet1", 0, 0));
		ob.setpassword(data.getdata(excelpath, "sheet1", 0, 1)); 
		ob.clicklogin();
		ob.titlewait("actiTIME - Enter Time-Track");
	}
	}
