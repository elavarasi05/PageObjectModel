package pom.usvisaapplication.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.usvisaapplication.pages.UsApplicationPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC005";
		testCaseDescription="To apply for US visa";
		author="Elavarasi";
		category="Smoke";
		browserName="chrome";
		appName="USvisa";
		
	}
	
	@Test
	public void usVisaAppln()//all passed
	{
		new UsApplicationPage(driver,test)
		.enterGivenName("Elavarasi")
		.enterSurname("Anbalagan")
		.enterFullName("Elavarasi Anbalagan")
		.waitForPageDown()
		.clickOtherNameUsed()
		.enterEmailId("elavarasi05@gmail.com")
		.enterConfirmEmailId("elavarasi05@gmail.com")
		.clickAdditionalEmailYes()
		.enterAddEmail("elavarasi05@gmail.com")
		.clickOnGender()
		.clickOnDoB()
		.SelectYear("1984")
		.selectMonth("11")
		.clickDate("2")
		.enterCityOfBirth("Vellore")
		.waitForPageDown()
		.enterStateOfBirth("TamilNadu")
		.selectCountryOfBirth("India")
		.selectNationality("India")
		.waitForPageDown()
		.waitForNextButton(4000)
		.clickNextPage()
		.enterStreetAddress("I1,firststreet")
		.enterStreetAddress2("KTK town")
		.enterCity("Chennai")
		.enterState("TamilNadu")
		.enterPostZip("600119")
		.clickDialCode()
		.waitForPageDown()
		.waitForCountryClick(4000)
		.clickDialCountry("India")
		.waitForPageDown()
		.enterPhoneNumber("8220033070")
		.clickOtherPhoneYes()
		.enterOtherPhoneNumber("9402846880")
		.selectCountryOfResidence("India")
		.selectStateOfResidence("Tamil Nadu")
		.waitForPageDown()
		.clickNoSameMailaddress()
		.enterMailStreet("12,valmiki street")
		.enterMailStreet2("Vel Nagar")
		.enterMailingCity("Chennai")
		.enterMailingState("TamilNadu")
		.enterMailingZip("600119")
		.waitForPageDown()
		.selectMailingCountry("India")
		.clickOnNext()
		.enterLanguagesKnown("English and Tamil")
		.clickClanYes()
		.enterClanName("Amish")
		.selectMaritalStatus("Single")
		.clickOtherPersonTravel()
		.selectPurposeOfTrip("BUSINESS & TOURISM (TEMPORARY VISITOR) (B1/B2)")
		.selectAppliLanguage("English")
		.clickOnTermsAgree();
		
		
		
	} 
}
