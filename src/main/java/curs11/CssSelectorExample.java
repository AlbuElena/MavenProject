package curs11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorExample extends BaseTest {
	
	//@Test sau @Ignore
	public void cssSelectorTest() {
		
		//  # ---> id (deci # se fol doar pt id)
		//  #menu_user --> cauta orice elemnet care are id="menu_user"
		//  ul#menu_user --> e restrictionat un pic si cauta orice element UL care are id = "menu_user"
		//  ul[id="menu_user"] --> aceeasi cu cea de mai sus:cauta orice elem UL care are id = "menu_user"
		
		// # coincide cu [id=] in ultimele 2 exemple
		
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", loginMenu);
			
		// . --> este referinta catre atributul class
		//.logo_slogan --> cauta orice element care are calss = logo_slogan
		//div.logo_slogan --> cauta orice element DIV care are calss = logo_slogan
		//div[class="logo_slogan"] --> cauta orice element DIV care are calss = logo_slogan
		
		WebElement logo = driver.findElement(By.cssSelector("div.logo_slogan"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", logo);
		
		//urmatoarele 3 sunt acelasi lucru scrise in mod diferit
		//div.column-1_2 h3.sc_title
		//div[class = 'colum-1_2] h3.sc_title ----- nu o recomand pt ca e confuza.Dragos scrie cu [] ptca voi trece si style, href etc care nu sunt atribute
		//div[class = 'colum-1_2] h3[class = 'sc_title']
		
		WebElement inspireText = driver.findElement(By.cssSelector("div.column-1_2 h3.sc_title"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", inspireText);
		
		
		
		
	}
	
	
	@Test
	public void ccsSelector2() {
		
		//h3[class='sc_title sc_title_regular sc_align_center margin_bottom_tiny']
		//CSS Wildcards
		// * inseamna 'contains'
		// h3[class*='_tiny']
		
		//h3[class*='sc_title_reg']
		
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_reg']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", bookTitle);
		
		//~ inseamna contains word (deci nu pot da o bucata dintr-un cuvant ca la *
		WebElement bookTitle2 = driver.findElement(By.cssSelector("h3[class~='sc_title_regular']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle2);
		//^ starts with
		WebElement bookTitle3 = driver.findElement(By.cssSelector("a[href^='life']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle3);
		//$ adica se termina cu (ends with)
		WebElement bookTitle4 = driver.findElement(By.cssSelector("a[href$='nce']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle4);
		
		
	}

}
