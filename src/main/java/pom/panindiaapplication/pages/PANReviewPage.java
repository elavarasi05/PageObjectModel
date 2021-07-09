package pom.panindiaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PANReviewPage extends GenericWrappers{
	public PANReviewPage(RemoteWebDriver driver ,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
	}

}
