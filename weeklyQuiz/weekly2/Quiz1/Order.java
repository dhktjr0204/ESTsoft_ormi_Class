package weekly2.Quiz1;

public class Order {
    public static void main(String[] args) {
        Beauty lips = new Beauty("립스틱", 10000, 2);
        DeliveryCenter deliveryCenter = new DeliveryCenter();
        deliveryCenter.printDeliveryCharge(lips,lips.getPrice(), lips.getWeight());

        Grocery grocery = new Grocery("만두",80000,3);
        deliveryCenter.printDeliveryCharge(grocery,grocery.getPrice(),grocery.getWeight());

        LargeAppliance largeAppliance = new LargeAppliance("냉장고",500000,15);
        deliveryCenter.printDeliveryCharge(largeAppliance,largeAppliance.getPrice(),largeAppliance.getWeight());
    }
}
