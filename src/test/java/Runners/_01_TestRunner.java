package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Smoke Test : En genel manada ana unsurlari test etme.
 * RegressionTest : Butun birimleri uyumlu sekilde calisma testi
 */


@CucumberOptions (
        features = {"src/test/java/FeatureFiles"},   // buraya features fileler in path i verilecek
        glue =     {"StepDefinitions"},                  // step definitions in klasoru yazilacak
        dryRun =   false    // true oldugunda testi calistirma sadece feature lara ait steplerin varligini lontrol eder.
                         // false oldugunda ise testi calistirir.



)
public class _01_TestRunner extends AbstractTestNGCucumberTests {





}
