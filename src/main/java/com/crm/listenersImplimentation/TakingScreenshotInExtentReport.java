package com.crm.listenersImplimentation;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import commonUtils.BaseClass;

public class TakingScreenshotInExtentReport extends BaseClass implements ITestListener {
	public ExtentTest test;
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public TakesScreenshot sc;
	@Override
	public void onTestStart(ITestResult result) {
		String name =result.getMethod().getMethodName();
		test=report.createTest(name);
		test.log(Status.INFO, "my first project");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name =result.getMethod().getMethodName();
		
		test.log(Status.PASS,name+" test case is passed" );
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name =result.getMethod().getMethodName();
		
		test.log(Status.FAIL,name+" test case is fail" );
		
		//logic for on test failure;
		 sc = (TakesScreenshot)driver;
//		 File from = sc.getScreenshotAs(OutputType.FILE);
//		 File to =  new File("./screenshot/dwsfail.png");
//		 String path = to.getAbsolutePath();
//		 test.addScreenCaptureFromPath(path);
		
		String from = sc.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name =result.getMethod().getMethodName();
		
		test.log(Status.SKIP,name+" test case is skipped" );
	}

	@Override
	public void onStart(ITestContext context) {
		//logic for extent report
		File path = new File("./screenshotExReport/capture.html");
		 spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("screenshot in report");
		spark.config().setReportName("kalyani");
		spark.config().setTheme(Theme.STANDARD);
		
		 report =  new ExtentReports();
		report.setSystemInfo("os", "mac");
		report.setSystemInfo("browser","chrome");
		//attach spark report in extent report
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	
}
