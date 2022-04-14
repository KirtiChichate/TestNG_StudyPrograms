package testNg_CrossBrowser_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox_Launching_Study {
 
	@Test
  public void Method() throws InterruptedException {
  
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\geckodriver.exe");
	
	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://in.bookmyshow.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.close();
	}
}
