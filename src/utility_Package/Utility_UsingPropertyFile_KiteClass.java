package utility_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility_UsingPropertyFile_KiteClass {

	
	public static String ReadDataFromPropertyFile(String KEY) throws IOException
	{
		//Create object of Properties class
		Properties objPro= new Properties();
		
		
		//Now to get the data from propertFile also We need to create Object of FileInputStream class And parameter in that as a path of PropertyFile
	FileInputStream objFile= new FileInputStream("C:\\Users\\OWNER\\eclipse-workspace\\TestNG_Study\\PropertyFileData1.properties");
			//To get path of propertyFile go to testoutput-->go to PropertyFile-->ClickRightclick-->use properties option--->clickthat-->copypath and paste
	
	
	//use obj name of properties interface and call load method in that pass argument as obj name of FileInputStream
	objPro.load(objFile);
	
	//Now again use obj name of Property interface and call one of the method i.e getproperty by passing parameter as key and also this parameter in the method parameter
	String value = objPro.getProperty(KEY);
	
		return value;
	}
	
	
	public static void TakeScreenshot(WebDriver driver, int TCID) throws IOException     //here we add in the parameter WebDriver driver becz screenshot will taken using TakesScreenshot interface which is connect with WebDriver 
	{                                                                                    //and we also add TC in parameter becz we want screenshot when TC is getting Passed
		 
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Desti = new File("C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\ScreenShot By Automation\\"+TCID+"PropertySC.png");
		FileHandler.copy(Source, Desti);
		Reporter.log("Taking Screenshot of TC becz TC is passed"+TCID,true);  //Here we add TCID in comment becz when this tc get passed then it will take screenshot that y we concat TCID
	}
}
