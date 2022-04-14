package listener_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Use listeners annotation before the class becz we execute it on class basis and fot this 1st need to creat one java class where we need to use ITestListeners annotation by implementing this ITestListeners

@Listeners(listener_Study.Listener_JavaClass.class)
public class Listener_Concept {
  
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
