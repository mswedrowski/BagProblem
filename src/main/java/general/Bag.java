package general;

import general.Product;

import java.util.ArrayList;
import java.util.Objects;

public class Bag
{
    protected ArrayList<Product> products;
    protected double capacity;

    public Bag(double capacity)
    {
        this.products = new ArrayList<>();
        this.capacity = capacity;
    }

    public void putIntoBag(Product p)
    {
        products.add(p);
    }

    public double currentWeight()
    {
        return products.stream().filter(Objects::nonNull).mapToDouble(Product::getProductWeight).sum();
    }

    public boolean canInsertProduct(Product p)
    {
        return currentWeight() + p.getProductWeight() < capacity;
    }

    @Override
    public String toString()
    {
        return products.toString();
    }

    public double getCapacity()
    {
        return capacity;
    }

}
