package generics;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenShot implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./failedscreenshot/failed.png");
		try 
		{
			org.openqa.selenium.io.FileHandler.copy(srcFile, destfile);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}