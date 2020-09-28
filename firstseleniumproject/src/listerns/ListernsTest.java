package listerns;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListernsTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("the name of testcase started is " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("the name of testcase passed is " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("the name of testcase failed is " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("the name of testcase skipped is " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
