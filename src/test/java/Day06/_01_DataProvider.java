package Day06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "myData") // in this example we used the method name "myData"
    void test1(String userName, String password) {
        System.out.println("Test 1 Is Running For: " + userName + " PassCode:" + password);
    }

    @DataProvider
    public Object[][] myData() {
        Object[][] dataList = {{"John", "john1234"}, {"Tony", "tonyMontana"}, {"Dragon", "dragonBallZ"}};

        return dataList;
    }

    @Test(dataProvider = "userNames")// this one here we used the name "userNames
    void test2(String userName) {
        System.out.println("Test2 is Running for: " + userName);
    }

    @DataProvider(name = "userNames")
    public Object[][] dataList2() {
        Object[][] dataList = {{"John"}, {"Tony"}, {"Dragon"}};
        return dataList;
    }
}
