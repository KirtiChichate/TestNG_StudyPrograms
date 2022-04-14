package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNG_Annotation_Study {
  @Test
  public void method()
  {
	  System.out.println("this is syso of method");
	  Reporter.log("This is a reporterlog of method");
  }
  /*as per the standard format the sequence of this annotation is as follows
  <Suite>
     <test>
       <classes>
          <class>
            <methods>
            
            </methods>
          </class>
        </classes>
      </test>
    </Suite>
    
    but when we write below type of annotation then it will anywhere u can write but but it will print as per the standarization
    and same there is not compulsation to take this in a pair like if we take beforemethod and then to take aftermethod is not compulsory
  */
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("this is syso of beforemethod");
	  Reporter.log("This is a reporterlog of beforemethod");
	  
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("this is syso of aftermethod");
	  Reporter.log("This is a reporterlog of aftermethod");
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("this is syso of before class");
	  Reporter.log("This is a reporterlog of before class");
	  
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("this is syso of after class");
	  Reporter.log("This is a reporterlog of after class");
	  
  }

}
