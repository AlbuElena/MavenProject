package tests;

import org.testng.annotations.Test;

import pageObjects.ContactsPage;
import pageObjects.MenuPage;
import utils.BaseTest;
import java.util.List;
import java.util.ArrayList;


public class IFrameExample extends BaseTest {
	
	@Test
	public void iframeTest() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		ContactsPage contactPage = new ContactsPage(driver);
		
		menu.navigateTo(menu.contactsLink);
		contactPage.zoomMap(contactPage.zoomOutButton);
		
		Thread.sleep(2000);
		
		System.out.println("1 = " +driver.getWindowHandles());// ia id-urilor ferestrelor sau taburilor deschise si permite sa navigam (switch) prin ele
		contactPage.redirectMap();
		
		Thread.sleep(2000);
		System.out.println("2 = " + driver.getWindowHandles());
		
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		driver.close();
		
		
	}
	

}
