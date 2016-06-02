package task1Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task1.fraction.Fraction;

/**
 * Created by Dima on 30.05.2016.
 */
public class FractionTest {
    @Test
    public void testAddFraction1(){
        Assert.assertEquals(new Fraction(1,4).addFraction(new Fraction(2,6)),new Fraction(14,24));
    }
    @Test
    public void testAddFraction2(){
        Assert.assertEquals(new Fraction(2,5).addFraction(new Fraction(1,6)),new Fraction(17,30));
    }
    @Test
    public void testMinusFraction1(){
        Assert.assertEquals(new Fraction(1,5).minusFraction(new Fraction(1,2)),new Fraction(-3,10));
    }
    @Test
    public void testMinusFraction2(){
        Assert.assertEquals(new Fraction(4,5).minusFraction(new Fraction(2,3)),new Fraction(2,15));
    }
    @Test
    public void testMultiplyFraction1(){
        Assert.assertEquals(new Fraction(2,4).multiplyFraction(new Fraction(1,2)),new Fraction(2,8));
    }
    @Test
    public void testMultiplyFraction2(){
        Assert.assertEquals(new Fraction(-2,4).multiplyFraction(new Fraction(6,2)),new Fraction(-12,8));
    }
    @Test
    public void testDivFraction1(){
        Assert.assertEquals(new Fraction(2,4).divFraction(new Fraction(2,1)),new Fraction(2,8));
    }
    @Test
    public void testDivFraction2(){
        Assert.assertEquals(new Fraction(-2,4).divFraction(new Fraction(2,6)),new Fraction(-12,8));
    }
    @Test
    public void testSimplyFlyFraction1(){
        Assert.assertEquals(new Fraction(2,4).simplyFly(),0.5);
    }
    @Test
    public void testSimplyFlyFraction2(){
        Assert.assertEquals(new Fraction(4,-4).simplyFly(),-1.0);
    }
}
