package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irct.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC009";
		testCaseDescription="To book hotel in IRCTC website";
		author="Elavarasi";
		category="Smoke";
		browserName="chrome";
		appName="IRCTC";
		
	} 
	@Test
	public void bookHotel() //not clicking Login 
	{
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.switchToAccomodationPage()
		.clickIRCTCHotels()
		.switchToIRCTCTourismPage()
		.clickOnLogin()
		.switchToGuestLoginPage()
		.clickOnGuestUserLogin()
		.enterEmail("elavarasi05@gmail.com")
		.enterMobileNumber("8220033070")
		.clickOnSignIn()
		.switchToIRCTCTourismPage()		
		.enterDestination("Kodaikanal")
		.waitForSometime(3000)
		.clickOnCity()
		.clickCheckInDate()
		.clickDownArrow()
		.waitForSometime(3000)
		.clickCheckinYear("2021")
		.clickCheckinMonth("Jul")
		.clickOnDate("8")
		.waitForSometime(3000)
		.clickCheckOutDate()
		.clickoutDownArrow()
		.clickCheckoutYear("2021")
		.clickCheckinMonth("Jul")
		.clickoutDate("10")
		.clickRoomsAndGuests()
		.selectRoom("1")
		.selectAdult("3")
		.selectChild("0")
		.clickDone()
		.waitForSometime(3000)
		.clickFindHotel()
		.switchToHotelListPage()
		.waitForSometime(4000)
		.clickOnFirstHotelName()
		.switchToHotelSummaryPage()
		.waitForSometime(4000)
		.clickOnContinueToBook()
		.switchToPassengerDetailPage()
		.selectTitle("2")
		.enterFirstName("Elavarasi")
		.enterLastName("Anbalagan")
		.selectCountry("India")
		.selectState("TN")
		.enterMobileNumber("")
		.enterEmailId("")
		.selectGST("No")
		.clickOnGo()
		.switchToPaymentSummaryPage()
		.clickOnAgree()
		.clickMakePayment()
		.switchToOTPAlertPage()
		.enterOTP("")
		.clickVerify();
		
		
	}
}
