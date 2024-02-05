package daily0205;

public class Grocery extends Product {
    private static final int DISCOUNT_CHARGE=2000;
    @Override
    public int getDiscountAmount() {
        return DISCOUNT_CHARGE;
    }

    public Grocery(String name, int price, double weight) {
        super(name, price, weight);
    }

}
