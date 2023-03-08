package Day06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _06_SoftAssertVS_HardAssert {
    @Test
    void hardAssertTest(){
        String str="Hello";
        System.out.println("❕Before Assertion");
        Assert.assertEquals("Hello World",str,"Your Test Has FAILED ❌");
        // if ("actual"--->Hello World), is not the same with the ("expected"--->Hello), it throws an exception and stops the code
        // then TestNG will run the next test
        System.out.println("❗️After Assertion");
    }
    @Test
    void softAssertTest(){
        String strHomepage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert softAssert= new SoftAssert();
        System.out.println("❕Before Soft Assert 1");
        softAssert.assertEquals("www.facebook.com/homepage",strHomepage);
        System.out.println("❗️After Soft Assert 1");

        System.out.println("❕Before Soft Assert 2");
        softAssert.assertEquals("www.facebook.com/profile",strCartPage);
        System.out.println("❗️After Soft Assert 2");


        System.out.println("❕Before Soft Assert 3");
        softAssert.assertEquals("www.facebook.com/setting",strEditAccount);
        System.out.println("❗️After Soft Assert 3");

        softAssert.assertAll();
    }
}
