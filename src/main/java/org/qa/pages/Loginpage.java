package org.qa.pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.qa.base.TestBase;

public class Loginpage extends TestBase{
	

	public Loginpage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Zoho.com")

	WebElement logo;

	@FindBy(linkText = "signUp")

	WebElement signupbutton;

	@FindBy(linkText = "Sign in")

	WebElement signinbutton;

	@FindBy(id = "login_id")

	WebElement username;

	@FindBy(id = "nextbtn")

	WebElement nextbutton;

	@FindBy(id = "password")

	WebElement password;
	
	@FindBy(id ="nextbtn")
	WebElement loginbutton;
	

			
	public  String validateloginpagetitle() {
		
		return driver.getTitle();
	
	}
	public boolean validatelogo() {
		return logo.isDisplayed();

	}
	
	
	public  Homepage login(String us, String pwd) throws IOException {
	
		signinbutton.click();
		
		username.sendKeys(us);
		
		 nextbutton.click();
		password.sendKeys(pwd);
		 loginbutton.click();
		return new Homepage(); 
		
	}
	
	
	
	
}

