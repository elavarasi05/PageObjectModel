package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GuestLoginPage extends GenericWrappers{
	public GuestLoginPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	public GuestLoginPage switchToGuestLoginPage()
	{
		switchToLastWindow();
		return this;
	}
	
	public GuestLoginPage clickOnGuestUserLogin()
	{
		clickByXpath(prop.getProperty("GuestLoginPage.GuestLogin.XPath"));
		return this;
	}
	
	public GuestLoginPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("GuestLoginPage.Email.XPath"), data);
		return this;
	}
	 public GuestLoginPage enterMobileNumber(String data)
	 {
		 enterByXpath(prop.getProperty("GuestLoginPage.MobileNumber.XPath"), data);
		 return this;
	 }
	 
	 public IRCTCTourismPage clickOnSignIn()
	 {
		 clickByXpath(prop.getProperty("GuestLoginPage.Submit.XPath"));
		 return new  IRCTCTourismPage(driver,test);
	 }
	

}
