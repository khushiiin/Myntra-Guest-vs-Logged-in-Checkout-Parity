package carts_rk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import utils.WaitUtils;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='Profile']")
	private WebElement profileIcon;

	public void clickProfileIcon() {
		profileIcon.click();
	}

	@FindBy(xpath = "//a[contains(text(),'login')]")
	private WebElement loginButton;

	public void clickLoginButton() {
		Actions action = new Actions(driver);
		action.moveToElement(profileIcon).perform();
		WaitUtils wait = new WaitUtils(driver);
		wait.waitForElementToBeVisible(loginButton);
		loginButton.click();
	}
	
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement mobileNumber;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;
	@FindBy(xpath = "//div[normalize-space()='CONTINUE']")
	private WebElement continueButton;
	public void fillLoginDetails(String mobileNo) {
		WaitUtils.waitForElementToBeVisible(mobileNumber);
		mobileNumber.clear();
		mobileNumber.sendKeys(mobileNo);
		checkBox.click();
		continueButton.click();
		
	}
}
