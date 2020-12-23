package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Aşağıdaki opsionda çalıştırmak istediğimi FEATURE fillerın
 * pathleri verilerek sadece onlar çalıştırıldı
 * Hangi FeatureFiles calisacaginin FeatureFiles parametresine yazila bolum karar veriyor.
 * glue ise bunlara ait STEP lerin lokasyonu gosterilir.
 * Asagidaki ornekte sadece _06_Nationalities.feature ve _07_Nationalities.feature calisacak */


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_06_Nationalities.feature","src/test/java/FeatureFiles/_07_ItemCategories.feature"},
        glue = {"StepDefinitions"},
        dryRun = false

)


public class _02_TestRunnerBelirliTestler extends AbstractTestNGCucumberTests {
}

/**
 * Runner Classlar ne için kullanılır: Belirli veya grupladığımı testleri toplu olarak çalıştırma imkanı veriri.
 * Bunun için;
 * 1- Java Class açılır.
 * 2- AbstractTestNGCucumberTests  extend alınır.Böylece RUN özelliği kazanır
 * 3- Class a   @CucumberOptions annotition ı eklenrek , buraya parametreleri verilerek kullanılır.
 * Genel olarak TestNG deki XML i olarak düşünebilirsiniz.
 *
 * SmokeTest : En genel manada ana unsurları test etme.
 * RegressionTest : Bütün birimleri uyumlu şekilde çalışma test
 */



