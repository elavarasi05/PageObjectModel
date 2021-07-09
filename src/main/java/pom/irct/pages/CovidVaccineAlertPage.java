package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CovidVaccineAlertPage extends GenericWrappers{
	
	public CovidVaccineAlertPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	
	public IRCTCTourismPage clickOnOk()
	{
		clickByXpath(prop.getProperty("CovidVaccineAlertPage.OK.XPath"));
		return new IRCTCTourismPage(driver,test);
		
	}

	
}