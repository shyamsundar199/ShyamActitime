package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.ActitimeHomePage;
import Pages.ActitimeLeavePage;
import Pages.ActitimeLoginPage;
import Pages.ActitimeSettingsPage;
import Pages.ActitimecreatenewLeaveTypePage;
import generics.BaseTest;

public class TC_05_ActitimeLginCreateLeavetype extends BaseTest
{
	@Test
	public void loginMethod() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "loginMethod")
	public void settingsMethod() 
	{
		ActitimeHomePage settings=new ActitimeHomePage(driver);
		settings.settingsMethod();
	}
	
	@Test(dependsOnMethods = "settingsMethod")
	public void leavetypeMethod() 
	{
		ActitimeSettingsPage leavetype= new ActitimeSettingsPage(driver);
		leavetype.leavetypesMethod();
	}
	
	@Test(dependsOnMethods = "leavetypeMethod")
	public void createleavetypeMethod() 
	{
		ActitimeLeavePage createLeavetype=new ActitimeLeavePage(driver);
		createLeavetype.createLeaveType();
	}
	
	@Test(dependsOnMethods = "createleavetypeMethod")
	public void createnewleaveMethod() throws IOException 
	{
		ActitimecreatenewLeaveTypePage create=new ActitimecreatenewLeaveTypePage(driver);
		create.createnewLeaveMethod();
	}
	
	@Test(dependsOnMethods = "createnewleaveMethod")
	public void logoutMethod()
	{
		ActitimeHomePage logout=new ActitimeHomePage(driver);
		logout.logoutMethod();
	}
}
