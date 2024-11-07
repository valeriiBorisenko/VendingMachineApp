package se.lexicon.model;

public abstract class Product {
    private int id;
    private int price;
    private String productName;

    public Product(int id, int price, String productName) {
        this.id = id;
        setPrice(price);
        setProductName(productName);
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract String examine();
    public abstract String use();

}
