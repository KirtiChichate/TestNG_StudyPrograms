package pom_Classes_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_WrongPassword {


//	Step 1)--->globallically declare the data members---Declaration
//	@FindBy(AttributeName="Attribute value") private WebElement Datamember;
	
	@FindBy(id="userid") private WebElement UserId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	@FindBy(xpath="//p[@class='error text-center']") private WebElement ErrorMessage;
	
//  Step 2)--->create a constructor having public access specifier and in that create pagefactory class
	
	public Kite_WrongPassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
// Step 3)--->create parameterized method 
	
	public void EnterUsername(String Username)
	{
		UserId.sendKeys(Username);
	}
	
	
	public void EnterPassword(String Passwd)
	{
		Password.sendKeys(Passwd);
	}

	public String GetErrormessage(String Message)
	{
		String ActualErrorMessage=ErrorMessage.getText();
		return ActualErrorMessage;
		
	}
	public void ClickingLoginButton()
	{
		LoginButton.click();
	}
	
	
	
}
