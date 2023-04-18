package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework1Curs16 extends BaseTest{
	
	@Test
	public void bookSendComment() {
	app.menu.hoverElement(app.menu.blogLink);
	app.menu.navigateTo(app.menu.classicLink);
	app.classic.navigateTo(app.classic.readMoreButton);
	app.booksForFamily.sendMessage("Comentariul meu", "Numele meu", "myemail@yahoo.com" ,"myURL");
	app.booksForFamily.sendComment(app.booksForFamily.sendComment);
	assertTrue(app.booksForFamily.responseIsDisplayed());
	}

}
