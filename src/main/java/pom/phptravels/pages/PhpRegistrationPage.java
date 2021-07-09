package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpRegistrationPage extends GenericWrappers{
	//constructor-method same class and method name-for comp lack of inheritance
	public PhpRegistrationPage(RemoteWebDriver driver ,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
	}
		
			
	
	public PhpRegistrationPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Firstname.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Lastname.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterEmailAddress(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.EmailId.XPath"), data);
		return this;
	}
	public PhpRegistrationPage clickDialCode()
	{
		clickByXpath(prop.getProperty("PhpRegistrationPage.DialCode.XPath"));
				return this;
	}
	public PhpRegistrationPage clickOnCountry()
	{
		clickByXpath(prop.getProperty("PhpRegistrationPage.Country.XPath"));
		return this;
	}
	public PhpRegistrationPage enterPhoneNumber(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Phonenumber.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterCompanyName(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.CompanyName.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterStreetAddress(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.StreetAddress1.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterStreetAddress2(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.StreetAddress2.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterCity(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.City.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterState(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.State.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterPostCode(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Postcode.XPath"), data);
		return this;
	}
	public PhpRegistrationPage selectCountry(String value)
	{
		selectValueByXpath(prop.getProperty("PhpRegistrationPage.Country.XPath"), value);
		return this;
	}
	public PhpRegistrationPage selectSource(String value)
	{
		selectValueByXpath(prop.getProperty("PhpRegistrationPage.Source.XPath"), value);
		return this;
	}
	public PhpRegistrationPage enterMobileNumber(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Mobilenumber.XPath"), data);
		return this;
	}
	public PhpRegistrationPage waitForSometime(int time)
	{
		waitProperty(time);
		return this;
	}
	public PhpRegistrationPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Password.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterConfirmPassword(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.ConfPassword.XPath"), data);
		return this;
	}
	public PhpClientAreaPage clickOnRegister()
	{
		clickByXpath(prop.getProperty("PhpRegistrationPage.Register.XPath"));
		return new PhpClientAreaPage(driver,test);
	}
	
	

}
