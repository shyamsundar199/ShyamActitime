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

public class Facebookloginpage
{
    public WebDriver driver;
	public Properties properties;	
	public WebDriverWait wait;
	public JavascriptExecutor js;
	public FileInputStream fis;
	
    @FindBy(id = "email")
    private WebElement usernameTextfield;
    
    @FindBy(id = "pass")
    private WebElement passwordTextfield;
    
    @FindBy(xpath = "//button[@name='login']")
    private WebElement loginButton;
    
    @FindBy(xpath = "//a[.='Create new account']")
    private WebElement signupPage;
    
    public  Facebookloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
    public void loginMethodValidusernameValidpassword() throws IOException 
    {
    	fis=new FileInputStream("./properties/config.properties");
    	properties=new Properties();
    	properties.load(fis);
    	js=(JavascriptExecutor)driver;
    	
    	wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
    	usernameTextfield.sendKeys(properties.getProperty("validfbusername1"));
    	
    	wait.until(ExpectedConditions.visibilityOf(passwordTextfield));
    	passwordTextfield.sendKeys(properties.getProperty("validfbpassword1"));
    	
    	loginButton.click();
    }
    public void loginMethodInvalidusernameValidpassword() throws IOException 
    {
    	fis=new FileInputStream("./properties/config.properties");
    	properties=new Properties();
    	properties.load(fis);
    	js=(JavascriptExecutor)driver;
    	
    	wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
    	usernameTextfield.sendKeys(properties.getProperty("validfbusername2"));
    	
    	wait.until(ExpectedConditions.visibilityOf(passwordTextfield));
    	passwordTextfield.sendKeys(properties.getProperty("validfbpassword2"));
    	
    	loginButton.click();
    }
    public void loginMethodValidusernameInvalidpassword() throws IOException 
    {
    	fis=new FileInputStream("./properties/config.properties");
    	properties=new Properties();
    	properties.load(fis);
    	js=(JavascriptExecutor)driver;
    	
    	wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
    	usernameTextfield.sendKeys(properties.getProperty("validfbusername3"));
    	
    	wait.until(ExpectedConditions.visibilityOf(passwordTextfield));
    	passwordTextfield.sendKeys(properties.getProperty("validfbpassword3"));
    	
    	loginButton.click();
    }
    public void loginMethodInvalidusernameInvalidpassword() throws IOException 
    {
    	fis=new FileInputStream("./properties/config.properties");
    	properties=new Properties();
    	properties.load(fis);
    	js=(JavascriptExecutor)driver;
    	
    	wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
    	usernameTextfield.sendKeys(properties.getProperty("validfbusername4"));
    	
    	wait.until(ExpectedConditions.visibilityOf(passwordTextfield));
    	passwordTextfield.sendKeys(properties.getProperty("validfbpassword4"));
    	
    	loginButton.click();
    }
    
    public void signupMethod()
    {
    	signupPage.click();
    }
}
