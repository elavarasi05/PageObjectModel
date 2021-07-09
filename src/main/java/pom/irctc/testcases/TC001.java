package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irct.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{

	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC001";
		testCaseDescription="To Register in IRCTC";
		author="Elavarasi";
		category="Smoke";
		browserName="chrome";
		appName="IRCTC";
		
	}
	
	
	
	@Test 
	public void irctcRegistration() //no data is printed in registration Page, stops after click register
	{
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnRegister()
		.waitForPagedown()
		.waitForSometime(3000)
		.enterUserName("Elavarasi")
		.enterUserPassword("Secret3435")
		.enterCnfPassword("Secret3435")
		.clickPreferredLanguage()
		.clickOnLanguage("English")
		.clickSecQues()
		.clickOnQuestion("What is your pet name?")
		.enterSecAnswer("Tony")
		.clickContinue()
		.enterFirstname("Elavarasi")
		.enterMiddlename("Krisha")
		.enterLastname("Anbalagan")
		.clickOnOccupation()
		.clickOnEmployment("STUDENT")
		.clickDateOfBirth()
		.selectYear("1984")
		.selectMonth("11")
		.clickDate("2")
		.clickMaritalStatus("M")
		.selectCountry("94")
		.clickGender("Female")
		.enterEmail("elavarasi05@gmail.com")
		.enterMobile("8220033070")
		.selectNationality("94")
		.clickOnContinue()
		.enterResidentialAdd1("I1")
		.enterResidentialAdd2("first street")
		.enterResidentialAdd3("KTK town")
		.enterPinCode("600119")
		.waitForTab()
		.waitForSometime(4000)
		.selectResCity("Kanchipuram")
		.waitForTab()
		.waitForSometime(4000)
		.selectPostOffice("Sholinganallur S.O")
		.enterPhoneNumber("8220033070")
		.clickOnDiffAddress("No")
		.enterOffDoorNo("I1")
		.enterOffStreet("First street,KTK town")
		.enterOffArea("Sholinganallur")
		.clickSelectCountry()
		.clickOnCountry("India")
		.enterOffPincode("600119")
		.enterOffState("TamilNadu")
		.enterOffCity("Kanchipuram")
		.enterOffPostoffice("Sholinganallur")
		.enterPhone("8220033070");
			
	}

}
