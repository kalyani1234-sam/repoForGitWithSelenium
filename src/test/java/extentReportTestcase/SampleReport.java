package extentReportTestcase;

import java.io.File;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	@Test
	public void launchReport() {
		ExtentReports report = new ExtentReports();
		//File path = new File("")
		ExtentSparkReporter spark = new ExtentSparkReporter("./EXTENTREPORT/ii.html");
		spark.config().setDocumentTitle("sample report for extent report");
		spark.config().setReportName("kalyani");
		spark.config().setTheme(Theme.STANDARD);
		// attach the report
		report.attachReporter(spark);
		report.setSystemInfo("os", "windows11");
		report.setSystemInfo("browser", "chrome");
		//create the testcase
		ExtentTest test1 = report.createTest("test1");
		
		test1.log(Status.FAIL, "why this test case is failed is inform in this");
	    report.flush();
	}
}









//we are going to use spark reporter