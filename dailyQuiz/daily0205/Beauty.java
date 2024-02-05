package daily0205;

public class Beauty extends Product {
    private static final int DISCOUNT_CHARGE=10000;
    @Override
    public int getDiscountAmount() {
        return DISCOUNT_CHARGE;
    }

    public Beauty(String name, int price, double weight) {
        super(name, price, weight);
    }

}
