package weekly2.Quiz1;

public class Beauty extends Product implements DeliveryChargeCalculator{
    public Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge(int price,int weight) {
        int deliveryCharge=0;
        if(weight<2){
            deliveryCharge=2500;
        }else if(weight<5){
            deliveryCharge=5000;
        }else{
            deliveryCharge=10000;
        }
        if(price<30000){
            return deliveryCharge;
        }else if(price<50000){
            deliveryCharge-=1000;
        }else{
            deliveryCharge=0;
        }
        return deliveryCharge;
    }
}
