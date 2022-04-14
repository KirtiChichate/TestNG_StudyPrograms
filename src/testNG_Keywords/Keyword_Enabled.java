package testNG_Keywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class Keyword_Enabled {
  @Test
  public void A() {
  Reporter.log("This is the method or test case is running",true);
  }
  
  @Test(enabled = false)
  public void B() {
	  Reporter.log("This is the method2 or test case2 is running",true);
  }
  @Test
  public void D() {
	  Reporter.log("This is the method3 or test case3 is running",true);
  }
  @Test(enabled = false)
  public void R() {
	  Reporter.log("This is the method4 or test case4 is running",true);
  }
  @Test
  public void Y() {
	  Reporter.log("This is the method5 or test case5 is running",true);
  }
}
