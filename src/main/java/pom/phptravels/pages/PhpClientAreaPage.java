package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpClientAreaPage extends GenericWrappers{

	public PhpClientAreaPage(RemoteWebDriver driver ,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		
	}
}
