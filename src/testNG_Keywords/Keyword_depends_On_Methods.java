package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_depends_On_Methods {
 
	@Test(timeOut = 1050)
  public void Aa() throws InterruptedException {
    Thread.sleep(1000);
		Reporter.log("This is a method of @test running",true);
	
	}
	
	@Test(dependsOnMethods = {"Aa"})
	  public void Bb() {
		 Reporter.log("This is a method1 of @test running",true);
		
		}
	
	@Test(invocationCount = 2)
	  public void Cc() {
		 Reporter.log("This is a method2 of @test running",true);
		
		}
	
	@Test(dependsOnMethods = {"Cc"})
	  public void Dd() {
		 Reporter.log("This is a method3 of @test running",true);
		
		}
}
