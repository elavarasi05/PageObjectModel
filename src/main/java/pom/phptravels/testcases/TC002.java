package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpHomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC002";
		testCaseDescription="To register for PHP Travels";
		author="Elavarasi";
		category="Smoke";
		browserName="chrome";
		appName="PHPtravels";
		
	}
	
	@Test
	public void phpTravelsRegistration()//passed all
	{
		new PhpHomePage(driver,test)
		.clickOnRegister()
		.enterFirstName("Elavarasi")
		.enterLastName("Anbalagan")
		.enterEmailAddress("elavarasi05@gmail.com")
		.clickDialCode()
		.clickOnCountry()
		.enterPhoneNumber("8220033070")
		.enterCompanyName("HolidayInn")
		.enterStreetAddress("234,second street")
		.enterStreetAddress2("perungudi")
		.enterCity("Chennai")
		.enterState("TamilNadu")
		.enterPostCode("600041")
		.selectCountry("IN")
		.selectSource("Google")
		.enterMobileNumber("8220033070")
		.waitForSometime(4000)
		.enterPassword("Password123")
		.waitForSometime(4000)
		.enterConfirmPassword("Password123")
		.clickOnRegister();
	}
	
}
