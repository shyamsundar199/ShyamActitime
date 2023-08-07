package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.ActitimeHomePage;
import Pages.ActitimeLoginPage;
import Pages.ActitimeUserPage;
import Pages.ActitimenewuserPage;
import generics.BaseTest;

public class TC_06_ActitimeCreateuserLogout extends BaseTest
{
	@Test
	public void loginMethod() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "loginMethod")
	public void userMethod() throws IOException, InterruptedException
	{
		ActitimeHomePage user= new ActitimeHomePage(driver);
		user.usersMethod();
	}
	
	@Test(dependsOnMethods = "userMethod")
	public void newuserMethod() throws IOException, InterruptedException
	{
		ActitimeUserPage newuser= new ActitimeUserPage(driver);
		newuser.newuserMethod();
	}
	
	@Test(dependsOnMethods = "newuserMethod")
	public void adduserMethod() throws IOException, InterruptedException
	{
		ActitimenewuserPage adduser= new ActitimenewuserPage(driver);
		adduser.adduserMethod();
	}
	
	@Test(dependsOnMethods = "adduserMethod")
	public void logoutMethod()
	{
		ActitimeHomePage logout=new ActitimeHomePage(driver);
		logout.logoutMethod();
	}
}
