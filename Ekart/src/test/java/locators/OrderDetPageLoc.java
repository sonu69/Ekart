package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetPageLoc {
	
	@FindBy(xpath="//div[contains(text(),'View all')]") public WebElement viewAllAdd;
	
	@FindBy(xpath="//p[@class='rPNEXT']/span[1]") public List<WebElement> name;
	
	@FindBy(xpath="//span[@class='_3mmRDy _2dQV-8']") public List<WebElement> phone;
	
	@FindBy(xpath="//span[@class='rPNEXT Br27Zz']/span") public List<WebElement> pincode;
	
	@FindBy(xpath="//button[text()='Deliver Here']") public WebElement deliverHere;
	
	@FindBy(xpath="//button[text()='CONTINUE']") public WebElement continueOrder;
	
	@FindBy(xpath="//button[text()='Accept & Continue']") public WebElement accept_Cont;
	
	@FindBy(css="._1P2-0f") public WebElement addAddress;
	
	

}
