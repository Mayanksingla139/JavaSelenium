package UnderstandingTestNgFeatures.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1Annotation {

    @BeforeTest
    void logIn(){
        System.out.println("Login the Application and we are using before test");
    }

    @AfterTest
    void logOut(){
        System.out.println("Logout the Application and we are using after test");
    }

    @Test()
    void Search(){
        System.out.println("Validation Search Functionality  in BeforeTest1Annotation file");
    }

}
