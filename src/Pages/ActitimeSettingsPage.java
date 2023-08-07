package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.BasePage;
import generics.Helper;

public class ActitimeSettingsPage extends BasePage implements Autoconstant
{
	public WebDriver driver;

	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typesofworkLink;

	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement leavetypesLink;

	public ActitimeSettingsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void typesofworkMethod()
	{
		webdriverwaitvisibilityof(driver, typesofworkLink);
		//Helper.highlightelement(driver, typesofworkLink);
		javascriptclick(driver, typesofworkLink);
	}

	public void leavetypesMethod()
	{
		webdriverwaitvisibilityof(driver, leavetypesLink);
		//Helper.highlightelement(driver, usersLink);
		javascriptclick(driver, leavetypesLink);
	}
}