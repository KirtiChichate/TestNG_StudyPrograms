package testNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Null_Method {
  
	
	@Test
  public void method() {
 
//	    Assert is one of the class where assertnull is its static method
//   when acutal thing which is created by user like this	

//		String name=null;

		String name="Kirti";  //To make case failed i take this
		
		
// is matches the scenario means null and our expected thing or scenario is also null then this test case is passed and the message return inside it is not display
// but when this actual result is differ from the expected result then this method got failed and the message written inside it will get display in the form of message 
// means assertnull =returns null value or is null and name= returns null value then it matches so its satisfy the condtion
//Its msg written inside methods is also written on the negative basis.
					
					//null need one object parameter and one string msg inside the method	
		Assert.assertNull(name, "name is not null");
	
	
	}
}
