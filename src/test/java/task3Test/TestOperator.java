package task3Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3.avtoMarket.Car;
import task3.avtoMarket.Driver;
import task3.avtoMarket.Operator;
import task3.avtoMarket.Trip;

/**
 * Created by Dima on 30.05.2016.
 */
public class TestOperator {
    @Test
    public void testOperator(){
        Assert.assertEquals(new Operator(),new Operator("User"));
    }

    @Test
    public void testOperatorSetCar(){
        Driver driver=new Driver();
        Car car=new Car("BMW",true);
        Operator operator=new Operator();
        operator.setCar(driver,car);
        Assert.assertEquals(driver.getCar(),new Car("BMW",true));
    }

    @Test
    public void testOperatorSetTrip(){
        Driver driver=new Driver();
        Trip trip=new Trip(113311,false);
        Operator operator=new Operator();
        operator.setTrip(driver,trip);
        Assert.assertEquals(driver.getTrip(),new Trip(113311,false));
    }

    @Test
    public void testOperatorDebarDriver(){
        Driver driver=new Driver();
        Operator operator=new Operator();
        operator.debarDriver(driver,driver.getTrip());
        Assert.assertEquals((driver.getCar()==null),(driver.getTrip()==null));

    }

}
