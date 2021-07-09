package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrHomePage extends GenericWrappers{
	public FtrHomePage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	public FtrHomePage switchToFtrHomePage() {
		switchToLastWindow();
		return this;
	}
	
	
	
	
	public FtrRegistrationPage clickOnNewUserSignUp()
	{
		clickByXpath(prop.getProperty("FtrHomePage.NewuserSignup.XPath"));
		return new FtrRegistrationPage(driver,test);
	}
	

}
