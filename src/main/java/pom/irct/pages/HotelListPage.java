package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers{

	public HotelListPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	public HotelListPage switchToHotelListPage()
	{
		switchToLastWindow();
		return this;
	}
	public HotelSummaryPage clickOnFirstHotelName()
	{
		clickByXpath(prop.getProperty("HotelListPage.FirstHotel.XPath"));
		return new HotelSummaryPage(driver,test);
	}
	public HotelListPage waitForSometime(int time)
	{
		waitProperty(time);
		return this;
	}
}

