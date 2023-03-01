package Day01;

import org.testng.annotations.Test;

public class _03_Enable {
    @Test()
    void test1(){
        System.out.println("Test 1 Is Successful.");
    }

    //incase we dont want to run a test we use (enable= false) as shown below
    @Test(enabled = false)
    void test2(){
        System.out.println("Test 2 Is Successful.");
    }
    @Test
    void test3(){
        System.out.println("Test 3 Is Successful.");
    }
}
