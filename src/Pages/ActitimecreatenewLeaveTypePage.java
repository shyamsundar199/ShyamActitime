package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.BasePage;
import generics.ExcelLibrary;
import generics.Helper;

public class ActitimecreatenewLeaveTypePage extends BasePage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Leave Type Name']")
	private WebElement leaveTypeName;
	
	@FindBy(xpath = "(//span[.='Create Leave Type'])[2]")
	private WebElement createleavebutton;
	
	public ActitimecreatenewLeaveTypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createnewLeaveMethod() throws IOException 
	{
		webdriverwaitvisibilityof(driver, leaveTypeName);
		//Helper.highlightelement(driver, leaveTypeName);
		leaveTypeName.sendKeys(ExcelLibrary.getCellvalue(sheet_name4, 0, 0));
		
		webdriverwaitvisibilityof(driver, createleavebutton);
		//Helper.highlightelement(driver, usersLink);
		javascriptclick(driver, createleavebutton);
	}
}