package task3Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import task3.avtoMarket.Trip;

/**
 * Created by Dima on 30.05.2016.
 */
public class TripTest {
    @Test
    public void testTrip(){
        Assert.assertEquals(new Trip(),new Trip(111111,false));
    }
}
