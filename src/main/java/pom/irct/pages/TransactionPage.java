package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TransactionPage extends GenericWrappers{
	public TransactionPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	public TransactionPage clickOnCardOptions()
	{
		clickByXpath("");
		return this;
	}
	public TransactionPage enterCardNumber(String data)
	{
		enterByXpath("", data);
		return this;
	}
	public TransactionPage selectMonth(String value)
	{
		selectValueByXpath("", value);
		return this;
	}
	public TransactionPage selectYear(String value)
	{
		selectValueByXpath("", value);
		return this;
	}
	public TransactionPage enterCVV(String data)
	{
		enterByXpath("", data);
		return this;
	}
	public PaymentConfirmationPage clickMakePayment()
	{
		clickByXpath("");
		return new PaymentConfirmationPage(driver,test);
	}
	

}
