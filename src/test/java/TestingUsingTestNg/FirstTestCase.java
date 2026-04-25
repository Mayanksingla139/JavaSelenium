package TestingUsingTestNg;

import org.testng.annotations.Test;


/* open app
Login
Logout */

public class FirstTestCase {

    @Test(priority = 1)
    public void openApp(){
        System.out.println("Open App");
    }

    @Test(priority = 2)
    public void LoginApp(){
        System.out.println("Login App");
    }

    @Test(priority = 3)
    public void LogoutApp(){
        System.out.println("Logout App");
    }

}
