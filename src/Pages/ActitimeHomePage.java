package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.Autoconstant;
import generics.BasePage;
import generics.Helper;

public class ActitimeHomePage extends BasePage implements Autoconstant
{
	public WebDriver driver;

	@FindBy(id = "container_tasks")
	private WebElement tasksLink;

	@FindBy(id = "container_users")
	private WebElement usersLink;

	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;

	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void tasksMethod() throws InterruptedException
	{
		webdriverwaitvisibilityof(driver, tasksLink);
		//Helper.highlightelement(driver, tasksLink);
		javascriptclick(driver, tasksLink);
	}

	public void usersMethod()
	{
		webdriverwaitvisibilityof(driver, usersLink);
		//Helper.highlightelement(driver, usersLink);
		javascriptclick(driver, usersLink);
	}	
	
	public void settingsMethod()
	{
		webdriverwaitvisibilityof(driver, settingsLink);
		//Helper.highlightelement(driver, settingsLink);
		javascriptclick(driver, settingsLink);
	}

	public void logoutMethod()
	{
		webdriverwaitvisibilityof(driver, logoutLink);
		//Helper.highlightelement(driver, logoutLink);
		javascriptclick(driver, logoutLink);
	}	
}