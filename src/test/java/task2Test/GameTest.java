package task2Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2.game.Game;

/**
 * Created by Dima on 30.05.2016.
 */
public class GameTest {
    @Test
    public void gameTest6(){
        Game b=new Game();
        Assert.assertEquals(b.getSecretNumber()>0&&b.getSecretNumber()<101,true);
    }
    @Test
    public void gameTest5(){
        Game b=new Game();
        Assert.assertEquals(b.getSecretNumber()>0&&b.getSecretNumber()<101,true);
    }
    @Test
    public void gameTest4(){
        Game b=new Game();
        Assert.assertEquals(b.getSecretNumber()>0&&b.getSecretNumber()<101,true);
    }
    @Test
    public void gameTest3(){
        Game b=new Game();
        Assert.assertEquals(b.getSecretNumber()>0&&b.getSecretNumber()<101,true);
    }
    @Test
    public void gameTest2(){
        Game b=new Game();
        Assert.assertEquals(b.getSecretNumber()>0&&b.getSecretNumber()<101,true);
    }
    @Test
    public void gameTest1(){
        Game b=new Game();
        Assert.assertEquals(b.getSecretNumber()>0&&b.getSecretNumber()<101,true);
    }
}
