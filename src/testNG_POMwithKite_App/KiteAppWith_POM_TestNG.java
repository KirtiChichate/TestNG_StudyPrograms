package testNG_POMwithKite_App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class KiteAppWith_POM_TestNG {

	 //declare this globally becz we use at every test case
	WebDriver driver;
	Sheet GetSheet;
	 Kite_Login_DDFPage login;
	 Kite_Pin_DDFPage pin;
	 Kite_Home_DDFPage home;
	 
	 @BeforeClass
	  public void launchbrowser() throws EncryptedDocumentException, IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
			
		//here insted of launch browser u can have option i.e headless to create that 
                Reporter.log("Browser is launching",true);
		        ChromeOptions obj= new ChromeOptions();
		        obj.addArguments("--disable-notifications");
		         driver= new ChromeDriver(obj);   //due to this we r not seeing the browser but the action can be taken in backdata and we got the output in console 
	   
		        driver.get("https://kite.zerodha.com/");
		        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		        driver.manage().window().maximize();
		        Reporter.log("Browser Lanunched Successfully",true);
		        
		        //Now as we r using Pom concept so we need to take the data which is saved in excel using reading the excel
		        FileInputStream ObjFIS= new FileInputStream("C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\Automation Excel sheet\\IntroExcel.xlsx");
	             GetSheet = WorkbookFactory.create(ObjFIS).getSheet("DDF Data");
	           
	             login= new Kite_Login_DDFPage(driver);
	             pin= new Kite_Pin_DDFPage(driver);
	             home= new Kite_Home_DDFPage(driver);
	            
	            
	 }
	
	 
	 @BeforeMethod
    public void logintoKiteApp() {
	        Reporter.log("Welcome to kite login page",true);
		    String UsernameDDF = GetSheet.getRow(1).getCell(0).getStringCellValue();
			String PasswordDDF = GetSheet.getRow(1).getCell(1).getStringCellValue();
			String pinDDF = GetSheet.getRow(1).getCell(2).getStringCellValue();
	        
			
			login.EnterUsername(UsernameDDF);
			Reporter.log("Enter Username successfully",true);
			login.EnterPassword(PasswordDDF);
			Reporter.log("Enter password successfully",true);
			login.ClickingLoginButton();
			
			Reporter.log("Welcome to kite pin page",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			Reporter.log("Enter pin successfully",true);
			pin.EnterPin(pinDDF);
			pin.ClickingContinueButton();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 }
	 
	 
	  @Test
    public void validateUserID() {
		  Reporter.log("Welcome to kite home page",true);
		  String ExpectedUserID = GetSheet.getRow(1).getCell(0).getStringCellValue();  
		String ActualUserID = home.getActualUserID();
		
		Reporter.log("validating userID",true);
         Assert.assertEquals(ActualUserID, ExpectedUserID, "ActualUserID is not matching ExpectedUserID" );
		Reporter.log("User ID validated suceesfully, TC is passed",true);
	}
  

     @AfterMethod
    public void logoutKiteApp() throws InterruptedException {
       Reporter.log("Clicking on logout");
         home.ClickingLogout();
         Reporter.log("logout sucessfully");
  }

 

     @AfterClass
     public void closeBrowser() {
      
    	 driver.close();
    	 Reporter.log("closing the browser sucessfully");
  }

}
