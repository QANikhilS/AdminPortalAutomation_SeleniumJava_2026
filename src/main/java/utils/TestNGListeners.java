package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
        System.out.println("**********  Execution started  ************");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("**********  Test Case is passed successfully. ************");
	}

	@Override
	public void onTestFailure(ITestResult result) {
      
		System.out.println("**********  Test Case is Failed  ************");
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("**********  Test Case is Skipped  ************");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("**********  Test Case is Failed due to timeout  ************");

	}

	@Override
	public void onStart(ITestContext context) {
        
		System.out.println("**********  Test case Execution started  ************");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("**********  Execution Finished  ************");
	}
	
	
	

}
