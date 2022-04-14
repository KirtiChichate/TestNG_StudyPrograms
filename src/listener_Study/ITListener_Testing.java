package listener_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ITListener_Testing {
  //convert this ITListener_Testing and ITListener_1Testing to convert to testng and make listener changes on test level in xml
	@Test
	  public void Amethod() {
		Reporter.log("Amethod is running",true);  
		  
	  }
	  
	  @Test
	  public void Bmethod() {
		  Reporter.log("Bmethod is running",true);   
		  
	  }
	  
	  @Test
	  public void Cmethod() {
		 Assert.fail();
		  Reporter.log("Cmethod is running",true);   
		  
	  }
	  
	  @Test(dependsOnMethods = {"Cmethod"})
	  public void Dmethod() {
		  Reporter.log("Dmethod is running",true);  
		  
	  }
}
