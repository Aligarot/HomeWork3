package task3Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3.avtoMarket.Car;

/**
 * Created by Dima on 30.05.2016.
 */
public class TestCar {
    @Test
    public void testCar1(){
        Assert.assertEquals(new Car(),new Car("Audi",true));
    }
    @Test
    public void testCar2(){
        Assert.assertEquals((new Car().equals(new Car("BMW",true))),false);
    }
}
