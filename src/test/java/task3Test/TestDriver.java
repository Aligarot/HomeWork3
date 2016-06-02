package task3Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3.avtoMarket.Car;
import task3.avtoMarket.Driver;
import task3.avtoMarket.Trip;

/**
 * Created by Dima on 30.05.2016.
 */
public class TestDriver {
    @Test
    public void testDriver(){
        Assert.assertEquals(new Driver("Boba",123,new Car(),new Trip()),new Driver("Boba",123,new Car(),new Trip()));
    }
    @Test
    public void testDriver2(){
        Assert.assertEquals(new Driver("Boba",123,new Car(),new Trip()).equals(new Driver("Boba",123,new Car(),new Trip(12,true))),false);
    }
    @Test
    public void testDriverZayava(){
        Driver driver=new Driver();
        driver.zayava();
        Assert.assertEquals(driver.showPerfomance(),false);
    }
    @Test
    public void testDriverFinishTrip(){
        Driver driver=new Driver();
        driver.tripHaveDone();
        Assert.assertEquals(driver.getFinishTrip(),true);
    }

}
