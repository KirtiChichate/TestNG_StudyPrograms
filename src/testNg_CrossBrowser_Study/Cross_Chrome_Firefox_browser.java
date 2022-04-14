package testNg_CrossBrowser_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Chrome_Firefox_browser {
 
	@Parameters("BrowserName")   //to open cross browser we need to take parameters and its string name
	@Test
  public void CrossBrowser(String BrowserName) throws InterruptedException {
 
		WebDriver driver = null;  //when it have same obj name of both browser then it needs to make that globally and initialize that by passing null values
	if(BrowserName.equals("chrome"))
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
	    driver= new ChromeDriver();
	}	
		
	else if(BrowserName.equals("firefox"))	
	{
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\geckodriver.exe");
		 driver= new FirefoxDriver();
	}
	
	driver.get("https://www.irctc.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.close();
	
//	--------######---Note----Note---Note---#######
	// you just write code here but you cant run this code here for that you need to run it in XML code 
	}
}
