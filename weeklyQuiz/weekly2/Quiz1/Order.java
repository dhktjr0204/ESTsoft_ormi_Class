package weekly2.Quiz1;

public class Order {
    public static void main(String[] args) {
        Beauty lips = new Beauty("립스틱", 10000, 2);;
        Grocery grocery = new Grocery("만두",80000,3);
        LargeAppliance largeAppliance = new LargeAppliance("냉장고",500000,15);

        System.out.println(lips.getDeliveryCharge(lips.getPrice(), lips.getWeight()));
        System.out.println(grocery.getDeliveryCharge(grocery.getPrice(), grocery.getWeight()));
        System.out.println(largeAppliance.getDeliveryCharge(largeAppliance.getPrice(), largeAppliance.getWeight()));
    }
}
