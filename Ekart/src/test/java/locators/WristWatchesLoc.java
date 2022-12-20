package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WristWatchesLoc {
	
	@FindBy(css="._2WkVRV") public List<WebElement> brands;
	
	@FindBy(css=".IRpwTa") public List<WebElement> watchModel;
	
	@FindBy(css="_30jeq3") public List<WebElement> watchPrice;
	
	@FindBy(css="input[placeholder='Search Brand']") public WebElement selBrand;
	
	@FindBy(xpath="//button[text()='Add to Cart']") public WebElement addToCart;
	
	@FindBy(xpath="//button[text()='GO TO CART']") public WebElement goToCart;
	
	
}
