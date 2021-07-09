package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelSummaryPage extends GenericWrappers{
	public HotelSummaryPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	public HotelSummaryPage switchToHotelSummaryPage()
	{
		switchToLastWindow();
		return this;
	}
	public HotelSummaryPage waitForSometime(int time)
	{
		waitProperty(time);;
		return this;
	}
	
	public PassengerDetailPage clickOnContinueToBook()
	{
		clickByXpath(prop.getProperty("HotelSummaryPage.ContinueBook.XPath"));
		return  new PassengerDetailPage(driver,test);
	}
 }
