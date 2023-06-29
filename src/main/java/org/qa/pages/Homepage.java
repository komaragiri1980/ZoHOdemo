package org.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.qa.base.TestBase;



public class Homepage extends  TestBase {
	
	
	
	@FindBy(xpath = "//li[@class='zh-productdropdown']//span[@class='pd-dp']")

	WebElement productslink;

	@FindBy(xpath = "//div[@class='zgh-nav active']//li[@class='codeUs']//a[normalize-space()='Enterprise']")

	WebElement Enterpriselink;

	@FindBy(linkText = "Customers")

	WebElement Customerslink;

	@FindBy(xpath = "//li[@class='nav-menu']//span[@class='pd-dp']")

	WebElement Companylink;
	 
	public Homepage() {

		PageFactory.initElements(driver, this);

	}

	public String verifytitle() {

		return productslink.getText();

	}

	public Productspage verifyproductslink() {

		productslink.click();

		return new Productspage();

	}
	
	public Enterprisepage verifyingEnterpriselink() {

		Enterpriselink.click();
	
		return new Enterprisepage();
	}
		public Customerspage verifyingCustomerslink () {

			productslink.click();

			return new Customerspage();
}
		}

