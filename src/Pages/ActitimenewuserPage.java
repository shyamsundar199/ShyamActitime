package Pages;

import java.io.IOException;
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
import generics.ExcelLibrary;

public class ActitimenewuserPage extends BasePage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//input[contains(@id,'createUserPanel_firstName')]")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[contains(@id,'createUserPanel_lastName')]")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[contains(@id,'createUserPanel_email')]")
	private WebElement email;
	
	@FindBy(xpath = "//div[.='Save & Send Invitation']")
	private WebElement sendinvitation;
	
	public ActitimenewuserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void adduserMethod() throws IOException
	{
		webdriverwaitvisibilityof(driver, firstname);
		firstname.sendKeys(ExcelLibrary.getCellvalue(sheet_name5, 0, 0));
		
		webdriverwaitvisibilityof(driver, lastname);
		lastname.sendKeys(ExcelLibrary.getCellvalue(sheet_name5, 0, 1));
		
		webdriverwaitvisibilityof(driver, email);
		email.sendKeys(ExcelLibrary.getCellvalue(sheet_name5, 0, 2));
		
		webdriverwaitvisibilityof(driver, sendinvitation);
		//Helper.highlightelement(driver, sendinvitation);
		javascriptclick(driver, sendinvitation);
	}
}
