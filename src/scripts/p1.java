package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.basetest;

public class p1 extends basetest 
{
@Test
public void actitimeloginscript()
{
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButtonContainer")).click();
}
}