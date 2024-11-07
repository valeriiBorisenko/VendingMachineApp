package se.lexicon;

import se.lexicon.model.*;
import se.lexicon.utils.GenerateId;

public class Main {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate(GenerateId.nextId(), 20, "Milka", "milk chocolate", "nuts");
        Chocolate chocolate2 = new Chocolate(GenerateId.nextId(), 15, "Milka", "milk chocolate", "raisin");
        Soda soda1 = new Soda(GenerateId.nextId(), 17, "Coca-Cola", 500);
        Soda soda2 = new Soda(GenerateId.nextId(), 15, "Sprite", 330);
        Crisps crisps1 = new Crisps(GenerateId.nextId(), 25, "Lays", "cheese");
        Crisps crisps2 = new Crisps(GenerateId.nextId(), 25, "Lays", "sour cream & onion");

        Product[] products = {chocolate1, chocolate2, soda1, soda2, crisps1, crisps2 };

        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);

        vendingMachine.addCurrency(Currency.CURRENCY_50);
        System.out.println(vendingMachine.getBalance());
        System.out.println(vendingMachine.getDescription(5));
        vendingMachine.request(5);
        System.out.println(vendingMachine.getBalance());
        System.out.println(vendingMachine.getDescription(2));

        for (String product: vendingMachine.getProducts()) {
            System.out.println(product);
        }

        vendingMachine.endSession();
    }
}