package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irct.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC007";
		testCaseDescription="To fill Enquiry Form ";
		author="Elavarasi";
		category="Smoke";
		browserName="chrome";
		appName="IRCTC";
		
	}
@Test
	public void charterEnquiry()  //couldnt select year and month
	{ 
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.switchToAccomodationPage()
		.clickOnSidebar()
		.clickOnCharter()
		.switchToCharterPage()
		.clickEnquiryForm()
		.waitForLoad(3000)
		.enterApplicantName("Elavarasi")
		.enterOrganisationName("TCS")
		.enterAddress("23,abc street")
		.enterMobileNumber("8220033070")
		.enterEmail("elavarasi05@gmail.com")
		.selectRequest("Saloon Charter")
		.enterOriginStation("Salem")
		.enterDestinStation("Bangalore")
		.clickDateDeparture()
		.waitForLoad(3000)
		
		
		.clickOnDepDate("25")
		.clickDateArrival()
		.waitForLoad(4000)
		
		
		
		.clickOnArrivalDate("30")
		.enterTourDuration("5")
		.enterCoachDetails("FirstClassAC")
		.enterNumOfPassenger("4")
		.enterCharterPurpose("Tourism")
		.enterAddiServices("Breakfast and Meals Included");
	}
	
}
