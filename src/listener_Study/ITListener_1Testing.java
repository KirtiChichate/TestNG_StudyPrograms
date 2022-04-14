package listener_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ITListener_1Testing {
	 //convert this ITListener_Testing and ITListener_1Testing to convert to testng and make listener changes on test level in xml
	@Test
	  public void Emethod() {
		Reporter.log("Emethod is running",true);  
		  
	  }
	  
	  @Test
	  public void Fmethod() {
		  Reporter.log("Fmethod is running",true);   
		  
	  }
	  
	  @Test
	  public void Imethod() {
		 Assert.fail();
		  Reporter.log("Imethod is running",true);   
		  
	  }
	  
	  @Test(dependsOnMethods = {"Imethod"})
	  public void Jmethod() {
		  Reporter.log("Jmethod is running",true);  
		  
	  }
}
