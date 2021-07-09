package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	public CharterPage switchToCharterPage() {
		switchToLastWindow();
		return this;
	}
	
	public CharterPage clickEnquiryForm()
	{
		clickByXpath(prop.getProperty("CharterPage.Enquiry.XPath"));
		return this;
	}
	public CharterPage waitForLoad(int time)
	{
		waitProperty(time);
		return this;
	}
	public CharterPage waitForPagedown()
	{
		pagedown();
		return this;
	}
	public CharterPage enterApplicantName(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.ApplicantName.XPath"), data);
		return this;
	}
	public CharterPage enterOrganisationName(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.OrganisationName.XPath"), data);
		return this;
	}
	public CharterPage enterAddress(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Address.XPath"), data);
		return this;
	}
	public CharterPage enterMobileNumber(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.MobileNumber.XPath"), data);
		return this;
	}
	public CharterPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Email.XPath"), data);
		return this;
	}
	public CharterPage selectRequest(String value)
	{
		selectValueByXpath(prop.getProperty("CharterPage.Request.XPath"), value);
		return this;
	}
	public CharterPage enterOriginStation(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.OriginStation.XPath"), data);
		return this;
	}
	public CharterPage enterDestinStation(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.DestinStation.XPath"), data);
		return this;
	}
	public CharterPage clickDateDeparture()
	{
		clickByXpath(prop.getProperty("CharterPage.Depature.XPath"));
		return this;
	}
	public CharterPage selectDepYear(String value)
	{
		selectValueByXpath(prop.getProperty("CharterPage.DepYear.XPath"), value);
		return this;
	}
	public CharterPage enterDepMonth(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.DepMonth.XPath"), data);
		return this;
	}
	public CharterPage clickOnDepDate(String data)
	{
		clickByXpath(prop.getProperty("CharterPage.DepDate.XPath"),data);
		return this;
	}
	
	public CharterPage clickDateArrival()
	{
		clickByXpath(prop.getProperty("CharterPage.Arrival.XPath"));
		return this;
	}
	
	public CharterPage selectArrivalYear(String value)
	{
		selectValueByXpath(prop.getProperty("CharterPage.ArrivalYear.XPath"), value);
		return this;
	}
	public CharterPage clickOnArrivalDate(String data)
	{
		clickByXpath(prop.getProperty("CharterPage.ArrivalDate.XPath"),data);
		return this;
	}
	public CharterPage enterTourDuration(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.TourDuration.XPath"), data);
		return this;
	}
	public CharterPage enterCoachDetails(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.CoachDetails.XPath"), data);
		return this;
	}
	public CharterPage enterNumOfPassenger(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.NumOfPassenger.XPath"), data);
		return this;
	}
	public CharterPage enterCharterPurpose(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.CharterPurpose.Xpath"), data);
		return this;
	}
	public CharterPage enterAddiServices(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.AdditionalServices.XPath"), data);
		return this;
	}

}
