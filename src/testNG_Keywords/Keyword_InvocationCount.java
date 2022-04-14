package testNG_Keywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Keyword_InvocationCount {
  
	//1.	invocationCount:Sometimes same test method/TC need to be executed multiple times which can be possible by using TestNG keyword "invocationCount"
//	eg.invocationCount=5;

	@Test(invocationCount = 3)
  public void Method() {
  
  Reporter.log("This is a method is running with keyword Invocations count ",true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
  
	  Reporter.log("This is a before method is running ",true);
  
  }

 
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is a after method is running ",true);
  
  }

  @BeforeClass
  public void beforeClass() {
  
	  Reporter.log("This is a before class is running ",true);
  
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("This is a after class is running ",true);
  
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("This is a After Test is running ",true);
  
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is a before suit is running ",true);
  Reporter.log("####################################",true);
  }
 
}
