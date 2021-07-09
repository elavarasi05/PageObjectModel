package utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
public String testCaseName,testCaseDescription;
public String author,category;


	public static ExtentReports report;
	public ExtentTest test;
	
	
	public void startReport() 
	{
		
		report=new ExtentReports("./reports/result.html",false);
	}
	
	
	public void startTest(String testName,String description)
	{
		test=report.startTest(testName, description);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	
	public abstract long takeSnap();
	
	
	public void reportStep(String details,String status)
	{
		long SnapNumber=takeSnap();
			
			if(status.equalsIgnoreCase("pass"))
			{
				
				test.log(LogStatus.PASS,details +test.addScreenCapture(".././reports/screenshots/"+SnapNumber+".png"));
			}
			else if(status.equalsIgnoreCase("fail"))
			{
				test.log(LogStatus.FAIL,details +test.addScreenCapture(".././reports/screenshots/"+SnapNumber+".png"));
			}
			else if(status.equalsIgnoreCase("info"))
			{
				test.log(LogStatus.INFO, details +test.addScreenCapture(".././reports/screenshots/"+SnapNumber+".png"));
			}
			else if (status.equalsIgnoreCase("Warning"))
			{
				test.log(LogStatus.WARNING, details +test.addScreenCapture(".././reports/screenshots/"+SnapNumber+".png"));
			}
			else if(status.equalsIgnoreCase("UnKnown"))
			{
				test.log(LogStatus.UNKNOWN, details +test.addScreenCapture(".././reports/screenshots/"+SnapNumber+".png"));
				
			}
		}
	
	public void reportStep(String details,String status,boolean snap)
{
		if(!snap)
		
	{
		if(status.equalsIgnoreCase("pass"))
		{
			
			test.log(LogStatus.PASS,details);
		}
		else if(status.equalsIgnoreCase("fail"))
		{
			test.log(LogStatus.FAIL,details);
		}
		else if(status.equalsIgnoreCase("info"))
		{
			test.log(LogStatus.INFO, details);
		}
		else if (status.equalsIgnoreCase("Warning"))
		{
			test.log(LogStatus.WARNING, details);
		}
		else if(status.equalsIgnoreCase("UnKnown"))
		{
			test.log(LogStatus.UNKNOWN, details);
			
		}
	}
}
	
	
	
	public void endTest()
	{
		report.endTest(test);
	}
	
	
	
	public void endReport()
	{
		report.flush();
	}

	
}
