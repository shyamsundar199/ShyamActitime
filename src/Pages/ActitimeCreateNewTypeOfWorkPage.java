package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Autoconstant;
import generics.BasePage;
import generics.ExcelLibrary;
import generics.Helper;

public class ActitimeCreateNewTypeOfWorkPage extends BasePage implements Autoconstant
{
	public WebDriver driver;

	@FindBy(name = "name")
	private WebElement nameTextfield;

	@FindBy(xpath = "//select[@name='active']")
	private WebElement statusDropdownlist;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createtypeofworkButton;

	public ActitimeCreateNewTypeOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	public void createworkMethod() throws IOException
	{
		webdriverwaitvisibilityof(driver, nameTextfield);
		//Helper.highlightelement(driver, nameTextfield);
		nameTextfield.sendKeys(ExcelLibrary.getCellvalue(sheet_name3, 0, 0));
        
		//		Select select=new Select(statusDropdownlist);
		//		select.selectByVisibleText("archived");

		selectbyvisibletext(statusDropdownlist, "archived");
		//statusDropdownlist.sendKeys(ExcelLibrary.getCellvalue(sheet_name3, 0, 1));

		webdriverwaitvisibilityof(driver, createtypeofworkButton);
		//Helper.highlightelement(driver, createtypeofworkButton);
		javascriptclick(driver, createtypeofworkButton);
	}
}