package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageLoc {
	
	@FindBy(xpath="//button/span[text()='Place Order']") public WebElement placeorder;
	
	@FindBy(xpath="//button/span[text()='Place Order']") public WebElement remove;
	
	

}
