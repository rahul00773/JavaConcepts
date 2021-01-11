package reportin;

import org.testng.*;

public class SimpleListernet implements ITestListener, ISuiteListener {


    @Override
    public void onStart(ISuite suite) {

    }

    @Override
    public void onFinish(ISuite suite) {

    }

    public void onTestStart(ITestResult result) {
        // not implemented
        System.out.println("Starting test case");

    }
}
