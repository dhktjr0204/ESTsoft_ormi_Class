package weekly2.Quiz1;

public class Grocery extends Product implements DeliveryChargeCalculator{
    public Grocery(String name, int price, int weight) {
        super(name, price, weight);
    }
    @Override
    public int getDeliveryCharge(int price,int weight) {
        int deliveryCharge=0;
        if(weight<3){
            deliveryCharge=10000;
        }else if(weight<10){
            deliveryCharge=15000;
        }else{
            deliveryCharge=50000;
        }
        if(price<50000){
            return deliveryCharge;
        }else if(price<100000){
            deliveryCharge-=deliveryCharge/10;
        }else{
            deliveryCharge=0;
        }
        return deliveryCharge;
    }
}
