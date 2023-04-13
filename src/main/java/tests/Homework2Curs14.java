package tests;

import org.testng.annotations.Test;

import pageObjects.AudioPostPage;
import pageObjects.MenuPage;
import pageObjects.PostFormatsPage;
import utils.BaseTest;

public class Homework2Curs14 extends BaseTest{
	
	@Test
	public void slidere() {
		 
		MenuPage menu = new MenuPage(driver);
		PostFormatsPage postMenu = new PostFormatsPage(driver);
		AudioPostPage audioMenu =new AudioPostPage(driver);
		
		menu.hoverElement(menu.blogLink);
		menu.navigateTo(menu.postFormatsLink);
		
		postMenu.clickTo(postMenu.audioPost);
		
		audioMenu.clickTo(audioMenu.musicPlayButton);
		driver.findElement(audioMenu.musicSlider);
		audioMenu.dragAndDrop(audioMenu.musicSlider, 200, 0); 
		audioMenu.dragAndDrop(audioMenu.volumeSlider, -50, 0);
	}

}
