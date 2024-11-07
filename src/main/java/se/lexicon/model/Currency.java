package se.lexicon.model;

public enum Currency {
    CURRENCY_1(1),
    CURRENCY_2(2),
    CURRENCY_5(5),
    CURRENCY_10(10),
    CURRENCY_20(20),
    CURRENCY_50(50),
    CURRENCY_100(100),
    CURRENCY_200(200),
    CURRENCY_500(500),
    CURRENCY_1000(1000);

    private int currency;

    Currency(int currency) {
        this.currency = currency;
    }

    public int getCurrency() {
        return currency;
    }
}
