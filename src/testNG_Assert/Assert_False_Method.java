package testNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_False_Method {
 
	
	@Test
  public void Method() {
  
		//Assert is one of the class where assertfalse is its static method
	//   when acutal thing which is created by user like this
			boolean result=false;
// is matches the scenario means false and our expected thing or scenario is also false then this test case is passed and the message return inside it is not display
// but when this actual result is differ from the expected result then this method got failed and the message written inside it will get display
// means assertfalse =returns false and result= returns false it matches so its satisfy the condtion
//This msg is also written on the negative basis.
			Assert.assertFalse(result, "Result is true");
	
	}
}
