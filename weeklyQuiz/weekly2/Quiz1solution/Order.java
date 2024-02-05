package weekly2.Quiz1solution;

public class Order {
    public static void main(String[] args) {
        Beauty lips = new Beauty("립스틱", 1000, 0.65);;
        Grocery grocery = new Grocery("만두",8000,2.1);
        LargeAppliance largeAppliance = new LargeAppliance("냉장고",50000,5.8);

        Product[] products={lips,grocery,largeAppliance};

        Cart cart = new Cart(products);
        int deliveryCharge = Calculator.getDeliveryCharge(cart.getTotalPrice(), cart.getTotalWeight());
        System.out.println(deliveryCharge);
    }
}
