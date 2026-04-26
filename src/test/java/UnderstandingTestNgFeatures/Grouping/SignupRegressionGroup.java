package UnderstandingTestNgFeatures.Grouping;

import org.testng.annotations.Test;

public class SignupRegressionGroup {

    @Test(priority = 1, groups = {"Regression"})
    void SignupByGuest(){
        System.out.println("Login by Guest Regression group");
    }

    @Test(priority = 2, groups = {"Regression"})
    void SignupByEmail(){
        System.out.println("Login by Email Regression group");
    }

    @Test(priority = 3, groups = {"Regression"})
    void SignupByTwitter(){
        System.out.println("Login by Twitter Regression group");
    }
}
