package general;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Loader
{
    private String filePath;

    public Loader(String filePath)
    {
        this.filePath=filePath;
    }

    public ArrayList<Product> getProducts()
    {
        ArrayList<Product> products = new ArrayList<>();
        try
        {
            String unit;
            double amountOfUnits;
            String nameOfProduct;
            int productID;

            FileReader fileReader = new FileReader(filePath);
            CSVReader csvReader = new CSVReader(fileReader);
            String [] productData;

            //Skip header
            omitLine(csvReader);

            while ((productData = csvReader.readNext()) != null)
            {
                productID = Integer.valueOf(productData[0]);
                nameOfProduct = productData[1];
                amountOfUnits = Double.valueOf(productData[2]);
                unit = productData[productData.length - 1];

                products.add(new Product(productID, getWeight(unit,amountOfUnits),nameOfProduct));
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        // Sort by weight descending
        Comparator<Product> compareWeight = Comparator.comparingDouble(Product::getProductWeight);
        products.sort(compareWeight.reversed());

        return products;
    }


    private double getWeight(String unit,double amountOfUnits)
    {
        return unit.equals("KG") ? getWeightInGrams(amountOfUnits) : amountOfUnits;
    }


    // KG -> Grams
    private double getWeightInGrams(double KG)
    {
        return KG * 1000;
    }

    private void omitLine(CSVReader csvReader)
    {
        try
        {
            csvReader.readNext();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
