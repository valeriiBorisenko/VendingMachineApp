package se.lexicon.model;

public class Soda extends Product {
    private double size;

    public Soda(int id, int price, String productName, double size) {
        super(id, price, productName);
        setSize(size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String examine() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(this.getId());
        sb.append(", product: ").append(this.getProductName());
        sb.append(", price: ").append(this.getPrice());
        sb.append(", size: ").append(this.getSize());

        return sb.toString();
    }

    @Override
    public String use(){
        StringBuilder sb = new StringBuilder();
        sb.append("Please collect your ").append(this.getSize()).append("ml ").append(this.getProductName());
        return sb.toString();
    }
}