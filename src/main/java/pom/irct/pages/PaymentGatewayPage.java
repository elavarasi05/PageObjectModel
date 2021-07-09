package pom.irct.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PaymentGatewayPage extends GenericWrappers{
	public PaymentGatewayPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
				
	}
	public PaymentGatewayPage clickOnBankName()
	{
		clickByXpath("");
		return this;
	}
	public TransactionPage clickOnPayAndBook()
	{
		clickByXpath("");
		return new TransactionPage(driver,test);
	}

}
