package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;
import locators.LoginPageLoc;

public class LoginPage extends Base{
	
	LoginPageLoc lp = new LoginPageLoc();
	
	public LoginPage() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, lp);
	}
	
	public HomePage doLogin(String username,String password) {
		lp.phoneNumber.sendKeys(username);
		lp.password.sendKeys(password);
		lp.loginSubmit.click();
		return new HomePage();
	}

}
