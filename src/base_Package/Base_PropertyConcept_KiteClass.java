package base_Package;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import utility_Package.Utility_UsingPropertyFile_KiteClass;

public class Base_PropertyConcept_KiteClass {

protected WebDriver driver; //Here we declare WebDriver globally becz we need WebDriver in both of this methods
	
	public void Launch_Browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		//here insted of launch browser u can have option i.e --disable-notifications to create that you ChromeOptions Class
               Reporter.log("Browser is launching",true);
		       ChromeOptions obj= new ChromeOptions();
		       obj.addArguments("--disable-notifications");
		       driver= new ChromeDriver(obj);   //due to this we r not seeing the notification but the action can be taken in backdata and we got the output in console 
		    
		       driver.get(Utility_UsingPropertyFile_KiteClass.ReadDataFromPropertyFile("URL_Name"));
			   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			   driver.manage().window().maximize();
			   Reporter.log("Browser Lanunched Successfully",true);
		         
	}
	
	public void CloseBrowser()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   	driver.close();
	   	Reporter.log("closing the browser sucessfully");
	
	}
	
	
	
}
