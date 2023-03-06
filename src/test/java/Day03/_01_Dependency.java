package Day03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {
    @Test
    void startCar(){
        System.out.println("Car is started");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"}) // This test depends on the success of startCar test
    void driveCar(){
        System.out.println("Car is driven");
    }
    @Test(dependsOnMethods = {"driveCar","startCar"})
    void stopCar() {
        System.out.println("Car is stopped");
    }

    @Test(dependsOnMethods = {"startCar","driveCar","stopCar"}) // This test depends on the success of startCar and driveCar tests
    void parkCar(){
        System.out.println("Car is parked");
    }



}
