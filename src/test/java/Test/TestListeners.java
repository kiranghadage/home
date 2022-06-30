package Test;



import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import Utility.ScreenShot;

public class TestListeners extends BaseTest implements ITestListener  {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName() +"test has start");
		
		
	}
	
	public void onTestFailure(ITestResult result)
	{

		try {
			ScreenShot.takeScreenShot(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSucess(ITestResult result)
	{
		System.out.println(result.getName() +"test Sucess");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName() +"test Skipped");
	}

}
