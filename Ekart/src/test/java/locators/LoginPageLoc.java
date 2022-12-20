package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLoc {
	
	@FindBy(xpath="//span[text()='Enter Email/Mobile number']/../../input") public WebElement phoneNumber;
	
	@FindBy(xpath="//span[text()='Enter Password']/../../input") public WebElement password;
	
	@FindBy(xpath="//button/span[text()='Login']") public WebElement loginSubmit;
	
	@FindBy(xpath="//button[text()='✕']") public WebElement closeDialogueBox;

}
