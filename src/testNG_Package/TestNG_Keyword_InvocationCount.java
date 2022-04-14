package testNG_Package;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class TestNG_Keyword_InvocationCount {
 
	
	//use this keyword here
/* 1.	invocationCount:Sometimes same test method/TC need to be executed multiple times which can be possible 
         by using TestNG keyword "invocationCount"
  */	
	@Test(invocationCount = 3)
  public void method()
  {
	  
	 Reporter.log("This is a simple method running",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("this is before method is running",true);
  }

}
