package testNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NotEquals_Method {
 
	
	@Test
  public void method() {

//	    Assert is one of the class where assertnotequals is its static method
//   when acutal thing which is created by user like this	
		String name1="Kirti";
		String name2="Kirti1";
		
		//change something under name2 to make case failed
//		String name2="Kirti";
		
// is matches the scenario means notequals and our expected thing or scenario is also notequals then this test case is passed and the message return inside it is not display
// but when this actual result is differ from the expected result then this method got failed and the message written inside it will get display in the form of message 
// means assertnotequals =returns True or is notequals and name1 and name2= returns notequals then it matches so its satisfy the condtion
//This msg written inside methods is also written on the negative basis.
			
			//notequals need two parameter and one string msg inside the method	
	
	Assert.assertNotEquals(name1, name2, "name1 and name2 is not equals");
	
	}
}
