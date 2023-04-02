package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import pageObjects.ContactsPage;
import pageObjects.MenuPage;
import utils.BaseTest;

public class ContactsTest extends BaseTest{
	
	
	@Test
	public void MessageContacts() throws IOException {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		
		InputStream inputStream = new FileInputStream("testing");
		Properties file = new Properties() ;
		file.load(inputStream);
		
		ContactsPage message = new ContactsPage(driver);
		
		//message.SendMessage(file.getProperty(Name), file.getProperty(Name), file.getProperty(Name), file.getProperty(Name));
		
	}

}
