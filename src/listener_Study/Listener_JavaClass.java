package listener_Study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_JavaClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TestCase Started successfully",true);
		ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestCase completed successfully",true);
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TestCase get Skipped",true);
		ITestListener.super.onTestSkipped(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TestCase Failed",true);
		ITestListener.super.onTestFailure(result);
	}
}
