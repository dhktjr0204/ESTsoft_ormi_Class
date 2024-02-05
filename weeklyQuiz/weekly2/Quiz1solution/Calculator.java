package weekly2.Quiz1solution;

public class Calculator {
    public static int getDeliveryCharge(int price,double weight) {
        int deliveryCharge = getDeliveryCharge(weight);
        if(price<30000){
            return deliveryCharge;
        }else if(price<100000){
            return deliveryCharge-1000;
        }
        return 0;
    }

    private static int getDeliveryCharge(double weight) {
        int deliveryCharge=0;
        if(weight <3.0){
            deliveryCharge=1000;
        }else if(weight <10.0){
            deliveryCharge=5000;
        }else{
            deliveryCharge=10000;
        }
        return deliveryCharge;
    }
}
