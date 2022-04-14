package testNG_Keywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Keyword_Timeout {
  @Test(timeOut = 1000)
  public void Method() throws InterruptedException 
  {
	  Thread.sleep(500);  //here if u write thread.sleep min as compare to timeout means ti method 500msec chi hoti ttevda ved ghetla mag tini timeout vr geli to 1000ms parynt chalal mag te execution band zala pn thread.sleep kami aslyanini method execute zali
	                      //ani jarr ya ulat kela manje thread.sleep max ani tyachya compare madhe timeout max tr te case failed hoel
	                      //finally we require timeout>thread.sleep
	                      //timeout jast pahij thread.sleep peksha
	Reporter.log("This is the test case method written for keyword TimeOut",true); 
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("This is the before method is running",true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log ("This is the after method is running",true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log  ("This is the after class method is running",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log ("This is after test method is running",true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log ("This is after before suite is running",true); 
  }

}
