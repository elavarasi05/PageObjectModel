package pom.panindiaapplication.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindiaapplication.pages.PanHomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC006";
		testCaseDescription="To register for PANcard";
		author="Elavarasi";
		category="Smoke";
		browserName="chrome";
		appName="PANindia";
		
	}
	@Test
	public void panIndiaApplication()//all passed
	{
		new PanHomePage(driver,test)
		.selectTitle("2")
		.enterFirstName("Elavarasi")
		.enterMiddleName("Krisha")
		.enterLastName("Anbalagan")
		.enterFatherFname("Anbalagan")
		.enterFatherMname("Anbu")
		.enterFatherLname("Gounder")
		.enterMobileNumber("8220033070")
		.enterEmail("elavarasi05@gmail.com")
		.selectSourceOfIncome("2")
		.enterDateOfBirth("02121984")
		.waitForPageDown()
		.enterHouseNumber("I1")
		.enterStreet("First street")
		.enterCity("Sholinganallur")
		.selectState("Tamil Nadu")
		.enterPinCode("600119")
		.selectIdentityProof("1")
		.selectAddressProof("21")
		.selectDOBProof("14")
		.selectAAdharProof("Copy of Aadhaar Card/Letter")
		.waitForPageDown()
		.clickAgreeOnTerms()
		.clickOnNext();
	}

}
