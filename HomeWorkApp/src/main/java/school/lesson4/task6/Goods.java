package school.lesson4.task6;
public class Goods {
    private String productName;
    private double productPrice;

    public Goods(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
            return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override public String toString() {
        return  productName + " - стоимость - " + productPrice +"р.";
    }
}
