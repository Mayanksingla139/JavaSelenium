package UnderstandingTestNgFeatures.DependencyAndAssert;

import org.testng.Assert;
import org.testng.annotations.*;

public class dependency {

    @Test(priority = 1)
    void openApp(){ Assert.assertTrue(true); }

    @Test(priority = 2, dependsOnMethods = {"openApp"})
    void logIn(){ Assert.assertTrue(false); }

    @Test(priority = 3, dependsOnMethods = {"openApp", "logIn"})
    void Search(){ Assert.assertTrue(true); }

    @Test(priority = 4, dependsOnMethods = {"openApp", "logIn"})
    void advanceSearch(){ Assert.assertTrue(true); }

    @Test(priority = 5, dependsOnMethods = {"openApp"})
    void logOut(){ Assert.assertTrue(true); }
}
