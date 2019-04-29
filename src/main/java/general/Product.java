package general;

public class Product
{
    private int productID;
    private double productWeight;       // In grams
    private String productName;

    public Product(int productID,double productWeight,String productName)
    {
     this.productID = productID;
     this.productWeight = productWeight;
     this.productName = productName;
    }

    @Override
    public String toString()
    {
        return ("ProductID: " + String.valueOf(productID) +" ProductWeight: " + String.valueOf(productWeight)+" Name: " +productName+"   ");
    }


    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
