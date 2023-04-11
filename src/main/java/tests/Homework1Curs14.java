package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.ShopPage;
import utils.BaseTest;

public class Homework1Curs14 extends BaseTest {
	
	@Test
	public void checkPrice() {
		
		MenuPage menu = new MenuPage(driver);
		ShopPage shop = new ShopPage(driver);
		
		menu.navigateTo(menu.shopLink);
		shop.selectByValue("price");
	
		//System.out.println(Float.parseFloat(shop.bookPrice(shop.cheaperBook)));
		//System.out.println(Float.parseFloat(shop.bookPrice(shop.expensiveBook)));
		assertTrue(Float.parseFloat(shop.bookPrice(shop.cheaperBook))<Float.parseFloat(shop.bookPrice(shop.expensiveBook)) );
	
	}

}
