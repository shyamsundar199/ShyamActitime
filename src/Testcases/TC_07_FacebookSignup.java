package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.FacebookSignupPage;
import generics.BaseTest;

public class TC_07_FacebookSignup extends BaseTest
{
  @Test
  public void loginMethod()
  {
	  FacebookSignupPage signup= new FacebookSignupPage(driver);
	  signup.signupMethod();
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void signupMethod() throws IOException
  {
	  FacebookSignupPage createnew=new FacebookSignupPage(driver);
	  createnew.signupMethodValid1();
  }
  
  @Test(dependsOnMethods = "signupMethod")
  public void createnewMethod()
  {
	  FacebookSignupPage createnew=new FacebookSignupPage(driver);
	  createnew.signupbuttonMethod();
  }
}