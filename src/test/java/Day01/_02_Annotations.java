package Day01;

import org.testng.annotations.*;

public class _02_Annotations {
    //@BeforeClass----> This code will run before the Class
            //@BeforeMethod-----> this code will run before all test Annotations
                    //@Test-----> to write our tests
                    //@Test-----> to write our tests
        //@AfterMethod-----> this code will run after all test Annotations
    //AfterClass-----> This code will run after the Class


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is working");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method is Working");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class Is Working.");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class Is Working.");
    }

    @Test
    void test1(){
        System.out.println("Test 1 is Successful");

        }
    @Test
    void test2(){
        System.out.println("Test 2 is Successful");
    }


}
