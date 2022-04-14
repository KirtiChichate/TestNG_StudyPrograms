package testNG_Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Study {

	//Create a object of softassert outside the method or test and inside the class
	//Same methods are applicable here also means the methods which belongs to hardassert class that same can call here but the difference is
	//methods present in hard assert are all static method and methods present in softassert are all nonstatic thats y we need to create obj 1st
	//-----Note-----Always used Objname.assertall method at the last execution within that method or in every method its compulsory to use assertall
	
	SoftAssert softobj= new SoftAssert();
	
	@Test
  public void f() {
 
	String city="Pune";
	String city1="Pune1";
	String city2="Pune";
	
	//call the nonstatic method of softassert class as objname.methodname
	
	softobj.assertEquals(city, city2, "city is not equals to city2");
	softobj.assertEquals(city, city1, "City is not equal to city1");
	
	softobj.assertNotNull(city, "City is having null value");
	
	//Always use assertall before finished the code
	softobj.assertAll();
	
	
	}
}
