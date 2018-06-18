package week5;

import org.junit.Assert;
import org.junit.Test;

public class BreukTest {

    @Test
    public void breukWordCorrectVereenvoudigd(){
        Breuk controleBreuk = new Breuk(4,8);

        controleBreuk.vereenvoudig();

        Assert.assertEquals(controleBreuk.getTeller(), 1);
        Assert.assertEquals(controleBreuk.getNoemer(), 2);


    }
    @Test
    public void teltPlusOp() {
        Breuk a = new Breuk (1, 2);
        Breuk b = new Breuk (1, 2);

        a.plus(b);

        Assert.assertEquals(a.getTeller(), 4);
        Assert.assertEquals(a.getNoemer(), 4);
    }

    @Test
    public void trektMinAf() {
        Breuk a = new Breuk (1, 2);
        Breuk b = new Breuk (1, 2);

        a.min(b);

        Assert.assertEquals(a.getTeller(), 0);
        Assert.assertEquals(a.getNoemer(), 4);
    }
}
