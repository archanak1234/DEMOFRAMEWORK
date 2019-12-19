package scripts;


import org.testng.annotations.Test;

import generic.basetest;
import pom.actitimelogin;

 
public class p2 extends basetest 
{
	@Test
	public void pomactilogin()
	{
actitimelogin ob = new actitimelogin(driver);
	ob.setusename("admin");
	ob.setpassword("manager"); 
	ob.clicklogin();
	ob.titlewait("actiTIME - Enter Time-Track");
}
}