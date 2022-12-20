package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLoc {
	
	@FindBy(xpath="//a/span[text()='Cart']") private WebElement cart;
	
	@FindBy(xpath="") private WebElement profile;
	
	@FindBy(xpath="") private WebElement more;
	
	

}
