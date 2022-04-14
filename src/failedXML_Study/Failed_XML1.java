package failedXML_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_XML1 {
  @Test(timeOut = 1100)
  public void Method1() throws InterruptedException {
  Thread.sleep(1000);
  Reporter.log("Method 1 is running",true);
  }
  
  @Test
  public void Method2() {
  
  Reporter.log("Method 2 is running",true);
  }
  
  @Test
  public void Method3() {
  //Assert.fail();
  Reporter.log("Method 3 is running",true);
  }
  
  @Test
  public void Method4() {
  
  Reporter.log("Method 4 is running",true);
  }
  
  @Test
  public void Method5() {
  
  Reporter.log("Method 5 is running",true);
  }
}
