package UnderstandingTestNgFeatures.Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteAnnotation {

    @Test()
    void advanceSearch(){
        System.out.println("Validation Advanced Search Functionality in Suite Annotation file");
    }

    @BeforeSuite
    void SuiteStart(){
        System.out.println("Suite Starts... Before Suite Annotation");
    }

    @AfterSuite
    void SuiteEnd(){
        System.out.println("Suite Ends... After Suite Annotation");
    }
}
