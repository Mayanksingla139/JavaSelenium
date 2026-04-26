package UnderstandingTestNgFeatures.Annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/*
TC02:
1) Login
2) Search ---> @Test
3) Adv search ---> @Test
4) Logout
 */

public class ClassAnnotation {

    @BeforeClass
    void logIn(){
        System.out.println("Login the Application");
    }

    @AfterClass
    void logOut(){
        System.out.println("Logout the Application");
    }

    @Test(priority = 1)
    void Search(){
        System.out.println("Validation Search Functionality");
    }

    @Test(priority = 2)
    void advanceSearch(){
        System.out.println("Validation Advanced Search Functionality");
    }
}
