package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Parameters({"user", "pass"})
	@Test
	public void loginTest(String username, String password) {
		
		//assertTrue(false);
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp(username, password);
		//login.loginInApp("TestUser", "12345%67890");  -- asa era inainte de @Parameters
		
		assertTrue(login.successMsgisDisplayed());
	}

}
