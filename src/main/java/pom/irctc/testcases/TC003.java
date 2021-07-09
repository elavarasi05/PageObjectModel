package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irct.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass()
	{
		
		testCaseName="TC003";
		testCaseDescription="New user Signup in IRCTC";
		author="Elavarasi";
		category="Smoke";
		browserName="chrome";
		appName="IRCTC";
		
	}
	@Test
	public void ftrIrctc() 
	{
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.waitForSometime(4000)
		.switchToAccomodationPage()
		.clickOnSidebar()
		.clickOnBookYourTrain()
		.switchToFtrHomePage()
		.clickOnNewUserSignUp()
		.switchToFtrRegistrationPage()
		.enterUserId("Elai123")
		.enterPassword("Password123")
		.enterCnfPassword("Password123")
		.selectSecQuestion("0")
		.enterSecAnswer("Tony")
		.clickOnDateOfBirth()
		.selectYear("1984")
		.selectMonth("11")
		.clickOnDate("2")
		.clickOnGender("gender1")
		.clickOnMaritalStatus("maritalStatus0")
		.enterEmail("elavarasi05@gmail.com")
		.selectOccupation("EducationalInstitution")
		.waitForPagedown()
		.enterFirstname("Elavarasi")
		.enterMiddlename("Krisha")
		.enterLastname("Anbalagan")
		.selectNationality("94")
		.enterAddressFlatNo("I1")
		.enterAddressStreet("First street,KTK town")
		.enterAddressArea("Injambakkam")
		.selectCountry("94")
		.enterMobileNumber("8220033070")
		.waitForPagedown()
		.enterPinCode("600115")
		.waitForCityState(4000)
		.clickOnCommAdd("n")
		.enterDoorNo("I1")
		.enterStreetName("FirstStreet,KTK town")
		.enterAreaName("Injambakkam")
		.selectCountryOffice("94")
		.enterMobileNumberOff("8220033070")
		.enterPinCodeOff("600115")
		.waitForPagedown();

	}
}
