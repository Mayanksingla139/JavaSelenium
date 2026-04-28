package UnderstandingTestNgFeatures;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {

    public ExtentSparkReporter sparkReporter;
    public ExtentReports extentReports;
    public ExtentTest extentTest;

    public void onStart(ITestContext context){
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Mayank Singla");
        sparkReporter.config().setTheme(Theme.DARK);

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);

        extentReports.setSystemInfo("Computer Name", "HP");
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Tester Name", "Mayank");
        extentReports.setSystemInfo("OS", "Window 11");
        extentReports.setSystemInfo("Browser Name", "Chrome");
        extentReports.setSystemInfo("Project Name", "Java Selenium Hands On");
    }

    public void onTestSuccess(ITestResult result) {
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.PASS, "Test Case is Passed: "+result.getName());
    }

    public void onTestFailure(ITestResult result) {
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.FAIL,"Test Case is Failed: "+result.getName());
        extentTest.log(Status.FAIL, "Test Case is Failed Cause is: "+result.getThrowable());
    }

    public void onTestSkipped(ITestResult result) {
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.SKIP,"Test Case is Skipped: "+result.getName());
        extentTest.log(Status.SKIP, "Test Case is Skipped Cause is: "+result.getThrowable());
    }

    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}
