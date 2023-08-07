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

public class ActitimeUserPage extends BasePage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath =  "//div[.='New User']")
	private WebElement newuser;
	
	public ActitimeUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void newuserMethod()
	{
		webdriverwaitvisibilityof(driver, newuser);
		//Helper.highlightelement(driver, newuser);
		javascriptclick(driver, newuser);
	}
}