import java.util.*;
import java.util.stream.*;

public class Shop
{
    Product product;

    static List<Product> productsInStock = new ArrayList<>();

    static
    {
        productsInStock.add(new Product(48641233L, "apple", 185.00,  "vegetablesFruits","12.12.2019"));
        productsInStock.add(new Product(56421223L, "milk", 40.50,  "milkProducts", "15.10.2019"));
        productsInStock.add(new Product(45783183L, "soap", 50.00  ,  "DetergentsAndCleaners" ,"" ));
        productsInStock.add(new Product(65489465L, "sourCream", 60.,  "milkProducts",  "18.10.2019" ));
    }


    public Shop(Long shopIdProduct, String shopName, Double shopPrice, String shopCategory, String shopShefLife)
    {
       this.product = new Product(shopIdProduct, shopName, shopPrice, shopCategory, shopShefLife);
    }

    public Product buyProduct()
    {
        return productsInStock.stream().filter(p ->
        {
            if(p.getIdProduct().equals(product.getIdProduct()) && p.getName().equals(product.getName()) && p.getPrice().equals(product.getPrice())
                    && p.getCategory().equals(product.getCategory()) && p.getShelfLife().equals(product.getShelfLife()))
            {
                System.out.println("check");
                return true;
            }
            return false;
        }).collect(Collectors.toList()).get(0);
    }

}
