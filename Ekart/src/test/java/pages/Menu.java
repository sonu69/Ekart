package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;
import locators.MenuLoc;

public class Menu extends Base{
	
	MenuLoc ml = new MenuLoc();
	
	public Menu() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, ml);
	}
	
	
	public NewMenu selectMobile() {
		ml.mobile.click();
		return new NewMenu();
	}
	
	
	

}
