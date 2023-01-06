package tests_review;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.BeforeClass;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day11ExtentReports extends TestBase {

    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    @BeforeClass
    public static void extentReportsSetUp(){
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/reports/" + currentTime +"html_report.html";

        extentHtmlReporter= new ExtentHtmlReporter(path);
        extentReports= new ExtentReports();

    }
}
