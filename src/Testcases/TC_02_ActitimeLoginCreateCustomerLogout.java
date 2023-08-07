package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.ActitimeCreateNewCustomerPage;
import Pages.ActitimeHomePage;
import Pages.ActitimeLoginPage;
import Pages.ActitimeTasksPage;
import generics.BaseTest;

public class TC_02_ActitimeLoginCreateCustomerLogout extends BaseTest
{
	@Test
	public void loginMethod() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "loginMethod")
	public void tasksMethod() throws InterruptedException
	{
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.tasksMethod();
	}
	
	@Test(dependsOnMethods = "tasksMethod")
	public void addNewMethod()
	{
		ActitimeTasksPage tasks=new Pages.ActitimeTasksPage(driver);
		tasks.addnewMethod();
	}
	
	@Test(dependsOnMethods = "addNewMethod")
	public void newCustomerMethod()
	{
		Pages.ActitimeTasksPage newcustomer=new Pages.ActitimeTasksPage(driver);
		newcustomer.newcustomerMethod();
	}
	
	@Test(dependsOnMethods = "newCustomerMethod")
	public void createCustomerMethod() throws InterruptedException, IOException
	{
		ActitimeCreateNewCustomerPage customerpage=new ActitimeCreateNewCustomerPage(driver);
		customerpage.createcustomerMethod();
	}

	@Test(dependsOnMethods = "createCustomerMethod")
	public void logoutMethod()
	{
		ActitimeHomePage logout=new ActitimeHomePage(driver);
		logout.logoutMethod();
	}
}
