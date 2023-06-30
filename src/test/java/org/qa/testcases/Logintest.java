package org.qa.testcases;

import java.io.IOException;

import org.qa.base.TestBase;
import org.qa.pages.Homepage;
import org.qa.pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logintest extends TestBase {
	
	
	Loginpage loginpage;
	Homepage homepage;
	public Logintest() throws IOException  {
		
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException{
		
		initialization();
		loginpage= new Loginpage();
		
	}
		
	@Test(priority=1)
public void titleverification() {

	String acutaltitle=loginpage.validateloginpagetitle();
	
	Assert.assertEquals(acutaltitle, "Zoho | Cloud Software Suite for Businesses");

}

	@Test(priority=2)
public void imageverification() {
	
Boolean	logo=loginpage.validatelogo();

Assert.assertTrue(logo);
	
}

	@Test(priority=3)
public void loginverifcation() throws IOException {
	
homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}
	

	@AfterMethod
public void teardown() {
	driver.quit();
}
	
}
