package utils;

import pageObjects.ContactsPage;
import pageObjects.MenuPage;
import pageObjects.PostFormatsPage;
import pageObjects.ShopPage;
import pageObjects.ClassicPage;
import pageObjects.BookRecommendationsForFamilyMembersPage;
import pageObjects.CookingWithLovePage;
import pageObjects.theWickedKingPage;

public class BasePage extends BaseTest {
	
	public MenuPage menu = new MenuPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactsPage contact = new ContactsPage(driver);
	
	public PostFormatsPage postFormats = new PostFormatsPage(driver);
	public ClassicPage classic = new ClassicPage(driver);
	public BookRecommendationsForFamilyMembersPage booksForFamily = new BookRecommendationsForFamilyMembersPage(driver);
	public CookingWithLovePage cookingWithLove = new CookingWithLovePage(driver);
	public theWickedKingPage king = new theWickedKingPage(driver);
	
}
