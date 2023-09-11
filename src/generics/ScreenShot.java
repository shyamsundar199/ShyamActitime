package generics;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ScreenShot implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		if(result.getStatus()==1)
		{
			Reporter.log("test is passed" , true);
		}
		else if(result.getStatus()==2)
		{
			Reporter.log("test is failed" , true);
		}
		else if(result.getStatus()==3)
		{
			Reporter.log("test is skipped" , true);
		}
		
		String name=result.getName();
		Date date=(Date) Calendar.getInstance().getTime();
		String today=date.toString().replaceAll(":", "-");
		File destFile=new File("./failedscreenshot/" +name+today+".png");
		try 
		{
			org.openqa.selenium.io.FileHandler.copy(srcFile, destFile);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		if(result.getStatus()==1)
		{
			Reporter.log("test is passed" , true);
		}
		else if(result.getStatus()==2)
		{
			Reporter.log("test is failed" , true);
		}
		else if(result.getStatus()==3)
		{
			Reporter.log("test is skipped" , true);
		}
		
		String name=result.getName();
		Date date=(Date) Calendar.getInstance().getTime();
		String today=date.toString().replaceAll(":", "-");
		File destFile=new File("./skippedscreenshot/" +name+today+".png");
		try 
		{
			org.openqa.selenium.io.FileHandler.copy(srcFile, destFile);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
		
		
//		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
//		File srcFile=ts.getScreenshotAs(OutputType.FILE);
//		File destfile=new File("./failedscreenshot/failed.png");
//		try 
//		{
//			org.openqa.selenium.io.FileHandler.copy(srcFile, destfile);
//		} catch (IOException e)
//		{
//			e.printStackTrace();
//		}
	}
