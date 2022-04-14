package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword_Priority {

	//PRIORITY--->To change test method/TC execution order we need to use TestNG keyword "priority"
//priority can be  refer numberline to understand this
//	i. bydefault=0	ii. +ve integer	iii. -ve integer	iv. Duplicate
	
	//priority can't be
//	i. Decimals	ii. Variables		
		
		@Test
		  public void Method() {
		  
		  Reporter.log("This is a method is running with keyword priority ",true);
		  }
		  
		@Test(priority = -1)
		  public void Method1() {
		  
		  Reporter.log("This is a method 1 is running with keyword priority ",true);
		  }
		  
		@Test
		  public void Method2() {
		  
		  Reporter.log("This is a method 2 is running with keyword priority ",true);
		  }
		
		@Test(priority = 2)
		  public void Method3() {
		  
		  Reporter.log("This is a method 3 is running with keyword priority ",true);
		  }
		  
		  

	

}
