package Day04;

import org.testng.annotations.*;

public class _01_XMLIntro {
      /*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass // runs before every class annotation
             @BeforeMethod // runs before every @Test annotation
                 @Test1 method  // we write our tests
                 @Test2 method
             @AfterMethod // runs after every @Test annotation
           @AfterClass // runs after every class annotation
         @AfterGroup
       @AfterTest
     @AfterSuit
   */

    @BeforeSuite
    void beforeSuiteMethod(){
        System.out.println("Before Suite Runs");
    }
    @BeforeTest
    void beforeTestMethod(){
        System.out.println("Before test Runs");
    }
    @BeforeGroups
    void beforeGroupsMethod(){
        System.out.println("Before Groups Runs");
    }
    @BeforeClass
    void beforeClassMethod(){
        System.out.println("Before Class Runs");
    }
    @BeforeMethod
    void beforeMethodMethod(){
        System.out.println("Before Method Runs");
    }
    @Test
    void test1(){
        System.out.println("Test# 1 Runs");
    }
    @Test
    void test2(){
        System.out.println("Test# 2 Runs");
    }
    @AfterMethod
    void afterMethodMethod(){
        System.out.println("After Method Runs");
    }
    @AfterClass
    void afterClassMethod(){
        System.out.println("After Class Runs");
    }
    @AfterGroups
    void afterGroupsMethod(){
        System.out.println("After Groups Runs");
    }
    @AfterTest
    void afterTestMethod(){
        System.out.println("After Test Runs");
    }
    @AfterSuite
    void afterSuiteMethod(){
        System.out.println("After Suite Runs");
    }
}
