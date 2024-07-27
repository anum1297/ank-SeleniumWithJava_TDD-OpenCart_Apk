package com.OpenCart.utilities;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.OpenCart.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Logger log = Logger.getLogger("Opencart Framework");

	     log.info("Testcase Execution Started "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Logger log = Logger.getLogger("Opencart Framework");

		log.info("Testcase Execution Completed "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Logger log = Logger.getLogger("Opencart Framework");
		 log.info("Testcase Execution Failed "+ result.getName());
		 UtilClass.takesSS(result.getName()+"-"+System.currentTimeMillis());
	     log.info("Take Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Logger log = Logger.getLogger("Opencart Framework");

		log.info("Testcase Execution Skipped "+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}


}
