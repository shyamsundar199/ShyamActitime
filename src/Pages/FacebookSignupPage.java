package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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

public class FacebookSignupPage extends BasePage implements Autoconstant
{
	public WebDriver driver;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstnameTextfield;

	@FindBy(name = "lastname")
	private WebElement lastnameTextfield;

	@FindBy(name = "reg_email__")
	private WebElement emailfield;

	@FindBy(name = "reg_passwd__")
	private WebElement passwordfield;
	
	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement datebutton;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement monthbutton;
	
	@FindBy(xpath = "//select[@title='Year']")
	private WebElement yearbutton;
	
	@FindBy(xpath = "//label[.='Male']")
	private WebElement malebutton;
	
	@FindBy(xpath = "(//button[.='Sign Up'])[1]")
	private WebElement signupbutton;
	
	@FindBy(xpath = "//a[.='Create new account']")
    private WebElement createnewaccount;

	public  FacebookSignupPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void signupMethodValid1() throws IOException 
	{
		webdriverwaitvisibilityof(driver, firstnameTextfield);
		//Helper.highlightelement(driver, firstnameTextfield);
		firstnameTextfield.sendKeys(ExcelLibrary.getCellvalue(sheet_name6, 0, 0));
		
		webdriverwaitvisibilityof(driver, lastnameTextfield);
		//Helper.highlightelement(driver, lastnameTextfield);
		lastnameTextfield.sendKeys(ExcelLibrary.getCellvalue(sheet_name6, 0, 1));

		webdriverwaitvisibilityof(driver, emailfield);
		//Helper.highlightelement(driver, emailfield);
		emailfield.sendKeys(ExcelLibrary.getCellvalue(sheet_name6, 0, 2));

		webdriverwaitvisibilityof(driver, passwordfield);
		//Helper.highlightelement(driver, passwordfield);
		passwordfield.sendKeys(ExcelLibrary.getCellvalue(sheet_name6, 0, 3));
		
		selectbyvisibletext(datebutton, "22");
		
		selectbyvisibletext(monthbutton, "Oct");
		
		selectbyvisibletext(yearbutton, "1999");
		
		webdriverwaitvisibilityof(driver, malebutton);
		//Helper.highlightelement(driver, malebutton);
		javascriptclick(driver, malebutton);
	}
	
	public void signupMethod()
    {
		webdriverwaitvisibilityof(driver, createnewaccount);
		//Helper.highlightelement(driver, signupPage);
		javascriptclick(driver, createnewaccount);
    }
	
	public void signupbuttonMethod()
	{
		webdriverwaitvisibilityof(driver, signupbutton);
		//Helper.highlightelement(driver, signupPage);
		javascriptclick(driver, signupbutton);
	}
}