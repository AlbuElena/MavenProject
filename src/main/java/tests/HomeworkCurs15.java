package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class HomeworkCurs15 extends BaseTest{
	
	@Test
	public void test() throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor)driver;	
	WebElement blogElement = driver.findElement(app.menu.blogLink);
	WebElement test = driver.findElement(By.cssSelector("li[id = 'menu-item-232'] >a"));
	jse.executeScript(hoverJse(), blogElement);
			Thread.sleep(4000);
	jse.executeScript("arguments[0].click();", test);
	jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(app.postFormats.galleryElement));
	jse.executeScript("arguments[0].click();", driver.findElement(app.postFormats.galleryElement));
	jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector("textarea[id = 'comment']")));
	jse.executeScript("document.getElementById('comment').value='Comentariul meu2';");
	jse.executeScript("document.getElementById('author').value='Numele meu2';");
	jse.executeScript("document.getElementById('email').value='test@test.com';");
	jse.executeScript("document.getElementById('url').value='Website-ul meu4 ';");
	jse.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("input[id = 'send_comment']")));
	}
	
	public String hoverJse() {
		return "var objObject = document.createEvent('MouseEvents');" + 
			 "objObject.initMouseEvent('mouseover',true);" +
			 "arguments[0].dispatchEvent(objObject);";
	}
	
	
	
}
