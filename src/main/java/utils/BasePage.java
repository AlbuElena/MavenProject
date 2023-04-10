package utils;

import pageObjects.ContactsPage;
import pageObjects.MenuPage;
import pageObjects.ShopPage;

public class BasePage extends BaseTest {
	
	public MenuPage menu = new MenuPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactsPage contact = new ContactsPage(driver);
	
}
