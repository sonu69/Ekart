package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;
import locators.OrderDetPageLoc;

public class OrderDetailPage extends Base{
	
	OrderDetPageLoc od = new OrderDetPageLoc();
	
	public OrderDetailPage() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, od);
	}
	
	public void selectAddress(String nameV,String pincodeV) throws InterruptedException {
		for(int i=0;i<od.name.size();i++){
			if(od.name.get(i).getText().equalsIgnoreCase(nameV) && od.pincode.get(i).getText().equalsIgnoreCase(pincodeV)){
				od.name.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		od.deliverHere.click();
		Thread.sleep(2000);
		od.continueOrder.click();
	}
	
	
	

}
