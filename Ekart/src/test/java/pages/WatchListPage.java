package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;
import locators.WristWatchesLoc;

public class WatchListPage extends Base	{

	WristWatchesLoc ww = new WristWatchesLoc();

	public WatchListPage() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, ww);
	}


	public void addProductToCart(String model) throws Exception {
		Thread.sleep(2000);
		for(int i=0;i<ww.brands.size();i++) {
			if(ww.watchModel.get(i).getText().contains(model)) {
				ww.watchModel.get(i).click();
				break;
			}
		}
	}

	public HomePage addProductToCart(String brand, String title) throws Exception {
		Thread.sleep(2000);
		String current = driver.getWindowHandle();
		for(int i=0;i<ww.brands.size();i++) {
			if(ww.brands.get(i).getText().equalsIgnoreCase(brand)) {
				ww.watchModel.get(i).click();
			}	
		}
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains(title)) {
				try{
					ww.addToCart.click();
				}
				catch(Exception e) {
					System.out.println();
				}
				try{
					ww.goToCart.click();
				}
				catch(Exception e) {
					System.out.println();
				}
				break;
			}			
		}
		driver.switchTo().window(current);
		return new HomePage();
	}



	public void selectBrand() {



	}

	public String getName() {

		return null;
	}

	public String getPrice() {

		return null;
	}

}
