package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PassengerDetailPage extends GenericWrappers{
	
	public PassengerDetailPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				 
	}
	
	
	public PassengerDetailPage selectTitle(String value)
	{
		selectValueByXpath(prop.getProperty("PassengerDetailPage.Title.XPath"), value);
		return this;
	}
	public PassengerDetailPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PassengerDetailPage.FirstName.XPath"), data);
		return this;
	}
	public PassengerDetailPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PassengerDetailPage.LastName.XPath"), data);
		return this;
	}
	public PassengerDetailPage selectCountry(String value)
	{
		selectValueByXpath(prop.getProperty("PassengerDetailPage.Country.XPath"), value);
		return this;
	}
	public PassengerDetailPage selectState(String value)
	{
		selectValueByXpath(prop.getProperty("PassengerDetailPage.State.XPath"), value);
		return this;
	}
	public PassengerDetailPage enterMobileNumber(String data)
	{
		enterByXpath(prop.getProperty("PassengerDetailPage.MobileNumber.XPath"), data);
		return this;
	}
	public PassengerDetailPage enterEmailId(String data)
	{
		enterByXpath(prop.getProperty("PassengerDetailPage.EmailId.XPath"), data);
		return this;
	}
	public PassengerDetailPage selectGST(String value)
	{
		selectValueByXpath(prop.getProperty("PassengerDetailPage.GST.XPath"), value);
		return this;
	}
	public PaymentSummaryPage clickOnGo()
	{
		clickByXpath(prop.getProperty("PassengerDetailPage.Go.XPath"));
		return new PaymentSummaryPage(driver,test);
		
	}
	public PassengerDetailPage switchToPassengerDetailPage()
	{
		switchToLastWindow();
		return this;
	}

}
