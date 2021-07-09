package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrRegistrationPage extends GenericWrappers{
	
	public FtrRegistrationPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	
	public FtrRegistrationPage switchToFtrRegistrationPage() {
		switchToLastWindow();
		return this;
	}
	
	public FtrRegistrationPage enterUserId(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.UserId.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.Password.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterCnfPassword(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.ConfirmPwd.XPath"), data);
		return this;
	}
	public FtrRegistrationPage selectSecQuestion(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.SecQuestion.XPath"), value);
		return this;
	}
	public FtrRegistrationPage enterSecAnswer(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.SecAnswer.XPath"), data);
		return this;
	}
	public FtrRegistrationPage clickOnDateOfBirth()
	{
		clickByXpath(prop.getProperty("FtrRegistrationPage.DateofBirth.XPath"));
		return this;
	}
	public FtrRegistrationPage selectYear(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.Year.XPath"), value);
		return this;
	}
	public FtrRegistrationPage selectMonth(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.Month.XPath"), value);
		return this;
	}
	public FtrRegistrationPage clickOnDate(String data)
	{
		clickByXpath(prop.getProperty("FtrRegistrationPage.Date.XPath"),data);
		return this;
	}
	public FtrRegistrationPage clickOnGender(String data)
	{
		clickByXpath(prop.getProperty("FtrRegistrationPage.Gender.XPath"),data);
		return this;
	}
	public FtrRegistrationPage clickOnMaritalStatus(String data)
	{
		clickByXpath(prop.getProperty("FtrRegistrationPage.MaritalStatus.XPath"),data);
		return this;
	}
	public FtrRegistrationPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.Email.XPath"), data);
		return this;
	}
	public FtrRegistrationPage selectOccupation(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.Occupation.XPath"), value);
		return this;
	}
	public FtrRegistrationPage enterFirstname(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.Firstname.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterMiddlename(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.Middlename.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterLastname(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.Lastname.XPath"), data);
		return this;
	}
	public FtrRegistrationPage selectNationality(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.Nationality.XPath"), value);
		return this;
	}
	public FtrRegistrationPage enterAddressFlatNo(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.AddressBlockNo.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterAddressStreet(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.AddressStreet.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterAddressArea(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.AddressArea.XPath"), data);
		return this;
	}
	public FtrRegistrationPage selectCountry(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.Country.XPath"), value);
		return this;
	}
	public FtrRegistrationPage enterMobileNumber(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.MobileNumber.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterPinCode(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.Pincode.XPath"), data);
		return this;
	}
	public FtrRegistrationPage selectCity(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.City.XPath"), value);
		return this;
	}
	public FtrRegistrationPage selectState(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.State.XPath"), value);
		return this;
	}
	public FtrRegistrationPage selectPostOffice(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.Postoffice.XPath"), value);
		return this;
	}
	public FtrRegistrationPage clickOnCommAdd(String data)
	{
		clickByXpath(prop.getProperty("FtrRegistrationPage.CommAddNo.XPath"),data);
		return this;
	}
	public FtrRegistrationPage enterDoorNo(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.AddDoorNo.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterStreetName(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.AddStreet.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterAreaName(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.AddArea.XPath"), data);
		return this;
	}
	public FtrRegistrationPage selectCountryOffice(String value)
	{
		selectValueByXpath(prop.getProperty("FtrRegistrationPage.AddCountry.XPath"), value);
		return this;
	}
	public FtrRegistrationPage enterMobileNumberOff(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.AddMobileNumber.XPath"), data);
		return this;
	}
	public FtrRegistrationPage enterPinCodeOff(String data)
	{
		enterByXpath(prop.getProperty("FtrRegistrationPage.AddPincode.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage waitForCityState(int time)
	{
		waitProperty(time);
		return this;
		
	}
	public FtrRegistrationPage waitForPagedown()
	{
		pagedown();
		return this;
	}
	
	
	

}
