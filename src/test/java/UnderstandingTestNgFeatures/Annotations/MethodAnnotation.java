package UnderstandingTestNgFeatures.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/*
TC1
1) Login
2) Search --- @Test
3) Logout
4) Login
5) Adv search --- @Test
6) Logout
*/

public class MethodAnnotation {

    @BeforeMethod
    void logIn(){
        System.out.println("Login the Application");
    }

    @AfterMethod
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
