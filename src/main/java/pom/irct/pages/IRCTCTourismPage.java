package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IRCTCTourismPage extends GenericWrappers {
	public IRCTCTourismPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				 
	}
	public IRCTCTourismPage switchToIRCTCTourismPage()
	{
		switchToLastWindow();
		return this;
	}
	
	public GuestLoginPage clickOnLogin()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.Login.XPath"));
		return new GuestLoginPage(driver,test);
	}

	public IRCTCTourismPage enterDestination(String data)
	{
		enterByXpath(prop.getProperty("IRCTCTourismPage.Destination.XPath"), data);
		return this;
	}
	public IRCTCTourismPage clickOnCity()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.City.Xpath"));
		return this;
	}
	
	
	public IRCTCTourismPage clickCheckInDate()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckIn.XPath"));
		return this;
	}
	public IRCTCTourismPage clickDownArrow()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckinArrow.XPath"));
		return this;
	}
	public IRCTCTourismPage clickCheckinYear(String data)
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckinYear.XPath"),data);
		return this;
	}
	public IRCTCTourismPage clickCheckinMonth(String data)
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckinMonth.XPath"),data);
		return this;
	}
	public IRCTCTourismPage clickOnDate(String data)
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckinDate.Xpath"),data);
		return this;
	}
	public IRCTCTourismPage clickCheckOutDate()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckOut.XPath"));
		return this;
	}
	public IRCTCTourismPage clickoutDownArrow()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckoutArrow.XPath"));
		return this;
	}
	public IRCTCTourismPage clickCheckoutYear(String data)
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckoutYear.XPath"),data);
		return this;
	}
	public IRCTCTourismPage clickCheckoutMonth(String data)
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckoutMonth.XPath"),data);
		return this;
	}
	public IRCTCTourismPage clickoutDate(String data)
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.CheckoutDate.XPath"),data);
		return this;
	}
	public IRCTCTourismPage clickRoomsAndGuests()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.RoomsandGuests.XPath"));
		return this;
	}
	public IRCTCTourismPage selectRoom(String value)
	{
		selectValueByXpath(prop.getProperty("IRCTCTourismPage.Room.XPath"), value);
		return this;
	}
	public IRCTCTourismPage selectAdult(String value)
	{
		selectValueByXpath(prop.getProperty("IRCTCTourismPage.Adult.XPath"), value);
		return this;
	}
	public IRCTCTourismPage selectChild(String value)
	{
		selectValueByXpath(prop.getProperty("IRCTCTourismPage.Child.XPath"), value);
		return this;
	}
	public IRCTCTourismPage clickDone()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.Done.XPath"));
		return this;
	}
	public HotelListPage clickFindHotel()
	{
		clickByXpath(prop.getProperty("IRCTCTourismPage.FindHotel.XPath"));
		return new HotelListPage(driver,test);
	}
	public IRCTCTourismPage waitForSometime(int time)
	{
		waitProperty(time);
		return this;
	}
	
}

