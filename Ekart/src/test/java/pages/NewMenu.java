package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;
import locators.NewMenuLoc;

public class NewMenu extends Base{
	
	
	NewMenuLoc nl = new NewMenuLoc();
	
	
	public NewMenu() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, nl);
	}

	

	
}
