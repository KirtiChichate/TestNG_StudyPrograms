package testNG_Grouping_Concept;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingClass2 {
  

	@Test(groups="Sanity")
  public void TestCase7() {
 
	Reporter.log("Test Case 7 Is running",true);
	}
	
	@Test(groups="Regression")
	  public void TestCase8() {
	 
		Reporter.log("Test Case 8 Is running",true);
	}
	
	@Test(groups="Sanity")
	  public void TestCase9() {
	  
		Reporter.log("Test Case 9 Is running",true);
	}
	
	@Test(groups="Regression")
	  public void TestCase10() {
	 
		Reporter.log("Test Case 10 Is running",true);
	}
	
	@Test(groups="Sanity")
	  public void TestCase11() {
	
		Reporter.log("Test Case 11 Is running",true);
	}
	
	@Test
	  public void TestCase12() {
	 
		Reporter.log("Test Case 12 Is running",true);
	}
}
