package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers {
	
	public AccomodationPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	
	public CovidVaccineAlertPage clickOnIRCTCHotels()
	{
		clickByXpath(prop.getProperty("AccomodationPage.IRCTCHotels.XPath"));
		return new CovidVaccineAlertPage(driver,test);
	}
	public AccomodationPage waitForSometime(int time)
	{
		waitProperty(time);
		return this;
	}
	
	public AccomodationPage switchToAccomodationPage() {
		switchToLastWindow();
		return this;
	}
	
	
	public AccomodationPage clickOnSidebar()
	{
		clickByXpath(prop.getProperty("AccomodationPage.Sidebar.XPath"));
		return this; 
	}
	public CharterPage clickOnCharter()
	{
		clickByXpath(prop.getProperty("AccomodationPage.Charter.XPath"));
		return new CharterPage(driver,test);
	}
	
	public FtrHomePage clickOnBookYourTrain()
	{
		clickByXpath(prop.getProperty("AccomodationPage.BookYourTrain.XPath"));
		return new FtrHomePage(driver,test);
	}
	
	public IRCTCTourismPage clickIRCTCHotels()
	{
		clickByXpath(prop.getProperty("AccomodationPage.IRCTCHotels.XPath"));
		return new IRCTCTourismPage(driver,test);
	}

}
