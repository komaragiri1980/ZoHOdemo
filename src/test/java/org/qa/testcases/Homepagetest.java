package org.qa.testcases;

import java.io.IOException;

import org.qa.base.TestBase;
import org.qa.pages.Homepage;
import org.qa.pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homepagetest extends TestBase {

	Loginpage loginpage;
	Homepage homepage;

	public Homepagetest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();
		loginpage = new Loginpage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();

	}
	
	@Test
	public void verifyinghomepagetiletest()
	{
	 
	String actualtitle= homepage.verifytitle();
	Assert.assertEquals(actualtitle, "Explore All Products | Zoho", "Title not matched");
			
	}
	
}

