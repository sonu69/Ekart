package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;
import locators.CartPageLoc;

public class CartPage extends Base{
	
	CartPageLoc cl = new CartPageLoc();
	
	public CartPage() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, cl);
	}

	public OrderDetailPage proceedOrder() {
		cl.placeorder.click();
		return new OrderDetailPage();
	}
	
	
	
}
