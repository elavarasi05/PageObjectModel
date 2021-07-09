package pom.usvisaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class UsApplicationPage extends GenericWrappers{
	
	public UsApplicationPage(RemoteWebDriver driver ,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
	}
	
	
	public UsApplicationPage enterGivenName(String data)
	{
		enterByXpath(prop.getProperty("UsApplicationPage.GivenName.XPath"), data);
		return this;
	}
	public UsApplicationPage enterSurname(String data)
	{
		enterByXpath(prop.getProperty("UsApplicationPage.SurName.XPath"), data);
		return this;
	}
	public UsApplicationPage enterFullName(String data)
	{
		enterByXpath(prop.getProperty("UsApplicationPage.FullName.XPath"), data);
		return this;
	}
	public UsApplicationPage clickOtherNameUsed()
	{
		clickByXpath(prop.getProperty("UsApplicationPage.OtherNameUsed.XPath"));
		return this;
	}
	public UsApplicationPage enterEmailId(String data)
	{
		enterByXpath(prop.getProperty("UsApplicationPage.EmailId.XPath"), data);
		return this;
	}
	public UsApplicationPage enterConfirmEmailId(String data)
	{
		enterByXpath(prop.getProperty("UsApplicationPage.ConfEmail.XPath"), data);
		return this;
	}
	public UsApplicationPage clickAdditionalEmailYes()
	{
		clickByXpath(prop.getProperty("UsApplicationPage.AddEmailUsed.XPath"));
		return this;
	}
	public UsApplicationPage enterAddEmail(String data)
	{
		enterByXpath(prop.getProperty("UsApplicationPage.AddEmail.XPath"), data);
		return this;
	}
	public UsApplicationPage clickOnGender()
	{
		clickByXpath(prop.getProperty("UsApplicationPage.Gender.XPath"));
		return this;
	}
	public UsApplicationPage clickOnDoB()
	{
		clickByXpath(prop.getProperty("UsApplicationPage.DOB.XPath"));
		return this;
	}
	public UsApplicationPage SelectYear(String value)
	{
		selectValueByXpath(prop.getProperty("UsApplicationPage.Year.XPath"),value);
		return this;
	}
	public UsApplicationPage selectMonth(String value)
	{
		selectValueByXpath(prop.getProperty("UsApplicationPage.Month.XPath"), value);
		return this;
	}
	public UsApplicationPage clickDate(String data)
	{
		clickByXpath(prop.getProperty("UsApplicationPage.Date.XPath"),data);
		return this;
	}
	public UsApplicationPage waitForPageDown() {
		pagedown();
		return this;
	}
	public UsApplicationPage enterCityOfBirth(String data)
	{
		enterByXpath(prop.getProperty("UsApplicationPage.CityofBirth.XPath"), data);
		return this;
	}
	public UsApplicationPage enterStateOfBirth(String data)
	{
		enterByXpath(prop.getProperty("UsApplicationPage.StateofBirth.XPath"), data);
		return this;
	}
	public UsApplicationPage selectCountryOfBirth(String value)
	{
		selectValueByXpath(prop.getProperty("UsApplicationPage.CountryofBirth.XPath"), value);
		return this;
	}
	public UsApplicationPage selectNationality(String value)
	{
		selectValueByXpath(prop.getProperty("UsApplicationPage.Nationality.XPath"), value);
		return this;
	}
	public UsApplicationPage waitForNextButton(int time)
	{
		waitProperty(time);
		return this;
	}
	
	public UsApplicationPage clickPermResident()
	{
		clickByXpath(prop.getProperty("UsApplicationPage.PermResident.XPath"));
		return this;
	}
	public UsContactDetailsPage clickNextPage()
	{
		clickByXpath(prop.getProperty("UsApplicationPage.Next.XPath"));
		return new UsContactDetailsPage(driver,test);
	}
	

}
