package pom.usvisaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class UsContactDetailsPage extends GenericWrappers{
	
	public UsContactDetailsPage(RemoteWebDriver driver ,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
	}

	public UsContactDetailsPage enterStreetAddress(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.StreetAddress1.XPath"), data);
		return this;
	}
	public UsContactDetailsPage enterStreetAddress2(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.StreetAddress2.XPath"), data);
		return this;
	}
	public UsContactDetailsPage enterCity(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.City.XPath"), data);
		return this;
	}
	public UsContactDetailsPage enterState(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.State.XPath"), data);
		return this;
	}
	public UsContactDetailsPage enterPostZip(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.PostZip.XPath"), data);
		return this;
	}
	public UsContactDetailsPage clickDialCode()
	{
		clickByXpath(prop.getProperty("UsContactDetailsPage.DialCode.XPath"));
		return this;
	}
	public UsContactDetailsPage waitForCountryClick(int time)
	{
		waitProperty(time);
		return this;
		
	}
	public UsContactDetailsPage clickDialCountry(String data)
	{
		clickByXpath(prop.getProperty("UsContactDetailsPage.DialCountry.XPath"),data);
		return this;
	}
	public UsContactDetailsPage enterPhoneNumber(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.PhoneNumber.XPath"), data);
		return this;
	}
	public UsContactDetailsPage waitForPageDown() 
	{
		pagedown();
		return this;
	}
	public UsContactDetailsPage clickOtherPhoneYes()
	{
		clickByXpath(prop.getProperty("UsContactDetailsPage.OtherPhoneYes.XPath"));
		return this;
	}
	public UsContactDetailsPage enterOtherPhoneNumber(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.OtherPhonenumber.XPath"), data);
		return this;
	}
	public UsContactDetailsPage selectCountryOfResidence(String value)
	{
		selectValueByXpath(prop.getProperty("UsContactDetailsPage.CountryofRes.XPath"), value);
		return this;
	}
	public UsContactDetailsPage selectStateOfResidence(String value)
	{
		selectValueByXpath(prop.getProperty("UsContactDetailsPage.StateofRes.XPath"), value);
		return this;
	}
	public UsContactDetailsPage clickNoSameMailaddress()
	{
		clickByXpath(prop.getProperty("UsContactDetailsPage.MailAddDiff.XPath"));
		return this;
	}
	public UsContactDetailsPage enterMailStreet(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.MailStreet1.XPath"), data);
		return this;
	}
	public UsContactDetailsPage enterMailStreet2(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.MailStreet2.XPath"), data);
		return this;
	}
	public UsContactDetailsPage enterMailingCity(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.MailCity.XPath"), data);
		return this;
	}
	public UsContactDetailsPage enterMailingState(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.MailState.XPath"), data);
		return this;
	}
	
	public UsContactDetailsPage enterMailingZip(String data)
	{
		enterByXpath(prop.getProperty("UsContactDetailsPage.MailZip.XPath"), data);
		return this;
	}
	
	public UsContactDetailsPage selectMailingCountry(String value)
	{
		selectValueByXpath(prop.getProperty("UsContactDetailsPage.MailCountry.XPath"), value);
		return this;
	}
	public UsAdditionalDetailsPage clickOnNext()
	{
		clickByXpath(prop.getProperty("UsContactDetailsPage.ContactNext.XPath"));
		return new UsAdditionalDetailsPage(driver,test);
	}
}
