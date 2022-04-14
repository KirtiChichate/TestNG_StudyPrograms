package testNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_True_Method {
 
	
	@Test
  public void Method() {
 //Assert is one of the class where asserttrue is its static method
//   when acutal thing which is created by user like this
		boolean result=true;
// is matches the scenario means true and our expected thing or scenario is also true then this test case is passed and the message return inside it is not display
// but when this actual result is differ from the expected result then this method got failed and the message written inside it will get display
// means asserttrue =returns True and result= returns True it matches so its satisfy the condtion
//This msg is also written on the negative basis.
		
		Assert.assertTrue(result, "Result is not true");
	
	}
}
