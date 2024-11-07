package se.lexicon.model;

public class VendingMachineImpl implements VendingMachine {
    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
    public void addCurrency(Currency currency) {
        depositPool += currency.getCurrency();
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        Product requestProduct = this.findProduct(id);

        if (depositPool > requestProduct.getPrice()) {
            depositPool -= requestProduct.getPrice();
            System.out.println(requestProduct.use());
            return requestProduct;

        }

        System.out.println("Your balance: " + depositPool);
        System.out.println("Required amount: " + requestProduct.getPrice());
        System.out.println("Insufficient funds!");
        System.out.println("Please add " + (requestProduct.getPrice() - depositPool) + " to continue.");

        return null;
    }

    @Override
    public int endSession() {
        int returnPool = depositPool;
        depositPool = 0;
        System.out.println("Please collect your money: " + returnPool);
        return returnPool;
    }

    @Override
    public String getDescription(int id) {
        Product product = this.findProduct(id);

        return product.examine();
    }

    @Override
    public String[] getProducts() {
        String[] newArray = new String[products.length];
        for (int i = 0; i < products.length; i++ ) {
            StringBuilder sb = new StringBuilder();
            sb.append("id: ").append(products[i].getId())
                    .append(", name: ").append(products[i].getProductName())
                    .append(", price: ").append(products[i].getPrice()).append(";");
            newArray[i] = sb.toString();
        }
        return newArray;
    }

    private Product findProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        throw new IllegalArgumentException("Product with id " + id + " not found");
    }
}
