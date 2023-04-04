package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.FindBookPage;
import pageObjects.MenuPage;
import utils.BaseTest;

public class FindBookTest extends BaseTest{
	
	@Test (priority=1)
	public void findBook() {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.searchField);
		
		FindBookPage book = new FindBookPage(driver);
		book.clickSearchButton();	
		book.write("The story about me");
		book.search();
		book.loadMore();
		
		//assertTrue(book.findBook());
		book.clicktheBook();
		book.checkBookUrl();
		book.addToCart();
		assertTrue(book.responseAddToCartIsDisplayed());
		book.pressViewCart();
		book.checkViewCartUrl();
		
	}
		
	@Test (priority=2)
	public void updateCart() {
		
		CartPage cart = new CartPage(driver);
		cart.updateQuantity();
		cart.updateCart();
		cart.checkMessageIsDisplayed();
		cart.proceedToCheckout();
		
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.checkCheckoutUrl();
		checkout.billingDetailIsDisplayed();
		checkout.additionalInfoIsDisplayed();
		
		
	}
		
}
