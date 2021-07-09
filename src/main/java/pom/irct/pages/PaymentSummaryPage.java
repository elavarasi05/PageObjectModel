package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PaymentSummaryPage extends GenericWrappers{
	public PaymentSummaryPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	
	public PaymentSummaryPage clickOnAgree()
	{
		clickByXpath(prop.getProperty("PaymentSummaryPage.AgreeOnTerms.XPath"));
		return this;
	}
	public OTPAlertPage clickMakePayment()
	{
		clickByXpath(prop.getProperty("PaymentSummaryPage.MakePayment.XPath"));
		return new OTPAlertPage(driver,test);
	}
	public PaymentSummaryPage switchToPaymentSummaryPage()
	{
		switchToLastWindow();
		return this;
	}

}
 