package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewMenuLoc {
	
	@FindBy(xpath="//span[@class='_2I9KP_' and text()='Electronics']") public WebElement electronics;
	
	@FindBy(xpath="//span[@class='_2I9KP_' and text()='TVs & Appliances']") public WebElement tvAppliances;
	
	@FindBy(xpath="//span[@class='_2I9KP_' and text()='Men']") public WebElement men;
	
	@FindBy(xpath="//a[@class='_2I9KP_' and text()='Flights']") public WebElement flights;

}
