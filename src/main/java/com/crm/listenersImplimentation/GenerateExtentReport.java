package com.crm.listenersImplimentation;

import java.io.File;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport implements ITestListener {

	public  ExtentSparkReporter spark;
	public  ExtentReports report;
	public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name =  result.getMethod().getMethodName();
		test=report.createTest(name);
		System.out.println("");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name =  result.getMethod().getMethodName();
		test.log(Status.PASS, name+"is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name =  result.getMethod().getMethodName();
		test.log(Status.FAIL, name+"is failed");
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name =  result.getMethod().getMethodName();
		test.log(Status.SKIP, name+"is skipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		//we are creating extent report here because this method is general for every testcase
		File path = new File("./ExtentReport/testRun.html");
		 spark = new ExtentSparkReporter(path);
		 spark.config().setDocumentTitle("Demo web shop");
			spark.config().setReportName("kalyani");
			spark.config().setTheme(Theme.STANDARD);
			// attach the report
			report = new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("os", "windows11");
			report.setSystemInfo("browser", "chrome");
			//create the testcase
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
