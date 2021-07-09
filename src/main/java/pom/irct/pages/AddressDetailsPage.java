package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AddressDetailsPage extends GenericWrappers{

	public AddressDetailsPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	public AddressDetailsPage enterResidentialAdd1(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.ResidentialAddress1.XPath"), data);
		return this;
	}
	public AddressDetailsPage enterResidentialAdd2(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.ResidentialAddress2.XPath"), data);
		return this;
	}
	public AddressDetailsPage enterResidentialAdd3(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.ResidentialAddress1.XPath"), data);
		return this;
	}
	public AddressDetailsPage enterPinCode(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.ResPincode.XPath"), data);
		return this;
	}
	public AddressDetailsPage enterResState(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.ResState.XPath"), data);
		return this;
	}
	public AddressDetailsPage selectResCity(String value)
	{
		selectValueByXpath(prop.getProperty("AddressDetailsPage.ResCity.XPath"), value);
		return this;
	}
	public AddressDetailsPage selectPostOffice(String value)
	{
		selectValueByXpath(prop.getProperty("AddressDetailsPage.Postoffice.XPath"), value);
		return this; 
	}
	public AddressDetailsPage enterPhoneNumber(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.Phonenumber.XPath"), data);
		return this;
	}
	public AddressDetailsPage clickOnDiffAddress(String data)
	{
		clickByXpath(prop.getProperty("AddressDetailsPage.DiffAddOption.XPath"),data);
		return this;
	}
	public AddressDetailsPage enterOffDoorNo(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.OfficeAddress1.XPath"), data);
		return this;
	}
	
	public AddressDetailsPage enterOffStreet(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.OfficeAddress2.XPath"), data);
		return this;
	}
	
	public AddressDetailsPage enterOffArea(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.OfficeAddress3.XPath"), data);
		return this;
	}
	public AddressDetailsPage clickSelectCountry()
	{
		clickByXpath(prop.getProperty("AddressDetailsPage.Country.XPath"));
		return this;
	}
	public AddressDetailsPage clickOnCountry(String data)
	{
		clickByXpath(prop.getProperty("AddressDetailsPage.SelCountry.XPath"),data);
		return this;
	}
	public AddressDetailsPage enterOffPincode(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.OffPincode.XPath"), data);
		return this;
	}
	public AddressDetailsPage enterOffState(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.OffState.XPath"), data);
		return this;
	}
	public AddressDetailsPage enterOffCity(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.OffCity.XPath"), data);
		return this;
	}
	public AddressDetailsPage enterOffPostoffice(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.OffPostoffice.XPath"), data);
		return this;
	}
	public AddressDetailsPage enterPhone(String data)
	{
		enterByXpath(prop.getProperty("AddressDetailsPage.OffPhone.XPath"), data);
		return this;
	}
	public AddressDetailsPage clickAgreeOnTerms()
	{
		clickByXpath(prop.getProperty("AddressDetailsPage.AgreeTerms.XPath"));
		return this;
	}
	public AddressDetailsPage waitForPagedown()
	{
		pagedown();
		return this;
	}
	public AddressDetailsPage waitForSometime(int time)
	{
		waitProperty(time);
		return this;
	}
	public AddressDetailsPage waitForTab()
	{
		tab();
		return this;
	}
}
