package firstTask;

import general.Loader;
import org.junit.Test;

public class TestLoader
{
    @Test
    public void testLoader()
    {
        try
        {
            Loader l = new Loader("src/main/resources/product_data.csv");
        }
        catch (Exception e)
        {
            throw e;
        }
    }

}
