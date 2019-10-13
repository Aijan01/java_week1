public class Product {
    private Long IdProduct;
    private String Name;
    private Double Price;
    private String Category;
    private String ShelfLife;

    public Product(Long idProduct,
                   String name,
                   Double price,
                   String category,
                   String shelfLife){
        this.IdProduct = idProduct;
        this.Name = name;
        this.Price = price;
        this.Category = category;
        this.ShelfLife = shelfLife;
    }

    public Long getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.IdProduct = idProduct;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public String getShelfLife() {
        return ShelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.ShelfLife = shelfLife;
    }

    public String toString()
    {
        return "IdProduct: " + IdProduct + "\nName: " + Name + "\nPrice: " + Price +
                "\nCategory: " + Category + "\nShelfLife: " + ShelfLife;
    }
}


