package testNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equals_Method {
  
	
	@Test
  public void Method() {
 
//    Assert is one of the class where assertequals is its static method
//   when acutal thing which is created by user like this	
	String name1="Kirti";
//	String name2="Kirti";
	//change something under name2 to make case failed
	String name2="Kirti1";
	
// is matches the scenario means equals and our expected thing or scenario is also equals then this test case is passed and the message return inside it is not display
// but when this actual result is differ from the expected result then this method got failed and the message written inside it will get display
// means assertequals =returns True or is equals and name1 and name2= returns equals then it matches so its satisfy the condtion
//This msg written inside methods is also written on the negative basis.
	
	//equals need two parameter and one string msg inside the method
	Assert.assertEquals(name1,name2 ,"name1 and name2 is not equals " );
	
//java.lang.AssertionError: name1 and name2 is not equals  expected [Kirti1] but found [Kirti]	----->error message when tc get failed	
	}
}
