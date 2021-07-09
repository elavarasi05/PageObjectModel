package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.omg.PortableServer.RequestProcessingPolicyOperations;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ReporterType;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

	public RemoteWebDriver driver;
	
	public 	static Properties prop ;
	
	public void loadObjects() {
		
		 prop = new Properties();
		
		try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void unloadObjects() {
		prop=null;
	}
	
	
	public String replaceString(String xpath , String data) {
		
		String replaceXPath =null;
		if(xpath.contains("$data$")) {
			 replaceXPath = xpath.replace("$data$", data);
		}
		return replaceXPath;
	}
	
	public void invokeApp(String browser, String url) 
	{
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			
			
			driver.manage().window().maximize();
			driver.get(url);
			//System.out.println("The Browser "+browser+" is launched with given " +url);
			reportStep("The Browser "+browser+" is launched with given "+url, "Pass");
			
		} catch (SessionNotCreatedException e) 
		{
						// TODO Auto-generated catch block
			//System.err.println("The Browser "+browser+" did not launched due to session not created error");
			reportStep("The Browser "+browser+" didnot launched due to session not created error", "Fail");
		}
		
		catch(WebDriverException e) 
		{
			//System.err.println("The Browser"+browser+" did not launch due to unknown error");
			reportStep("The Browser "+browser+" did not launch due to unknown error", "Fail");
		}
		
	}

	
	
	
	public void enterById(String idValue, String data) 
	{
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The Element with id "+idValue+" is entered with "+data);
			reportStep("The Element with id "+idValue+" is entered with "+data, "PASS");
		} 
		catch (NoSuchElementException e) 
		{
			// TODO Auto-generated catch block
			//System.err.println("The Element with "+idValue+" could not found in DOM");
			reportStep("The Element with "+idValue+" could not found in DOM", "FAIL");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with "+idValue+" is not visible in application");
			reportStep("The Element with "+idValue+" is not visible in application", "FAIL");
		}
				
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with"+idValue+" is not intractable in application");
			reportStep("The Element with "+idValue+" is not intractable in application", "FAIL");
		}		
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with "+idValue+"is not stable in the application");
			reportStep("The Element with "+idValue+" is not stable in the application", "FAIL");
			
		}catch(WebDriverException e)
		{
			//System.err.println("The Element with "+idValue+" is not entered with "+data+" due to unknown error");
			reportStep("The Element with "+idValue+" is not entered with "+data+" due to unknown error", "FAIL");
		}
				
	}

	
	
	
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data, Keys.TAB);
			//System.out.println("The Element by name value "+nameValue+" is entered with "+data);
			reportStep("The Element by name value "+nameValue+" is entered with "+data, "PASS");
		} 
		catch (NoSuchElementException e) 
		{
			// TODO Auto-generated catch block
			//System.err.println("The Element with nameValue "+nameValue+" is not found in DOM");
			reportStep("The Element with nameValue "+nameValue+" is not found in DOM", "FAIL");
		} 
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with nameValue "+nameValue+" is not visible in the application");
			reportStep("The Element with nameValue "+nameValue+" is not visible in the application", "FAIL");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with name Value "+nameValue+" is not intractable in application");
			reportStep("The Element with name Value "+nameValue+" is not intractable in application", "FAIL");
		} 
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with nameValue "+nameValue+" is not stable in the application");
			reportStep("The Element with nameValue "+nameValue+" is not stable in the application", "FAIL");
		} 
		catch(WebDriverException e)
		{
			//System.err.println("The Element with nameValue "+nameValue+" did not enter the data in the application due to unknown error");
			reportStep("The Element with nameValue "+nameValue+" did not enter the data in the application due to unknown error", "FAIL");
		}
		
	}

	
	
	
	public void enterByXpath(String xpathValue, String data) 
	{
		// TODO Auto-generated method stub
		try 
		{
			driver.findElementByXPath(xpathValue).sendKeys(data);		
			//System.out.println("The Element with XpathValue "+xpathValue+" is entered with the data "+data);
			reportStep("The Element with XpathValue "+xpathValue+" is entered with the data "+data, "PASS");
		} 
		catch (NoSuchElementException e) 
		{
			// TODO Auto-generated catch block
			//System.err.println("The Element with XpathValue "+xpathValue+" is not found in DOM");
			reportStep("The Element with XpathValue "+xpathValue+" is not found in DOM", "FAIL");
		} catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with XpathValue "+xpathValue+" is not visible in the application");
			reportStep("The Element with XpathValue "+xpathValue+" is not visible in the application", "FAIL");
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with XpathValue "+xpathValue+" is not intractable in the application");
			reportStep("The Element with XpathValue "+xpathValue+" is not intractable in the application", "FAIL");
		} catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with XpathValue "+xpathValue+" is not stable in the application");
			reportStep("The Element with XpathValue "+xpathValue+" is not stable in the application", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The Element "+xpathValue+" didn't enter the "+data+" in the application due to unknown reasons");
			reportStep("The Element with XPath "+xpathValue+" didn't enter the \"+data+\" in the application due to unknown reasons", "FAIL");
		}
		
	}

	
	
	
	
	public void verifyTitle(String title) 
	{
		// TODO Auto-generated method stub
		 try 
		 {
			String actualTitle=driver.getTitle();
			 if(actualTitle.equals(title))
			 {
				 //System.out.println("Title "+title+" is verified and it is same as the given title");
				 reportStep("Title "+title+" is verified and it is same as the given title", "PASS");
			 }else
			 {
				 //System.err.println("Title "+title+" verified but it is not same as the given title");
				 reportStep("Title "+title+" verified but it is not same as the given title", "FAIL");
			 }
		 } 
		 catch (WebDriverException e) 
		 	{
			// TODO Auto-generated catch block
			//System.err.println("The title "+title+" could not be verified due to unknown reasons");
			 reportStep("The title "+title+" could not be verified due to unknown reasons", "FAIL");
		 	}
		 
	}

	
	
	
	public void verifyTextById(String id, String text) 
	{
		// TODO Auto-generated method stub
		try {
			String actualText=driver.findElementById(id).getText();
			if(actualText.equals(text))
			{
				//System.out.println("The Element with id "+id+" is holding the text "+actualText+" matched with expected text "+text);
				reportStep("The Element with id "+id+" is holding the text "+actualText+" matched with expected text "+text, "PASS");
			} else
			{
				//System.err.println("The given text "+text+" is verified and it is not same as the actual text");
				reportStep("The given text "+text+" is verified and it is not same as the actual text", "FAIL");
			}
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "FAIL");
		} 
		catch (ElementNotVisibleException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "FAIL");
		} catch (ElementNotInteractableException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not intractable in the application");
			reportStep("The Element with id "+id+" is not intractable in the application", "FAIL");
		} catch (StaleElementReferenceException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "FAIL");
		} catch (WebDriverException e) 
		{
			// TODO Auto-generated catch block
			//System.err.println("The given text "+text+" could not be verified with actual text due to unknown reasons");
			reportStep("The given text "+text+" could not be verified with actual text due to unknown reasons", "FAIL");
		}
	}

	
	
	
	public void verifyTextByXpath(String xpath, String text) 
	{
		// TODO Auto-generated method stub
		try 
		{
			String actText=driver.findElementByXPath(xpath).getText();
			if (actText.equals("text"))
			{
				//System.out.println("The Element with XPath "+xpath+" verified the given text "+text+" is same as the actual text");
				reportStep("The Element with XPath "+xpath+" verified the given text "+text+" is same as the actual text", "PASS");
			}else
			{
				//System.err.println("The Element with XPath "+xpath+" verified the given text "+text+" is different from the actual text");
				reportStep("The Element with XPath "+xpath+" verified the given text "+text+" is different from the actual text", "FAIL");
			}
		} 
		catch(NoSuchElementException e)
		{
			//System.err.println("The Element with XPath "+xpath+" is not found in the DOM");
			reportStep("The Element with XPath "+xpath+" is not found in the DOM", "FAIL");
		}
		catch (ElementNotVisibleException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" is not visible in the application");
			reportStep("The Element with XPath "+xpath+" is not visible in the application", "FAIL");
		} 
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with XPath "+xpath+" is not intractable in the application");
			reportStep("The Element with XPath "+xpath+" is not intractable in the application", "FAIL");
		} catch (StaleElementReferenceException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" is not stable in the application");
			reportStep("The Element with XPath "+xpath+" is not stable in the application", "FAIL");
		} 
		catch (WebDriverException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" has not verified the given text with actual text due to unknown reasons");
			reportStep("The Element with XPath "+xpath+" has not verified the given text with actual text due to unknown reasons", "FAIL");
		} 
	}

	
	
	
	
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String parText=driver.findElementByXPath(xpath).getText();
			if(parText.contains("text"))
			{
				//System.out.println("The Element with XPath "+xpath+" verified the given data "+text+" contained in the application");
				reportStep("The Element with XPath "+xpath+" verified the given data \"+text+\" contained in the application","PASS");
			}else
			{
				//System.err.println("The given text "+text+" is not found in the application");
				reportStep("The given text "+text+" is not found in the application", "FAIL");
			}
			}catch(NoSuchElementException e)
			{
				//System.err.println("The Element with XPath "+xpath+" is not found in the DOM");
				reportStep("The Element with XPath "+xpath+" is not found in the DOM", "FAIL");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The Element with XPath "+xpath+" is not visible in the application");
				reportStep("The Element with XPath "+xpath+" is not visible in the application", "FAIL");
			} catch(ElementNotInteractableException e)
			{
				//System.err.println("The Element with XPath "+xpath+" is not intractable in the application");
				reportStep("The Element with XPath "+xpath+" is not intractable in the application", "FAIL");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The Element with XPath "+xpath+" is not stable in the application");
				reportStep("The Element with XPath "+xpath+" is not stable in the application", "FAIL");
			} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The given data cannot be verified due to unknown reasons");
				reportStep("The given data cannot be verified due to unknown reasons", "FAIL");
		}
	}
	
	

	
	
	
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try 
		{
			driver.findElementById(id).click();
			//System.out.println("The Element with id "+id+" clicked successfully");
			reportStep("The Element with id \"+id+\" clicked successfully", "PASS");
		} catch (NoSuchElementException e) 
		{
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "FAIL");
		} catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with id "+id+" could not be clicked  in the application");
			reportStep("The Element with id "+id+" could not be clicked  in the application", "FAIL");
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+id+" is not intractable in the application");
			reportStep("The Element with id "+id+" is not intractable in the application", "FAIL");
		} catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+id+" is not clicked for unknown reasons");
			reportStep("The Element with id "+id+" is not clicked for unknown reasons", "FAIL");
		}
		
	}

	
	
	
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The Element with ClassName "+classVal+" is clicked successfully in the application");
			reportStep("The Element with ClassName "+classVal+" is clicked successfully in the application", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with className "+classVal+" is not found in the DOM");
			reportStep("The Element with className "+classVal+" is not found in the DOM", "FAIL");
		} catch (ElementClickInterceptedException e)
		{
			//System.err.println("The Element with className "+classVal+" click is intercepted in the application");
			reportStep("The Element with className "+classVal+" click is intercepted in the application", "FAIL");
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with className" +classVal+" is not intractable in the application");
			reportStep("The Element with className " +classVal+" is not intractable in the application", "FAIL");
		} catch(ElementNotSelectableException e)
		{
			//System.err.println("The Element with className "+classVal+" is could not be selected by the click in the application");
			reportStep("The Element with className "+classVal+" is could not be selected by the click in the application", "FAIL");
		} catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with className "+classVal+" is not stable in the application");
			reportStep("The Element with className "+classVal+" is not stable in the application", "FAIL");
		}catch(WebDriverException e)
		{
			//System.err.println("The Element with className "+classVal+" is not clicked due to unknown reasons");
			reportStep("The Element with className "+classVal+" is not clicked due to unknown reasons", "FAIL");
		}
		
		
	}

	
	
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The Element with name "+name+" is clicked successfully in the application");
			reportStep("The Element with name "+name+" is clicked successfully in the application", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name "+name+" is not found in the DOM");
			reportStep("The Element with name "+name+" is not found in the DOM", "FAIL");
		} catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with name "+name+" click intercepted in the application");
			reportStep("The Element with name "+name+" click intercepted in the application", "FAIL");
		} catch(ElementNotSelectableException e)
		{
			//System.err.println("The Element with name "+name+"  could not be selected by the click in the application");
			reportStep("The Element with name "+name+"  could not be selected by the click in the application", "FAIL");
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with name "+name+" is not intractable in the application");
			reportStep("The Element with name "+name+" is not intractable in the application", "FAIL");
		} catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with name "+name+" is not stable in the application");
			reportStep("The Element with name "+name+" is not stable in the application", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The Element with name "+name+" is not clicked due to unknown reasons");
			reportStep("The Element with name "+name+" is not clicked due to unknown reasons", "FAIL");
		} 
	}

	
	
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The given link name "+name+" is clicked ");
			reportStep("The given link name "+name+" is clicked ", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element by link "+name+" is not found in the DOM");
			reportStep("The Element by link "+name+" is not found in the DOM", "FAIL");
		}	catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element by link name "+name+" click is intercepted in the application");
			reportStep("The Element by link name "+name+" click is intercepted in the application", "FAIL");
		}	catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element by link name "+name+" is not intractable in the application");
			reportStep("The Element by link name "+name+" is not intractable in the application", "FAIL");
		}	catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element by link name "+name+" is not stable in the application");
			reportStep("The Element by link name "+name+" is not stable in the application", "FAIL");
		}   catch(WebDriverException e)
		{
			//System.err.println("The Element by link name "+name+" is not clicked in the application due to unknown reasons");
			reportStep("The Element by link name "+name+" is not clicked in the application due to unknown reasons", "FAIL");
		}	
	}

	
	
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with link name "+name+" is clicked");
			reportStep("The Element with link name "+name+" is clicked", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with link name "+name+" is not found in DOM");
			reportStep("The Element with link name "+name+" is not found in DOM", "FAIL");
		} catch(ElementNotVisibleException e)
		
		{
			//System.err.println("The Element by link name "+name+" is not visible in the application");
			reportStep("The Element by link name "+name+" is not visible in the application", "FAIL");
		} catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with link name "+name+" click is intercepted in the application");
			reportStep("The Element with link name "+name+" click is intercepted in the application", "FAIL");
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with Link name "+name+" is not intractable in the application" );
			reportStep("The Element with Link name "+name+" is not intractable in the application", "FAIL");
			
		} catch(WebDriverException e)
		{
			//System.err.println("The Element with link name "+name+" could not be clicked due to unknown reasons");
			reportStep("The Element with link name "+name+" could not be clicked due to unknown reasons", "FAIL");
		}
			
	}
	
	
	
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with XPath "+xpathVal+" is clicked in the application");
			reportStep("The Element with XPath "+xpathVal+" is clicked in the application", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with XPath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with XPath "+xpathVal+" is not found in the DOM", "FAIL");
		} catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" click is intercepted in the application");
			reportStep("The Element with XPath "+xpathVal+" click is intercepted in the application", "FAIL");
			
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" is not intractable in the application");
			reportStep("The Element with XPath "+xpathVal+" is not intractable in the application", "FAIL");
		} catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element XPath "+xpathVal+" is not stable in the application");
			reportStep("The Element XPath "+xpathVal+" is not stable in the application", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" cannot be clicked due to unknown reasons");
			reportStep("The Element with XPath "+xpathVal+" cannot be clicked due to unknown reasons", "FAIL");
		}
		
	}


	public void clickByXpath(String xpathVal,String data) {
		// TODO Auto-generated method stub
		try {
			String latestXPath =null;
			if(xpathVal.contains("$data$")){
				 latestXPath = replaceString(xpathVal,data);	
			}
			driver.findElementByXPath(latestXPath).click();
			//System.out.println("The Element with XPath "+xpathVal+" is clicked in the application");
			reportStep("The Element with XPath "+xpathVal+" is clicked in the application", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with XPath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with XPath "+xpathVal+" is not found in the DOM", "FAIL");
		} catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" click is intercepted in the application");
			reportStep("The Element with XPath "+xpathVal+" click is intercepted in the application", "FAIL");
			
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" is not intractable in the application");
			reportStep("The Element with XPath "+xpathVal+" is not intractable in the application", "FAIL");
		} catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element XPath "+xpathVal+" is not stable in the application");
			reportStep("The Element XPath "+xpathVal+" is not stable in the application", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" cannot be clicked due to unknown reasons");
			reportStep("The Element with XPath "+xpathVal+" cannot be clicked due to unknown reasons", "FAIL");
		}
		
	}


	
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
	
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with XPath "+xpathVal+" is clicked in the application");
			reportStep("The Element with XPath "+xpathVal+" is clicked in the application", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with XPath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with XPath "+xpathVal+" is not found in the DOM", "FAIL");
		} catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" click is intercepted in the application");
			reportStep("The Element with XPath "+xpathVal+" click is intercepted in the application", "FAIL");
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" is not intractable in the application");
			reportStep("The Element with XPath "+xpathVal+" is not intractable in the application", "FAIL");
		} catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" is not stable  in the application");
			reportStep("The Element with XPath "+xpathVal+" is not stable  in the application", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The Element with XPath "+xpathVal+" is not opened due to unknown reasons");
			reportStep("The Element with XPath "+xpathVal+" is not opened due to unknown reasons", "FAIL");
		}
	}

	
	
	public String getTextById(String idVal) {
		// TOD"O Auto-generated method stub
		
		String text =null;
		try {
			 text=driver.findElementById(idVal).getText();
			//System.out.println("The Element with id "+idVal+" returned this text "+text" ");
			 reportStep("The Element with id "+idVal+" returned this text "+text, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
			reportStep("The element with id "+idVal+" is not found in the DOM", "FAIL");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application", "FAIL");
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with "+idVal+" is not intractable in the application");
			reportStep("The element with "+idVal+" is not intractable in the application", "FAIL");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idVal+" is not stable in the application");
			reportStep("The Element with id "+idVal+" is not stable in the application", "FAIL");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idVal+" didn't returned any text due to unknown reasons");
			reportStep("The Element with id "+idVal+" didn't returned any text due to unknown reasons", "FAIL");
		} 
		return text;
	}

	
	
	
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
			text=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Element with XPath "+xpathVal+" returned the text "+text);
			reportStep("The Element with XPath "+xpathVal+" returned the text "+text, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with XPath "+xpathVal+" is not found in DOM");
			reportStep("The Element with XPath "+xpathVal+" is not found in DOM", "FAIL");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpathVal+" is not intractable in the application");
			reportStep("The Element with XPath "+xpathVal+" is not intractable in the application", "FAIL");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpathVal+" is not stable in the application");
			reportStep("The Element with XPath "+xpathVal+" is not stable in the application", "FAIL");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpathVal+" didn't return any test due to unknown reasons");
			reportStep("The Element with XPath "+xpathVal+" didn't return any test due to unknown reasons", "FAIL");
		}
		
		return text;
	}

	
	
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text=driver.findElementById(id);
			Select sel=new Select(text);
			sel.selectByVisibleText("value");
			//System.out.println("The element with id "+id+" is selected with the visible text "+value);
			reportStep("The element with id "+id+" is selected with the visible text "+value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "FAIL");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "FAIL");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not intractable in the application");
			reportStep("The Element with id "+id+" is not intractable in the application", "FAIL");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "FAIL");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" did not select visible text due to unknown reasons ");
			reportStep("The Element with id "+id+" did not select visible text due to unknown reasons", "FAIL");
			
		}
				
	}

	
	
	
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement data=driver.findElementById(id);
			Select sel=new Select(data);
			sel.selectByIndex(value);
			//System.out.println("The index with Value "+value+" is selected located using the id "+id);
			reportStep("The index with Value "+value+" is selected located using the id "+id, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "FAIL");
		} catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+id+" is not intractable in the application ");
			reportStep("The Element with id "+id+" is not intractable in the application", "FAIL");
		} catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+id+" is not selected the value "+value+" due to unknown reasons");
			reportStep("The Element with id "+id+" is not selected the value \"+value+\" due to unknown reasons", "FAIL");
		} 
			
	}

	
	
	
	
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIdsAfterClick = driver.getWindowHandles();
			
			for(String eachId : allWinIdsAfterClick) 
			{
			
			driver.switchTo().window(eachId);
			break;
			}
			    //System.out.println("The window switched to its parent window successfully");
				reportStep("The window switched to its parent window successfully", "PASS");
			} catch (NoSuchWindowException e) {
				// TODO Auto-generated catch block
				//System.err.println("The Parent window does not exist");
				reportStep("The Parent window does not exist", "FAIL");
			} catch (WebDriverException e) {
			// TODO Auto-generated catch block
				//System.err.println("The Window cannot switch from child window to parent window due to unknown reasons");
				reportStep("The Window cannot switch from child window to parent window due to unknown reasons", "FAIL");
			}
	    }
		
				
		
			
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIdsAfterClick = driver.getWindowHandles();
			for(String eachId : allWinIdsAfterClick) 
			{
			
			driver.switchTo().window(eachId);
			}
			//System.out.println("The browser switched to its last window");
			reportStep("The browser switched to its last window successfully", "PASS");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The last window does not exist");
			reportStep("The last window does not exist", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The browser is not switched to its last window due to unknown reasons");
			reportStep("The browser is not switched to its last window due to unknown reasons", "FAIL");
		}
	}

	
	
	public void acceptAlert() {
		// TODO Auto-generated method stub
	try {
		driver.switchTo().alert().accept();
		//System.out.println("The alert is accepted successfully");
		reportStep("The alert is accepted successfully", "PASS");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element acceptAlert could not be found in the DOM");
		reportStep("The Element acceptAlert could not be found in the DOM", "FAIL");
	}	catch (ElementClickInterceptedException e) {
		// TODO: handle exception
		//System.err.println("The Element acceptAlert click is intercepted in the application");
		reportStep("The Element acceptAlert click is intercepted in the application", "FAIL");
	}  catch(WebDriverException e)
	{
		//System.err.println("The Element acceptAlert cannot be clicked due to unknown reasons");
		reportStep("The Element acceptAlert cannot be clicked due to unknown reasons", "FAIL");
	}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert dismissed");
			reportStep("The alert dismissed successfully", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element dismiss is not found in the DOM");
			reportStep("The Element dismiss is not found in the DOM", "FAIL");
		} catch(WebDriverException e)
		{
			//System.err.println("The dismissal of alert cannot be done due to unknown reasons");
			reportStep("The dismissal of alert cannot be done due to unknown reasons", "FAIL");
		}
	}

	
	
	
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertmessage=null;
		try {
			alertmessage=driver.switchTo().alert().getText();
			//System.out.println("The alert Text is "+alertmessage+"");
			reportStep("The alert Text is "+alertmessage+" and it is printed successfully", "PASS");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert text is not printed due to unknown reasons");
			reportStep("The alert text is not printed due to unknown reasons", "FAIL");
		}
		return alertmessage;
	}

	
	
	public long takeSnap() {
		// TODO Auto-generated method stub
		long number=1;
		
		try {
						
			number= (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("./reports/screenshots/"+number+".png.");
			FileUtils.copyFile(tmp, dest);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The screenshot was not taken due to unknown reasons","FAIL");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
	}

	
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The current active browser is closed successfully");
			reportStep("The current active browser is closed successfully", "PASS",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Active Browser cannot be closed due to unknown reasons");
			reportStep("The Active Browser cannot be closed due to unknown reasons", "FAIL",false);
		}
	}

	
	
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All the browsers closed Successfully");
			reportStep("All the browsers closed Successfully", "PASS");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("All Browsers could not be closed due to unknown reasons");
			reportStep("All Browsers could not be closed due to unknown reasons", "FAIL");
		}
	}


	

	public void waitProperty(int time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The wait time is interrupted in the application");
			reportStep("The wait time is interrupted in the application", "FAIL");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The wait is not responding due to unknown reasons");
			reportStep("The wait is not responding due to unknown reasons", "FAIL");
		}
	}



	public void pagedown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page down operation is interrupted due to unknown reasons");
			reportStep("The page down operation is interrupted due to unknown reasons", "FAIL");
		}
	}
	
	public void tab() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page down operation is interrupted due to unknown reasons");
			reportStep("The page down operation is interrupted due to unknown reasons", "FAIL");
		}
	}



	

	public void selectVisibleTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text=driver.findElementByXPath(xpath);
			Select sel=new Select(text);
			sel.selectByVisibleText(value);
			//System.out.println("The element with XPath "+xpath+" is selected with the visible text "+value);
			reportStep("The element with XPath "+xpath+" is selected with the visible text "+value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with XPath "+xpath+" is not found in the DOM");
			reportStep("The Element with XPath "+xpath+" is not found in the DOM", "FAIL");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" is not visible in the application");
			reportStep("The Element with XPath "+xpath+" is not visible in the application", "FAIL");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" is not intractable in the application");
			reportStep("The Element with XPath "+xpath+" is not intractable in the application", "FAIL");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" is not stable in the application");
			reportStep("The Element with XPath "+xpath+" is not stable in the application", "FAIL");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" did not select visible text due to unknown reasons ");
			reportStep("The Element with XPath "+xpath+" did not select visible text due to unknown reasons ", "FAIL");
			
		}
	}

	
	


	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text=driver.findElementByXPath(xpath);
			Select sel=new Select(text);
			sel.selectByValue(value);
			//System.out.println("The element with XPath "+xpath+" is selected with the value "+value);
			reportStep("The element with XPath "+xpath+" is selected with the value "+value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with XPath "+xpath+" is not found in the DOM");
			reportStep("The Element with XPath "+xpath+" is not found in the DOM", "FAIL");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" is not visible in the application");
			reportStep("The Element with XPath "+xpath+" is not visible in the application", "FAIL");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" is not intractable in the application");
			reportStep("The Element with XPath "+xpath+" is not intractable in the application", "FAIL");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" is not stable in the application");
			reportStep("The Element with XPath "+xpath+" is not stable in the application", "FAIL");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with XPath "+xpath+" did not select visible text due to unknown reasons ");
			reportStep("The Element with XPath "+xpath+" did not select value due to unknown reasons ", "FAIL");
		}
		}
 
	
	
	
public void selectValueByClassName(String classname, String value) {

	try {
		WebElement text=driver.findElementByClassName(classname);
		Select sel=new Select(text);
		sel.selectByValue(value);
		//System.out.println("The element with ClassName "+classname+" is selected with the visible text "+value);
		reportStep("The element with ClassName "+classname+" is selected with the visible text "+value, "PASS");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with ClassName "+classname+" is not found in the DOM");
		reportStep("The Element with ClassName "+classname+" is not found in the DOM", "FAIL");
	} catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The Element with ClassName "+classname+" is not visible in the application");
		reportStep("The Element with ClassName "+classname+" is not visible in the application", "FAIL");
	} catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The Element with ClassName "+classname+" is not intractable in the application");
		reportStep("The Element with ClassName "+classname+" is not intractable in the application", "FAIL");
	} catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The Element with ClassName "+classname+" is not stable in the application");
		reportStep("The Element with ClassName "+classname+" is not stable in the application", "FAIL");
	} catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The Element with ClassName "+classname+" did not select visible text due to unknown reasons ");
		reportStep("The Element with ClassName "+classname+" did not select visible text due to unknown reasons", "FAIL");
		
	}
	
	}




public void selectValueById(String id, String value) {
	// TODO Auto-generated method stub
	try {
		WebElement text=driver.findElementById(id);
		Select sel=new Select(text);
		sel.selectByValue(value);
		//System.out.println("The element with Id "+id+" is selected with the visible text "+value);
		reportStep("The element with Id "+id+" is selected with the visible text "+value, "PASS");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with Id "+id+" is not found in the DOM");
		reportStep("The Element with Id "+id+" is not found in the DOM", "FAIL");
	} catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The Element with Id "+id+" is not visible in the application");
		reportStep("The Element with Id "+id+" is not visible in the application", "FAIL");
	} catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The Element with Id "+id+" is not intractable in the application");
		reportStep("The Element with Id "+id+" is not intractable in the application", "FAIL");
	} catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The Element with Id "+id+" is not stable in the application");
		reportStep("The Element with Id "+id+" is not stable in the application", "FAIL");
	} catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The Element with Id "+id+" did not select visible text due to unknown reasons ");
		reportStep("The Element with Id "+id+" did not select visible text due to unknown reasons", "FAIL");
		
	}
}



public void selectValueByName(String name, String value) {
	// TODO Auto-generated method stub
	
		try {
			WebElement text=driver.findElementByName(name);
			Select sel=new Select(text);
			sel.selectByValue(value);
			//System.out.println("The element with Name "+name+" is selected with the visible text "+value);
			reportStep("The element with Name "+name+" is selected with the visible text "+value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Name "+name+" is not found in the DOM");
			reportStep("The Element with Name "+name+" is not found in the DOM", "FAIL");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" is not visible in the application");
			reportStep("The Element with Name "+name+" is not visible in the application", "FAIL");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" is not intractable in the application");
			reportStep("The Element with Name "+name+" is not intractable in the application", "FAIL");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" is not stable in the application");
			reportStep("The Element with Name "+name+" is not stable in the application", "FAIL");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Name "+name+" did not select visible text due to unknown reasons ");
			reportStep("The Element with Name "+name+" did not select visible text due to unknown reasons", "FAIL");
			
		}
		
}



public void verifyTextByClassName(String clname, String text) {
	// TODO Auto-generated method stub
	try {
		String actText=driver.findElementByClassName(clname).getText();
		if (actText.equals("text"))
		{
			//System.out.println("The Element with ClassName "+clname+" verified the given text "+text+" is same as the actual text");
			reportStep("The Element with ClassName "+clname+" verified the given text "+text+" is same as the actual text", "PASS");
		}else
		{
			//System.err.println("The Element with ClassName "+clname+" verified the given text "+text+" is different from the actual text");
			reportStep("The Element with ClassName "+clname+" verified the given text "+text+" is different from the actual text", "FAIL");
		}
	} catch(NoSuchElementException e)
	{
		//System.err.println("The Element with ClassName "+clname+" is not found in the DOM");
		reportStep("The Element with ClassName "+clname+" is not found in the DOM", "FAIL");
	} catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The Element with ClassName "+clname+" is not visible in the application");
		reportStep("The Element with ClassName "+clname+" is not visible in the application", "FAIL");
	} catch(ElementNotInteractableException e)
	{
		//System.err.println("The Element with ClassName "+clname+" is not intractable in the application");
		reportStep("The Element with ClassName "+clname+" is not intractable in the application", "FAIL");
	} catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The Element with ClassName "+clname+" is not stable in the application");
		reportStep("The Element with ClassName "+clname+" is not stable in the application", "FAIL");
	} catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The Element with ClassName "+clname+" has not verified the given text with actual text due to unknown reasons");
		reportStep("The Element with ClassName "+clname+" has not verified the given text with actual text due to unknown reasons", "FAIL");
	} 
	
}
}

		
	



	

	
	
	

