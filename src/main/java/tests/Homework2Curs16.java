package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework2Curs16 extends BaseTest{
	
	@Test
	public void assertElements() {
		app.menu.navigateTo(app.menu.booksLink);
		app.shop.clickTheBook(app.shop.cookingWithLoveBook);
		assertTrue(app.cookingWithLove.FieldisDisplayed(app.cookingWithLove.magnifier));
		assertTrue(app.cookingWithLove.FieldisDisplayed(app.cookingWithLove.title));
		//assertTrue(app.cookingWithLove.FieldisDisplayed(app.cookingWithLove.rating)); // cartea 'Cooking with love' acum nu mai are rating
		assertTrue(app.cookingWithLove.FieldisDisplayed(app.cookingWithLove.price));
		assertTrue(app.cookingWithLove.FieldisDisplayed(app.cookingWithLove.shortDescription));
		assertTrue(app.cookingWithLove.FieldisDisplayed(app.cookingWithLove.quantity));
		assertTrue(app.cookingWithLove.FieldisDisplayed(app.cookingWithLove.addToCartButton));
		assertTrue(app.cookingWithLove.FieldisDisplayed(app.cookingWithLove.product));
		
	}

}
