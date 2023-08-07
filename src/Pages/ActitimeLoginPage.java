package Pages;

import generics.Autoconstant;
import generics.BasePage;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.ExcelLibrary;
import generics.Helper;

public class ActitimeLoginPage extends BasePage implements Autoconstant
{
public WebDriver driver;
	
	@FindBy(id = "usernam")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws IOException, InterruptedException
	{
		webdriverwaitvisibilityof(driver, usernameTextfield);
		//javascriptenter(driver, usernameTextfield, "arguments[0].value='admin'");
		Helper.highlightelement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getCellvalue(sheet_name, 1, 0));
		
		webdriverwaitvisibilityof(driver, passwordTextfield);
		Helper.highlightelement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getCellvalue(sheet_name, 1, 1));
		
		webdriverwaitvisibilityof(driver, keepmeloggedinCheckbox);
		Helper.highlightelement(driver, keepmeloggedinCheckbox);
		javascriptclick(driver, keepmeloggedinCheckbox);
		
		webdriverwaitvisibilityof(driver, loginButton);
		Helper.highlightelement(driver, loginButton);
		javascriptclick(driver, loginButton);
	}
	
	public void validateTitle()
	{
		webdriverwaittitlecontains(driver, "Enter");
		gettitle(driver, "actiTIME - Enter Time-Track");
	}
}