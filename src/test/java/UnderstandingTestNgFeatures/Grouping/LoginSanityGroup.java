package UnderstandingTestNgFeatures.Grouping;

import org.testng.annotations.Test;

public class LoginSanityGroup {

    @Test(priority = 1, groups = {"Sanity"})
    void loginByGuest(){
        System.out.println("Login by Guest Sanity group");
    }

    @Test(priority = 2, groups = {"Sanity"})
    void loginByEmail(){
        System.out.println("Login by Email Sanity group");
    }

    @Test(priority = 3, groups = {"Sanity"})
    void loginByTwitter(){
        System.out.println("Login by Twitter Sanity group");
    }
}

