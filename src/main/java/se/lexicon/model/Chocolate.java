package se.lexicon.model;

public class Chocolate extends Product {
    private String chocolateType ;
    private String filling;

    public Chocolate(int id, int price, String productName, String chocolateType , String filling) {
        super(id, price, productName);
        setChocolateType(chocolateType );
        setFilling(filling);
    }

    public String getChocolateType () {
        return chocolateType ;
    }

    public void setChocolateType (String type) {
        this.chocolateType  = type;
    }

    public String getFilling() {
        return filling;
    }


    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String examine(){
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(this.getId());
        sb.append(", product: ").append(this.getProductName());
        sb.append(", price: ").append(this.getPrice());
        sb.append(", type of chocolate: ").append(getChocolateType());
        sb.append(", filling: ").append(getFilling());

        return sb.toString();
    }

    @Override
    public String use(){
        StringBuilder sb = new StringBuilder();
        sb.append("Please collect your ").append(this.getChocolateType());
        sb.append(" ").append(this.getProductName());
        sb.append(" with ").append(this.getFilling());
        return sb.toString();
    }
}
