package carts_rk;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class LoginPageTest extends BaseTest{
	private LoginPage login;

	@BeforeClass
	public void initPage() {
		login = new LoginPage(DriverFactory.getDriver());
	}

	@Test(priority = 1)
	public void clickProfileIconTest() {
		login.clickProfileIcon();
	}
	
	@Test(priority = 2)
	public void clickLoginButtonTest() {
		login.clickLoginButton();
	}
	
	@Test(priority = 3)
	public void fillLoginDetailsTest() {
		String mobileNumber="9303890608";
		login.fillLoginDetails(mobileNumber);
	}
}
