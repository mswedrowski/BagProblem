package firstTask;

import general.Bag;
import general.Product;
import general.SolutionI;

import java.util.ArrayList;

public class Solution implements SolutionI
{
    private ArrayList<Product> products;
    private double bagCapacity;
    private ArrayList<Bag> bags;

    public Solution(ArrayList<Product> products,double bagCapacity)
    {
        this.products = products;
        this.bagCapacity = bagCapacity;
        bags = new ArrayList<>();
    }

    public boolean find()
    {
        // In case our bag is too small to contain a product
        if(products.get(0).getProductWeight() > bagCapacity)
        {
            return false;
        }

        else
            {
                for(Product product : products)
                {
                    if(!insertProductIntoBags(product))
                        getBag().putIntoBag(product);
                }
        }
        return true;
    }

    private boolean insertProductIntoBags(Product p)
    {
        for(Bag b : bags)
        {
            if(b.canInsertProduct(p))
            {
                b.putIntoBag(p);
                return true;
            }
        }
        return false;
    }


    private Bag getBag()
    {
        Bag bag = new Bag(bagCapacity);
        bags.add(bag);
        return bag;
    }

    public int countBags()
    {
        return (bags.size());
    }

    public void showBags()
    {
      for(Bag b : bags)
        {
            System.out.println(b.toString());
            System.out.println("Weight: " + b.currentWeight() +"\n");
        }
    }


}
