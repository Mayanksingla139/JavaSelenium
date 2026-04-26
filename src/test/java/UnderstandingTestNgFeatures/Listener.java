package UnderstandingTestNgFeatures;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    public void onStart(ITestContext context){
        System.out.println("On Start Listener");
    }

    public void onTestStart(ITestResult result){
        System.out.println("On Test Start Listener");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success Listener");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("On Test Fail Listener");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("On Test Skipped Listener");
    }

    public void onFinish(ITestContext context) {
        System.out.println("On Finish Listener");
    }
}
