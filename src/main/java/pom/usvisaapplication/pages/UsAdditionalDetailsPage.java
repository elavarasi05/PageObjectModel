package pom.usvisaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class UsAdditionalDetailsPage extends GenericWrappers{
	public UsAdditionalDetailsPage(RemoteWebDriver driver ,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
	}
	
	public UsAdditionalDetailsPage enterLanguagesKnown(String data)
	{
		enterByXpath(prop.getProperty("UsAdditionalDetailsPage.LanguagesKnown.XPath"), data);
		return this;
	}
	public UsAdditionalDetailsPage clickClanYes() 
	{
		clickByXpath(prop.getProperty("UsAdditionalDetailsPage.ClanYes.XPath"));
		return this;
	}
	public UsAdditionalDetailsPage enterClanName(String data)
	{
		enterByXpath(prop.getProperty("UsAdditionalDetailsPage.ClanName.XPath"), data);
		return this;
	}
	public UsAdditionalDetailsPage selectMaritalStatus(String value)
	{
		selectValueByXpath(prop.getProperty("UsAdditionalDetailsPage.MaritalStatus.XPath"), value);
		return this;
	}
	public UsAdditionalDetailsPage clickOtherPersonTravel()
	{
		clickByXpath(prop.getProperty("UsAdditionalDetailsPage.OtherPersonTravel.XPath"));
		return this;
	}
	public UsAdditionalDetailsPage selectPurposeOfTrip(String value)
	{
		selectValueByXpath(prop.getProperty("UsAdditionalDetailsPage.PurposeofTrip.XPath"), value);
		return this;
	}
	
	public UsAdditionalDetailsPage selectAppliLanguage(String value)
	{
		selectValueByXpath(prop.getProperty("UsAdditionalDetailsPage.ApplicationLang.XPath"), value);
		return this;
	}
	public UsAdditionalDetailsPage clickOnTermsAgree()
	{
		clickByXpath(prop.getProperty("UsAdditionalDetailsPage.TermsAgree.XPath"));
		return this;
	}
	
}
