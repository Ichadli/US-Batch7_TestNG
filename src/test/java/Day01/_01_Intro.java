package Day01;

import org.testng.annotations.Test;

public class _01_Intro {


//    public static void main(String[] args) {
//        // go to the page
//        // login
//        // add to cart
//        //checkout
//    }

    // is you dont give the order it runs the test in alphabetical order

    // once we add "priority" the code will run depending on the order which is given Hierarchy
    @Test(priority = 1)
    public void loginTest(){
        System.out.println("Login Test is Successful");

    }
    @Test(priority = 2)
    public void addToCartTest(){
        System.out.println("Add To Cart Test is Successful");
    }
    @Test(priority = 3)
    public void checkOutTest(){
        System.out.println("CheckOut Test is Successful");

    }
}
