package testNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_ReporterLog_Study {
 
	@Test
  public void method1() 
  {
		//print a single statement under @test inside one test case method by using system.out.println();
	  System.out.println("This is my TestNG with syso is running");
	  
  }
	
	@Test
	public void method2()
	{
		//print a single statment under @test inside one test case method by using reporter.log
		Reporter.log("this is a testng with reporter is running");
	}
}
