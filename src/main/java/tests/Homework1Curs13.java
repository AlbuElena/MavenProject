package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.ShippingPage;
import utils.BaseTest;

public class Homework1Curs13 extends BaseTest {
	
	@Test (priority = 1)
	public void loginTest() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
	}

	@Test (priority = 2)
	public void navigateToShipping() {
		MenuPage menu = new MenuPage(driver);
		menu.hoverUserName();
		menu.selectAddresses(menu.addresses);
		menu.selectShippingAddress(menu.shippingAddress);
	}
	
	
	@Test (priority = 3)
	public void ShippingAddresses() {
		
		ShippingPage address= new ShippingPage(driver);	
		address.selectByIndex(41);				
		assertTrue(address.countryCanadaIsDisplayed());
		
		address.scrollDownByVisibilityOfProvince();
		address.selectByValue("NL");
		assertTrue(address.provinceNLIsDisplayed());
	
	}
	

	
}
