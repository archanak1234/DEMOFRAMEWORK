package pom;

import org.testng.annotations.Test;

import generic.basetest;

public class p5 extends basetest
{
	@Test
	
	
	public void logout()
	{
		actitimelogin ob = new actitimelogin(driver);
		ob.setusename("admin");
		ob.setpassword("manager"); 
		ob.clicklogin();
		
	 actitimelogout ob1 = new actitimelogout(driver);
	 ob1.elementvisibility(ob1.getlogout());
	ob1.clicklogout();
}
}