package Day06;

import org.testng.annotations.Test;

public class _03_DataProviderFromDifferentClass {


    //To call a different class for a test we Add (dataProviderClass=) as on line #9
    @Test(dataProvider = "myData",dataProviderClass = _01_DataProvider.class)
    void test1(String userName, String password) {
        System.out.println("Test 1 Is Running For: " + userName + " PassCode:" + password);

    }


}
