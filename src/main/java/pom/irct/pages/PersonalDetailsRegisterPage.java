package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonalDetailsRegisterPage extends GenericWrappers{
	
	public PersonalDetailsRegisterPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}

	public PersonalDetailsRegisterPage enterFirstname(String data)
	{
		enterByXpath(prop.getProperty("PersonalDetailsRegisterPage.Firstname.XPath"), data);
		return this;
	}
	public PersonalDetailsRegisterPage enterMiddlename(String data)
	{
		enterByXpath(prop.getProperty("PersonalDetailsRegisterPage.Middlename.XPath"), data);
		return this;
	}
	public PersonalDetailsRegisterPage enterLastname(String data)
	{
		enterByXpath(prop.getProperty("PersonalDetailsRegisterPage.Lastname.XPath"), data);
		return this; 
	}
	public PersonalDetailsRegisterPage clickOnOccupation()
	{
		clickByXpath(prop.getProperty("PersonalDetailsRegisterPage.Occupation.XPath"));
		return this;
	}
	public PersonalDetailsRegisterPage clickOnEmployment(String data)
	{
		clickByXpath(prop.getProperty("PersonalDetailsRegisterPage.Employment.XPath"),data);
		return this;
	}
	public PersonalDetailsRegisterPage clickDateOfBirth()
	{
		clickByXpath(prop.getProperty("PersonalDetailsRegisterPage.DateOfBirth.XPath"));
		return this;
	}
	public PersonalDetailsRegisterPage selectYear(String value)
	{
		selectValueByXpath(prop.getProperty("PersonalDetailsRegisterPage.Year.XPath"), value);
		return this;
	}
	public PersonalDetailsRegisterPage selectMonth(String value)
	{
		selectValueByXpath(prop.getProperty("PersonalDetailsRegisterPage.Month.XPath"), value);
		return this;
	}
	public PersonalDetailsRegisterPage clickDate(String data)
	{
		clickByXpath(prop.getProperty("PersonalDetailsRegisterPage.Date.XPath"),data);
		return this;
	}
	public PersonalDetailsRegisterPage clickMaritalStatus(String data)
	{
		clickByXpath(prop.getProperty("PersonalDetailsRegisterPage.Maritalstatus.XPath"),data);
		return this;
	}
	public PersonalDetailsRegisterPage selectCountry(String value)
	{
		selectValueByXpath(prop.getProperty("PersonalDetailsRegisterPage.Country.XPath"), value);
		return this;
	}
	public PersonalDetailsRegisterPage clickGender(String data)
	{
		clickByXpath(prop.getProperty("PersonalDetailsRegisterPage.Gender.XPath"),data);
		return this;
	}
	public PersonalDetailsRegisterPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("PersonalDetailsRegisterPage.EmailId.XPath"), data);
		return this;
	}
	public PersonalDetailsRegisterPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("PersonalDetailsRegisterPage.Mobile.XPath"), data);
		return this;
	}
	public PersonalDetailsRegisterPage selectNationality(String value)
	{
		selectValueByXpath(prop.getProperty("PersonalDetailsRegisterPage.Nationality.XPath"), value);
		return this;
	}
	public AddressDetailsPage clickOnContinue()
	{
		clickByXpath(prop.getProperty("PersonalDetailsRegisterPage.Continue.XPath"));
		return new AddressDetailsPage(driver,test);
	}

}
