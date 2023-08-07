package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.BasePage;

public class ActitimeLeavePage extends BasePage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//span[.='Create Leave Type'])[1]")
	private WebElement createLeaveType;
	
	public ActitimeLeavePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createLeaveType()
	{
		webdriverwaitvisibilityof(driver, createLeaveType);
		//Helper.highlightelement(driver, typesofworkLink);
		javascriptclick(driver, createLeaveType);
	}
}
