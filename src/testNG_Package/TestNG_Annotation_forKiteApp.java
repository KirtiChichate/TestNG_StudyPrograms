package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNG_Annotation_forKiteApp {
  @Test
  public void validateuserid()
  {
	  System.out.println("UserId is validating means Test case is pass, go to next process");
	  Reporter.log("UserId is validating means Test case is pass, go to next process");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Enter userid and password and login to application");
	  Reporter.log("Enter userid and password and login to application");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("logout the application");
	  Reporter.log("logout the application");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("Launching the browser ");
	  Reporter.log("Launching the browser");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("Close the browser");
	  Reporter.log("Close the browser");
  }
  

}
