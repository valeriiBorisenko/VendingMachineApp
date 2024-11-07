package se.lexicon.model;

public class Crisps extends Product {
    private String flavor;

    public Crisps(int id, int price, String productName, String flavor) {
        super(id, price, productName);
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String examine(){
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(this.getId());
        sb.append(", product: ").append(this.getProductName());
        sb.append(", price: ").append(this.getPrice());
        sb.append(", flavor: ").append(this.getFlavor());

        return sb.toString();
    }

    @Override
    public String use(){
        StringBuilder sb = new StringBuilder();
        sb.append("Please collect your crisps ").append(this.getProductName());
        sb.append(" with ").append(this.getFlavor());
        return sb.toString();
    }
}
