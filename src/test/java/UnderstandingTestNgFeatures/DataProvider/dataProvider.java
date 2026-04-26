package UnderstandingTestNgFeatures.DataProvider;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

    @BeforeClass()
    void openApp(){
        System.out.println("Opening app and initialize driver");
    }

    @DataProvider(name = "LoginData", indices = {0,1,2})
    Object[][] data(){
        Object[][] data = {
                {"Mayank", "123"},
                {"Mayank Singla", "456"},
                {"Mr. Mayank Singla", "789"},
        };
        return data;
    }

    @Test(dataProvider = "LoginData")
    void logIn(String id, String pwd){
        System.out.println("Id is: "+id);
        System.out.println("Password is: "+pwd);
        Assert.assertTrue(true);
    }

}
