package firstTask;

import general.Bag;
import general.Product;
import org.junit.Assert;
import org.junit.Test;

public class TestBag
{

    @Test
    public void testBag()
    {
      Bag b = new Bag(2000);
    }

    @Test
    public void testGetCap()
    {
        Bag b = new Bag(2000);
        Assert.assertEquals(b.getCapacity()>0,true);
    }

    @Test
    public void addProduct()
    {
        Bag b = new Bag(2000);
        Product p = new Product(1,20,"Test");
        b.putIntoBag(p);
    }

    @Test
    public void getCurrentWeight()
    {
        Bag b = new Bag(2000);
        Product p = new Product(1,20,"Test");
        b.putIntoBag(p);
        Assert.assertEquals(b.currentWeight()==20,true);
    }
}
