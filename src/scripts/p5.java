package scripts;

import org.testng.annotations.Test;

import generic.basetest1;
import generic.data;
import pom.actitimelogin;
import pom.actitimelogout;

public class p5 extends basetest1
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
