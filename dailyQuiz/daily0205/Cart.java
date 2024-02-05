package daily0205;

public class Cart {
    private Product[] products;
    public Cart(Product[] products) {
        this.products=products;
    }
    public double getTotalWeight(){
        double weight=0;
        for(Product product:products){
            weight+=product.getWeight();
        }
        return weight;
    }
    public int getTotalPrice(){
        int price=0;
        for(Product product:products){
            price+=product.getPrice();
            price-=product.getDiscountAmount();
        }
        return price;
    }

    private static int getDeliveryCharge(double totalWeight) {
        int deliveryChage=0;
        if(totalWeight <3.0){
            deliveryChage=1000;
        }else if(totalWeight <10.0){
            deliveryChage=5000;
        }else{
            deliveryChage=10000;
        }
        return deliveryChage;
    }
    public int calculateDeliveryCharge(){
        double totalWeight=getTotalWeight();
        int totalPrice=getTotalPrice();
        int deliveryCharge = getDeliveryCharge(totalWeight);
        if(totalPrice<30000){
            return deliveryCharge;
        }else if(totalPrice<100000){
            return deliveryCharge-1000;
        }
        return 0;
    }
}
