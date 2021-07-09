package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class ProjectWrappers extends GenericWrappers{
	public String browserName;
	public String appName;
	
	@BeforeSuite
	public void beforeSuite()
	{
		startReport();
	}
	
	@BeforeTest
	public void beforeTest()
	{
		loadObjects();
	}
	
	 		
	@BeforeMethod
	public void beforeMethod()
	{
		startTest(testCaseName, testCaseDescription);
		switch (appName) {
		case "PHPtravels":
			invokeApp(browserName, "https://www.phptravels.org");
			break;
		case "IRCTC":
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;
		case "PANindia":
			invokeApp(browserName, "https://panind.com/india/new_pan/");
			break;
		case "FormC":
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
		case "USvisa":
			invokeApp(browserName, "https://www.onlineusvisa.com/basic-details/in?origin=home&country=in&type=N#");
			break;
		case "FTRIRCTC":
			invokeApp(browserName,"https://www.ftr.irctc.co.in/ftr/");
			break;
		case "Charter":
			invokeApp(browserName, "https://www.irctctourism.com/charter");
			break;
		default:
			System.err.println("Please provide valid Application Name");
			break;
		}
		
		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		//closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass()
	{
		endTest();
	}

	@AfterTest
	public void afterTest()
	{
		
		unloadObjects();
	}

	@AfterSuite
	public void afterSuite()
	{
		endReport();
	}
}

