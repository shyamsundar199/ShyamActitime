package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Autoconstant;
import generics.BasePage;
import generics.ExcelLibrary;
import generics.Helper;

public class ActitimeCreateNewCustomerPage extends BasePage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomerButton;
	
	@FindBy(xpath="//div[.='Customer with the specified name already exists']")
	private WebElement errormsg;
	
	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createcustomerMethod() throws InterruptedException, IOException
	{
		webdriverwaitvisibilityof(driver, entercustomernameTextfield);
		//Helper.highlightelement(driver, entercustomernameTextfield);
		entercustomernameTextfield.sendKeys(ExcelLibrary.getCellvalue(sheet_name2, 0, 0));
		
		webdriverwaitvisibilityof(driver, createcustomerButton);
		//Helper.highlightelement(driver, createcustomerButton);
		javascriptclick(driver, createcustomerButton);
		Thread.sleep(3000);
    }
	
	public void validateMethod()
	{
		webdriverwaitvisibilityof(driver, errormsg);
		
//		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(errormsg));
		if (errormsg.getText().equals("Customer with the specified name already exists")) 
		{
			System.out.println("error msg is showing");
		}
	}
}
