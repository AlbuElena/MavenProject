package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleAuthorPage {
	
	public WebDriver driver ; 
	
	public By drama = By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 odd first inited']>div>div");
	public By biography = By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 even inited']>div>div");
	public By cookbooks = By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 odd inited']>div>div");
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public boolean dramaSkill() {
		return driver.findElement(drama).isDisplayed();
	}
	
	public boolean biography() {
		return driver.findElement(biography).isDisplayed();
	}
	
	public boolean cookbooks() {
		return driver.findElement(cookbooks).isDisplayed();
	}

}
