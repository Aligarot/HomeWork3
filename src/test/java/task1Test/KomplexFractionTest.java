package task1Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task1.fraction.Komplex;
import task1.fraction.KomplexFraction;

/**
 * Created by Dima on 30.05.2016.
 */
public class KomplexFractionTest {
    @Test
    public void  testAddFraction(){
        Assert.assertEquals(new KomplexFraction(2,5,3,1).addFraction(new KomplexFraction(4,2,5,6)),new KomplexFraction(47,16,47,32));
    }
    @Test
    public void  testMinusFraction(){
        Assert.assertEquals(new KomplexFraction(2,5,3,1).minusFraction1(new KomplexFraction(4,2,5,6)),new KomplexFraction(-3,16,-11,32));
    }
    @Test
    public void  testMultiplyFraction(){
        Assert.assertEquals(new KomplexFraction(2,5,3,1).multiKomplexFraction(new KomplexFraction(4,2,5,6)),new KomplexFraction(23,16,22,32));
    }
    @Test
    public void  testDivFraction(){
        Assert.assertEquals(new KomplexFraction(2,5,3,1).divKomplexFraction(new KomplexFraction(4,2,5,6)),new KomplexFraction(22,25,18,29));
    }
//    @Test
//    public void  testSimplyFlyFraction(){
//        Assert.assertEquals(new Komplex().simplyflyKomplex(new KomplexFraction(2,5,3,1)),new Komplex(22,25));
//    }


}
