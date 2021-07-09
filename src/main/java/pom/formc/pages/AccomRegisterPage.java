package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccomRegisterPage extends GenericWrappers{
	
	public AccomRegisterPage(RemoteWebDriver driver ,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
	}
	
public AccomRegisterPage enterUserName(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.Username.XPath"), data);
	return this;
}
public AccomRegisterPage enterPassword(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.Password.XPath"), data);
	return this;
}
public AccomRegisterPage enterConfirmPassword(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.ConfPassword.XPath"), data);
	return this;
}
public AccomRegisterPage selectSecQues(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.SecQuestion.XPath"), value);
	return this;
}
public AccomRegisterPage enterSecAns(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.SecAnswer.XPath"), data);
	return this;
}
public AccomRegisterPage enterName(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.Name.XPath"), data);
	return this;
}
public AccomRegisterPage selectGender(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.Gender.XPath"), value);
	return this;
}
public AccomRegisterPage enterDoB(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.DOB.XPath"), data);
	return this;
}
public AccomRegisterPage enterDesignation(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.Designation.XPath"), data);
	return this;
}
public AccomRegisterPage enterEmailId(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.EmailId.XPath"), data);
	return this;
}
public AccomRegisterPage enterMobileNumber(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.Mobilenumber.XPath"), data);
	return this;
}
public AccomRegisterPage enterPhoneNumber(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.Phonenumber.XPath"), data);
	return this;
}
public AccomRegisterPage selectNationality(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.Nationality.XPath"), value);
	return this;
}
public AccomRegisterPage enterAccomName(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.AccomName.XPath"), data);
	return this;
}
public AccomRegisterPage enterCapacity(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.Capacity.XPath"), data);
	return this;
}
public AccomRegisterPage enterAddress(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.Address.XPath"), data);
	return this;
}
public AccomRegisterPage selectState(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.State.XPath"), value);
	return this;
}
public AccomRegisterPage waitForCity(int time)
{
	waitProperty(time);
	return this;
}
public AccomRegisterPage selectForCity(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.City.XPath"), value);
	return this;
}
public AccomRegisterPage selectAccomodationType(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.AccomType.XPath"), value);
	return this;
}
public AccomRegisterPage selectAccomodationGrade(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.AccomGrade.XPath"), value);
	return this;
}
public AccomRegisterPage enterAccomEmailId(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.AccomEmailId.XPath"), data);
	return this;
}
public AccomRegisterPage enterAccomMobileNumber(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.AccomMobilenumber.XPath"), data);
	return this;
}
public AccomRegisterPage enterAccomPhoneNumber(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.AccomPhonenumber.XPath"), data);
	return this;
}
public AccomRegisterPage enterGuestDetails(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.GuestDetails.XPath"), data);
	return this;
}
public AccomRegisterPage enterGuestAddress(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.GuestAddress.XPath"), data);
	return this;
}
public AccomRegisterPage selectGuestState(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.GuestState.XPath"), value);
	return this;
}
public AccomRegisterPage selectGuestCity(String value)
{
	selectValueByXpath(prop.getProperty("AccomRegisterPage.GuestCity.XPath"), value);
	return this;
}
public AccomRegisterPage enterGuestEmail(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.GuestEmail.XPath"), data);
	return this;
}
public AccomRegisterPage enterGuestPhoneNumber(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.GuestPhone.XPath"), data);
	return this;
}
public AccomRegisterPage enterGuestMobileNumber(String data)
{
	enterByXpath(prop.getProperty("AccomRegisterPage.GuestMobile.XPath"), data);
	return this;
}
public AccomRegisterPage clickAdd()
{
	clickByXpath(prop.getProperty("AccomRegisterPage.Add.XPath"));
	return this;
}



}
