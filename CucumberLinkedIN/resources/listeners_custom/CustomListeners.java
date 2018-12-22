package listeners_custom;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		// When test method starts
				System.out.println("onTestStart -> Test Name: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		// If test method is successful
				System.out.println("onTestSuccess -> Test Name: " + result.getName());
				
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		// If test method is failed
				System.out.println("onTestFailure -> Test Name: " + result.getName());
				result.getStatus();
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		// Before <test> tag of xml file
				System.out.println("onStart -> Test Tag Name: " + context.getName());
				ITestNGMethod methods[] = context.getAllTestMethods();
				System.out.println("These methods will be executed in this test tag:");
				for (ITestNGMethod method : methods) {
					System.out.println(method.getMethodName());
				}

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		// After <test> tag of xml file
				System.out.println("onFinish -> Test Tag Name: " + context.getName());
		
	}

	

}
