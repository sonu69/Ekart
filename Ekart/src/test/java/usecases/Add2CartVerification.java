package usecases;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderDetailPage;
import pages.WatchListPage;

public class Add2CartVerification {
	
	@Test(enabled=true)
	public void verifyAddingCart() throws Exception {
		
		LoginPage lp = new LoginPage();
		HomePage hp = lp.doLogin("9905040207", "sonu3791");
		WatchListPage wl=hp.selectFashion();
		hp = wl.addProductToCart("FOSSIL","BQ1126");
		CartPage cp= hp.goToCartPage();
		OrderDetailPage od = cp.proceedOrder();
		od.selectAddress("Tushare Vats", "110018");
	}
	
	

}
