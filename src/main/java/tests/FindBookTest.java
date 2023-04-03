package tests;

import org.testng.annotations.Test;

import pageObjects.FindBookPage;
import pageObjects.MenuPage;
import utils.BaseTest;

public class FindBookTest extends BaseTest{
	
	@Test
	public void findBook() {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.searchField);
		
		FindBookPage book = new FindBookPage(driver);
		book.WriteinSearch("The story about me");
		
		
		
		
		
		
	}
	

}
