package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import base.Base;
import locators.MenuLoc;

public class HomePage extends Base{

	MenuLoc ml = new MenuLoc();

	public HomePage() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, ml);
	}

	public WatchListPage selectFashion() throws Exception {
		Thread.sleep(3000);
		act.moveToElement(ml.fashion).perform();
		Thread.sleep(1000);
		act.moveToElement(ml.watchesAcessories).perform();
		Thread.sleep(1000);
		ml.watches.click();
		return new WatchListPage();
	}
	
	public CartPage goToCartPage() {
		ml.cart.click();
		return new CartPage();
	}
	
	
	
}
