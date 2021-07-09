package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	public RegistrationPage waitForPagedown()
	{
		pagedown();
		return this;
	}
	public RegistrationPage waitForSometime(int time)
	{
		waitProperty(time);
		return this;
	}
	
	public RegistrationPage enterUserName(String data) 
	{
		enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), data);
		return this;
	}
	public RegistrationPage enterUserPassword(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), data);
		return this;
	}
	public RegistrationPage enterCnfPassword(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	public RegistrationPage clickPreferredLanguage()
	{
		clickByXpath(prop.getProperty("RegistrationPage.PrefLanguage.XPath"));
		return this;
	}
	public RegistrationPage clickOnLanguage(String data)
	{
		clickByXpath(prop.getProperty("RegistrationPage.language.XPath"),data);
		return this;
	}
	
	public RegistrationPage clickSecQues()
	{
		clickByXpath(prop.getProperty("RegistrationPage.SecQuestion.XPath"));
		return this;
	}
	public RegistrationPage clickOnQuestion(String data)
	{
		clickByXpath(prop.getProperty("RegistrationPage.SelectQuestion.XPath"),data);
		return this;
	}
	public RegistrationPage enterSecAnswer(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.SecAnswer.XPath"), data);
		return this;
	}
	public PersonalDetailsRegisterPage clickContinue()
	{
		clickByXpath(prop.getProperty("RegistrationPage.Continue.XPath"));
		return new PersonalDetailsRegisterPage(driver,test);
	}
	
	
}
