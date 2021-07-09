package pom.panindiaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanHomePage extends GenericWrappers{
	
	public PanHomePage(RemoteWebDriver driver ,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
	}
	
	

		public PanHomePage selectTitle(String value)
	{
		selectValueByXpath(prop.getProperty("PanHomePage.Title.XPath"),value);
		return this;
	}
	public PanHomePage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.Firstname.XPath"), data);
		return this;
	}
	public PanHomePage enterMiddleName(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.Middlename.XPath"), data);
		return this;
	}
	public PanHomePage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.Lastname.XPath"), data);
		return this;
	}
	public PanHomePage enterFatherFname(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.FatherFirstname.XPath"), data);
		return this;
	}
	public PanHomePage enterFatherMname(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.FatherMiddlename.XPath"), data);
		return this;
	}
	public PanHomePage enterFatherLname(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.Fatherlastname.XPath"), data);
		return this;
	}
	public PanHomePage enterMobileNumber(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.Mobilenumber.XPath"), data);
		return this;
	}
	public PanHomePage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.Email.XPath"), data);
		return this;
	}
	public PanHomePage selectSourceOfIncome(String value)
	{
		selectValueByXpath(prop.getProperty("PanHomePage.SourceofIncome.XPath"), value);
		return this;
	}
	public PanHomePage enterDateOfBirth(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.DOB.XPath"), data);
		return this;
	}
	public PanHomePage waitForAddress(int time)
	{
		waitProperty(time);
		return this;
	}
	public PanHomePage enterHouseNumber(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.AddHouseNo.XPath"), data);
		return this;
	}
	public PanHomePage enterStreet(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.AddStreet.XPath"), data);
		return this;
	}
	public PanHomePage enterCity(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.AddCity.XPath"), data);
		return this;
	}
	public PanHomePage selectState(String value)
	{
		selectValueByXpath(prop.getProperty("PanHomePage.AddState.XPath"), value);
		return this;
	}
	public PanHomePage enterPinCode(String data)
	{
		enterByXpath(prop.getProperty("PanHomePage.AddPincode.XPath"), data);
		return this;
	}
	public PanHomePage selectCountry(String value)
	{
		selectValueByXpath(prop.getProperty("PanHomePage.Country.XPath"), value);
		return this;
	}
	public PanHomePage selectIdentityProof(String value)
	{
		selectValueByXpath(prop.getProperty("PanHomePage.IdentityProof.XPath"), value);
		return this;
	}
	public PanHomePage selectAddressProof(String value)
	{
		selectValueByXpath(prop.getProperty("PanHomePage.AddressProof.XPath"), value);
		return this;
	}
	public PanHomePage selectDOBProof(String value)
	{
		selectValueByXpath(prop.getProperty("PanHomePage.DOBproof.XPath"), value);
		return this;
	}
	public PanHomePage selectAAdharProof(String value)
	{
		selectValueByXpath(prop.getProperty("PanHomePage.AAdharProof.XPath"),value);
		return this;
	}
	public PanHomePage waitForPageDown()
	{
		pagedown();
		return this;
	}
	public PanHomePage clickAgreeOnTerms()
	{
		clickByXpath(prop.getProperty("PanHomePage.AgreeOnTerms.XPath"));
		return this;
	}
	
	public PANReviewPage clickOnNext()
	{
		clickByXpath(prop.getProperty("PanHomePage.Next.XPath"));
		return new PANReviewPage(driver,test);
	}
}
