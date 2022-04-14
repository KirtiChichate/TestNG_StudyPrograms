package testNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail_Method {
//In a test class if one of the test method is failed and that test method execution required for 
//	other test method execution then other test methods will be skipped.

	
	@Test
  public void Method() {
  
//	    Assert is one of the class where assertFail is its static method
//   when acutal thing which is created by user like this	

		Reporter.log("Print a statement before assert fail",true);
		
	Assert.fail();   //if u want to make failed all the methods present inside a class then use fail assert
	
	Reporter.log("Print a statement After assert fail",true);
	//it will fail full script 
	}
}
