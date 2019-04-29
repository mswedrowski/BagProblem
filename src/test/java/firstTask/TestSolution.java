package firstTask;

import general.Loader;
import general.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestSolution
{
    Loader l = new Loader("src/main/resources/product_data.csv");
    ArrayList<Product> prodTest = l.getProducts();


    @Test
    public void testSolution()
    {
        Solution s = new Solution(prodTest, 10000);
    }

    @Test
    public void testFind()
    {
        Solution s = new Solution(prodTest, 10000);
        Assert.assertTrue(s.find());
    }

    @Test
    public void testFindBigCap()
    {
        Solution s = new Solution(prodTest, 100000);
        Assert.assertTrue(s.find());
    }


    @Test
    public void testFindFalse()
    {
        Solution s = new Solution(prodTest, 20);
        Assert.assertFalse(s.find());
    }

}
