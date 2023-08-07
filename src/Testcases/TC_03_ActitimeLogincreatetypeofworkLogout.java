package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.ActitimeCreateNewTypeOfWorkPage;
import Pages.ActitimeHomePage;
import Pages.ActitimeLoginPage;
import Pages.ActitimeSettingsPage;
import Pages.ActitimeTypesOfWorkPage;
import generics.BaseTest;

public class TC_03_ActitimeLogincreatetypeofworkLogout extends BaseTest
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
	public void typesofWorkMethod() 
	{
		ActitimeSettingsPage typeofWork=new ActitimeSettingsPage(driver);
		typeofWork.typesofworkMethod();
	}

	@Test(dependsOnMethods = "typesofWorkMethod")
	public void createtypeofWorkMethod() throws InterruptedException 
	{
		ActitimeTypesOfWorkPage createtypeofWork =new ActitimeTypesOfWorkPage(driver);
		createtypeofWork.createtypeofworkMethod();
	}
	

	@Test(dependsOnMethods = "createtypeofWorkMethod")
	public void addMethod() throws InterruptedException, IOException 
	{
		ActitimeCreateNewTypeOfWorkPage add= new ActitimeCreateNewTypeOfWorkPage(driver);
		add.createworkMethod();
	}
	
	@Test(dependsOnMethods = "createtypeofWorkMethod")
		public void logoutMethod()
	{
		ActitimeHomePage logout=new ActitimeHomePage(driver);
		logout.logoutMethod();
	}
}