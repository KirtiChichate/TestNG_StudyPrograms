package testNG_Grouping_Concept;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingClass1 {

	@Test(groups="Sanity")
  public void TestCase1() {
 
	Reporter.log("Test Case 1 Is running",true);
	}
	
	@Test(groups="Regression")
	  public void TestCase2() {
	 
		Reporter.log("Test Case 2 Is running",true);
	}
	
	@Test(groups="Sanity")
	  public void TestCase3() {
	  
		Reporter.log("Test Case 3 Is running",true);
	}
	
	@Test(groups="Regression")
	  public void TestCase4() {
	 
		Reporter.log("Test Case 4 Is running",true);
	}
	
	@Test(groups="Sanity")
	  public void TestCase5() {
	
		Reporter.log("Test Case 5 Is running",true);
	}
	
	@Test
	  public void TestCase6() {
	 
		Reporter.log("Test Case 6 Is running",true);
	}
}
