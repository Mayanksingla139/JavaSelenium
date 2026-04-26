package UnderstandingTestNgFeatures.Grouping;

import org.testng.annotations.Test;

public class PaymentBothGroup {

    @Test(priority = 1, groups = {"Sanity", "Regression"})
    void payWithDollar(){
        System.out.println("Paying with dollar both group");
    }

    @Test(priority = 2, groups = {"Sanity", "Regression"})
    void payWithRupee(){
        System.out.println("Paying with rupee both group");
    }
}
