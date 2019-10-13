public class Customer
{
    public static void main(String[] args)
    {
        Shop shop = new Shop(48641233L, "apple", 185.00,"vegetablesFruits", "12.12.2019");
        System.out.println(shop.buyProduct());
    }
}