package testNG_Include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude1 {

 @Test
  public void TestCase1() {
 
 Reporter.log("Test Case 1 is running",true);
 }
 
 @Test
 public void TestCase2() {

Reporter.log("Test Case 2 is running",true);
}
 
 @Test
 public void TestCase3() {

Reporter.log("Test Case 3 is running",true);
}
 
 @Test
 public void TestCase4() {

Reporter.log("Test Case 4 is running",true);
}
 
 @Test
 public void TestCase5() {

Reporter.log("Test Case 5 is running",true);
}
}
