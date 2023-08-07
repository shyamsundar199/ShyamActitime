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

public class ActitimeTypesOfWorkPage extends BasePage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement createtypeofworkButton;
	
	@FindBy(xpath = "//a[.='qspiders']/../..//a[contains(text(),'delete')]")
	private WebElement deleteworkLink;
	
	public ActitimeTypesOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createtypeofworkMethod() throws InterruptedException
	{
		webdriverwaitvisibilityof(driver, createtypeofworkButton);
		//Helper.highlightelement(driver, createtypeofworkButton);
		javascriptclick(driver, createtypeofworkButton);
		Thread.sleep(3000);
	}
	
	public void deleteworkMethod()
	{
		webdriverwaitvisibilityof(driver, deleteworkLink);
		//Helper.highlightelement(driver, deleteworkLink);
		javascriptclick(driver, deleteworkLink);
		alertaccept(driver);
		
		//driver.switchTo().alert().accept()
	}
}
