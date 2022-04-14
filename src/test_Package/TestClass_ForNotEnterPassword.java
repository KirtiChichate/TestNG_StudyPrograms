package test_Package;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_Package.Base_KiteClass;
import pom_Classes_Package.Kite_WrongPassword;
import testNG_POMwithKite_App.Kite_Home_DDFPage;
import testNG_POMwithKite_App.Kite_Login_DDFPage;
import testNG_POMwithKite_App.Kite_Pin_DDFPage;
import utility_Package.Utility_KiteClass;

public class TestClass_ForNotEnterPassword extends Base_KiteClass {
  
	Kite_Login_DDFPage login;
	Kite_WrongPassword Error; 

	 
@BeforeClass
 public void Lunching_Browser() {
	 
	 LaunchBrowser(); //we call direcctly by method name this LaunchBrowser method of base class as we extends base class
	  
	  //Now we have to create object of login,pin and home page class here and  declaring it globally
	  login= new Kite_Login_DDFPage(driver);  //now as we have the visibility of driver before changing default in BASE classes so we have chnge that visibility to protected
	  Error= new Kite_WrongPassword(driver);
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
 }

	 
@BeforeMethod
 public void Login_To_Kite() throws EncryptedDocumentException, IOException {
	 Reporter.log("Kite Login Page Loading",true);
	 //Now Call all The methods of loginclass from pom class  by Objname as we created in above method with its method and passing the parameter in that as Utilityclassname.oneof the methods from that class
	//This we do bexz we store or call our excel file in utility class as we know we use it many times
	  login.EnterUsername(Utility_KiteClass.ReadExcel(1, 0));
	  login.EnterPassword(Utility_KiteClass.ReadExcel(1, 1));
	  Error.GetErrormessage(Utility_KiteClass.ReadExcel(0, 5));
	  login.ClickingLoginButton();

	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	
 }

@Test
 public void Validate_PasswordCorrectOrNot() throws EncryptedDocumentException, IOException {
	 //Declare TC id here
	  //Here we validate our UserID by comparing Actual And Expected userId
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	String ActualErrorMessage = Error.GetErrormessage(null);     
	String ExpectedErrorMessage = Utility_KiteClass.ReadExcel(0, 5);
	Assert.assertEquals(ActualErrorMessage,ExpectedErrorMessage,"Actual is not Matching Expected" );
	
	Reporter.log("UserId Validate Successfully,Tc is passed",true);
	Reporter.log("As TC is passed,So Take Screenshot that HomePage");
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  
 }
 
 
@AfterMethod
 public void LogOut_From_Kite() throws InterruptedException, IOException {
	int TCID=200;
	Utility_KiteClass.TakeScreenshot(driver, TCID);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
 }

 
@AfterClass
 public void Closing_Browser() {
	 Reporter.log("Closing the Browser",true); 
	 CloseBrowser();
	  
	  
 }
}
