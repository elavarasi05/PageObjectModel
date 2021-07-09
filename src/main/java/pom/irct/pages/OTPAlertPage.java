package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OTPAlertPage extends GenericWrappers{
	public OTPAlertPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	
	public OTPAlertPage enterOTP(String data)
	{
		enterByXpath(prop.getProperty("OTPAlertPage.OTP.XPath"), data);
		return this;
	}
	public OTPAlertPage clickVerify()
	{
		clickByXpath(prop.getProperty("OTPAlertPage.Verify.XPath"));
		return this;
	}
	public OTPAlertPage switchToOTPAlertPage()
	{
		switchToLastWindow();
		return this;
	}

} 
