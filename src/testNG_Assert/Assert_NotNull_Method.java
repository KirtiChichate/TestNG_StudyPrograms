package testNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NotNull_Method {
 
	
	@Test
  public void method() {
  
//	    Assert is one of the class where assertnotnull is its static method
//   when acutal thing which is created by user like this	
	
//		String name="khdfhdf";
		
		String name=null;  //to execute failed test case 
		
// is matches the scenario means notnull and our expected thing or scenario is also notnull then this test case is passed and the message return inside it is not display
// but when this actual result is differ from the expected result then this method got failed and the message written inside it will get display in the form of message 
// means assertnotnull =returns null value or is null and name= returns notnull value then it matches so its satisfy the condition
//Its msg written inside methods is also written on the negative basis.
							
							//notnull need one object parameter and one string msg inside the method	
		Assert.assertNotNull(name, "name is null value");
		
	}
}
