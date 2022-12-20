package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuLoc {
	
	@FindBy(xpath="//div[@class='xtXmba' and text()='Mobiles']") public WebElement mobile;

	@FindBy(xpath="//div[@class='xtXmba' and text()='Fashion']") public WebElement fashion;
	
	@FindBy(xpath="//div[@class='xtXmba' and text()='Electronics']") public WebElement electronics;
	
	@FindBy(xpath="//a/span[text()='Cart']") public WebElement cart;
	
	@FindBy(css=".exehdJ") public List<WebElement> profile;
	

	
	@FindBy(xpath="//a[text()='Watches and Accessories']") public WebElement watchesAcessories;
	
	@FindBy(xpath="//a[text()='Men & Women Watches']") public WebElement watches;
	
	@FindBy(xpath="") public WebElement laptopAccessories;
	
	@FindBy(xpath="") public WebElement mouse;
	
	@FindBy(xpath="//div[@class='xtXmba' and text()='Home']") public WebElement home;
	
	@FindBy(xpath="") public WebElement cleaningBath;
	
	@FindBy(xpath="") public WebElement liquidDetergent;

	@FindBy(xpath="") public WebElement more;
	
	

}
