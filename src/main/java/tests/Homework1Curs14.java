package tests;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
		ArrayList<WebElement> listaCarti = new ArrayList<>();
		listaCarti.add(driver.findElement(shop.booksByPrice));
		System.out.println(listaCarti.size());
		System.out.println(listaCarti.get(0));

		
		
	}

}
