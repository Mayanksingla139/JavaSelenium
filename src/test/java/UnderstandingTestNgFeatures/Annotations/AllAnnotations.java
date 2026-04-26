package UnderstandingTestNgFeatures.Annotations;

import org.testng.annotations.*;

public class AllAnnotations {

    @BeforeSuite
    void SuiteStart(){ System.out.println("This is Before Suite Annotation: Suite Starts...."); }

    @AfterSuite
    void AfterStart(){ System.out.println("This is After Suite Annotation: Suite Ends...."); }

    @BeforeTest
    void logIn(){ System.out.println("This is Before Test Annotation: Login the Application"); }

    @AfterTest
    void logOut(){ System.out.println("This is After Test Annotation: Logout the Application"); }

    @BeforeClass
    void logInBeforeClass(){
        System.out.println("This is Before Class Annotation");
    }

    @AfterClass
    void logOutAfterClass(){
        System.out.println("This is After Class Annotation");
    }

    @BeforeMethod
    void logInBeforeMethod(){
        System.out.println("This is Before Method Annotation");
    }

    @AfterMethod
    void logOutAfterMethod(){
        System.out.println("This is After Method Annotation");
    }

    @Test()
    void Search(){ System.out.println("This is Test Annotation: Validation of Search Functionality"); }

    @Test()
    void AdvanceSearch(){ System.out.println("This is Test Annotation: Validation of Advance Search Functionality"); }
}
