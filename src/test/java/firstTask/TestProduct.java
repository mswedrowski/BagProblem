package firstTask;
import general.Product;
import org.junit.Test;

public class TestProduct
{
    @Test
    public void createProduct()
    {
        Product p = new Product(1,20,"Test");
    }
}
