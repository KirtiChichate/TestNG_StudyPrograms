package testNG_SerialParallel_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serial_ParallelClass2 {
  @Test
  public void Method1() throws InterruptedException {
 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize(); 
		Thread.sleep(1000);
		driver.close();
  }
}
