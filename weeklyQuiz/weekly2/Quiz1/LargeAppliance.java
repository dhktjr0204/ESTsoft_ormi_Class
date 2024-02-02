package weekly2.Quiz1;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }
    @Override
    public int getDeliveryCharge(int price,int weight) {
        int deliveryCharge=0;
        if(weight<3){
            deliveryCharge=10000;
        }else if(weight<10){
            deliveryCharge=50000;
        }else{
            deliveryCharge=100000;
        }
        if(price<100000){
            return deliveryCharge;
        }else if(price<300000){
            deliveryCharge-=deliveryCharge/10;
        }else{
            deliveryCharge-=deliveryCharge/20;
        }
        return deliveryCharge;
    }
}
