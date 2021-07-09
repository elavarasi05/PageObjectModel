package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{
	
	public CovidAlertPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	public HomePage clickOnOk() {
		clickByXpath(prop.getProperty("CovidAlertPage.Ok.XPath"));
		return  new HomePage(driver,test);
	}
	
	
	
	
	
	

}
