package Testcases;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Pages.ActitimeHomePage;
import Pages.ActitimeLoginPage;
import generics.BaseTest;

@Listeners(generics.ScreenShot.class)
public class TC_01_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginMethod() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "loginMethod")
	public void titlevalidationMethod()
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.validateTitle();
	}
	
	@Test(dependsOnMethods = "titlevalidationMethod")
	public void logoutMethod()
	{
		ActitimeHomePage logout=new ActitimeHomePage(driver);
		logout.logoutMethod();
	}
}