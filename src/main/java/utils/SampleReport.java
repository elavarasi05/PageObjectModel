package utils;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void reporting()
	{
		//Start Report
		ExtentReports report = new ExtentReports("./reports/result.html");
		
		//Start Test
		ExtentTest test=report.startTest("TC002","To reister for PHP travels");
		
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		test.log(LogStatus.PASS, "The Application launched with the given URL");
		
		//end test
		report.endTest(test);
		
		//end report
		
		report.flush();
	}

}
