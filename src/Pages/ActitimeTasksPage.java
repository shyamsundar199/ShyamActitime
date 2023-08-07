package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Autoconstant;
import generics.BasePage;

public class ActitimeTasksPage extends BasePage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath = "//div[@class='item createNewProject']")
	private WebElement newprojectLink;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addnewMethod()
	{
		webdriverwaitvisibilityof(driver, addnewButton);
		//Helper.highlightelement(driver, addnewButton);
		javascriptclick(driver, addnewButton);
	}
	
	public void newcustomerMethod()
	{
		webdriverwaitvisibilityof(driver, newcustomerLink);
		//Helper.highlightelement(driver, newcustomerLink);
		javascriptclick(driver, newcustomerLink);
	}
	
	public void newprojectMethod()
	{
		webdriverwaitvisibilityof(driver, newprojectLink);
	//	Helper.highlightelement(driver, newprojectLink);
		javascriptclick(driver, newprojectLink);
	}
}
