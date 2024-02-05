package weekly2.Quiz1solution;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int getTotalPrice(){
        int total=0;
        for(Product product: products){
            total=total+product.getPrice();
        }
        return total;
    }
    public double getTotalWeight(){
        double weight=0;
        for(Product product:products){
            weight+=product.getWeight();
        }
        return weight;
    }
}
