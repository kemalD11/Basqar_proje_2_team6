package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // oluşturalacak raporun yeri ve adı veriliyor.
        }
)
public class _05_TestRunnerExtendReport extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void beforeClass(){

    }

    @AfterClass
    public static void afterClass()
    {
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml"); // ayarlar alındı, cucumber extend reporttan haberi oldu
        Reporter.setSystemInfo("User Name", "Kemal DURGUN");
        Reporter.setSystemInfo("Application Name", "Basqar");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");
    }

}
