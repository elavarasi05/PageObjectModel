package pom.formc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC004";
		testCaseDescription="To register for formC";
		author="Elavarasi";
		category="Smoke";
		browserName="chrome";
		appName="FormC";
		
	}
	
		
@Test
	public void formCRegistration()
	{
		new FormCHomePage(driver,test)
		.clickOnSignUp()
		.enterUserName("Elavarasi05")
		.enterPassword("Password@123")
		.enterConfirmPassword("Password@123")
		.selectSecQues("5")
		.enterSecAns("Home")
		.enterName("Elavarasi")
		.selectGender("F")
		.enterDoB("02/12/1984")
		.enterDesignation("Engineer")
		.enterEmailId("elavarasi05@gmail.com")
		.enterMobileNumber("8220033070")
		.enterPhoneNumber("9402846880")
		.selectNationality("IND")
		.enterAccomName("Bed and Breakfast INN")
		.enterCapacity("20")
		.enterAddress("1,rose st")
		.selectState("28")
		.waitForCity(4000)
		.selectForCity("4C")
		.selectAccomodationType("BB")
		.selectAccomodationGrade("4s")
		.enterAccomEmailId("bbinn@gmail.com")
		.enterAccomMobileNumber("8220033070")
		.enterAccomPhoneNumber("9402846880")
		.enterGuestDetails("Elavarasi")
		.enterGuestAddress("56,Lavender st")
		.selectGuestState("28")
		.waitForCity(4000)
		.selectGuestCity("4C")
		.enterGuestEmail("lavender@gmail.com")
		.enterGuestPhoneNumber("9876543210")
		.enterGuestMobileNumber("8765432190")
		.clickAdd()
		.waitForCity(4000)
		.enterGuestDetails("Kalai")
		.enterGuestAddress("5,Tulip st")
		.selectGuestState("28")
		.waitForCity(4000)
		.selectGuestCity("4C")
		.enterGuestEmail("tulip@gmail.com")
		.enterGuestPhoneNumber("9876543211")
		.enterGuestMobileNumber("8765432191")
		.clickAdd()
		.enterGuestDetails("Tamil")
		.enterGuestAddress("6,Jasmine st")
		.selectGuestState("28")
		.waitForCity(4000)
		.selectGuestCity("4C")
		.enterGuestEmail("Jasmine@gmail.com")
		.enterGuestPhoneNumber("9876543212")
		.enterGuestMobileNumber("8765432192")
		.clickAdd();
	}
	
}
