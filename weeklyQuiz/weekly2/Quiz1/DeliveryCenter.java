package weekly2.Quiz1;

public class DeliveryCenter {
    public void printDeliveryCharge(DeliveryChargeCalculator deliveryCharge,int price, int weight){
        System.out.println(deliveryCharge.getDeliveryCharge(price,weight));
    }
}
