package discountstrategy;

import java.text.NumberFormat;

/**
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class LineItem {
    
    // Stores info on each line item
    private String productId;
    private String description;
    private double price;
    private int qty;
    private double discount;

    public LineItem(String productId, String description, double unitPrice, int qty, double discount) {
        this.productId = productId;
        this.description = description;
        this.price = unitPrice;
        this.qty = qty;
        this.discount = discount;
    }
    
    /**
     * Creates a formatted String using the LineItem properties and returns 
     * that String.
     * @param format
     * @param nf
     * @return 
     */
    public String toString(String format, NumberFormat nf){
        return String.format(format, description, qty, nf.format(price), nf.format(discount), nf.format(price - discount));
//        return description + "      " + qty + "       " + price + "      " + discount + "      " + (price - discount);
    }
//    
//    public String getProductId() {
//        return productId;
//    }
//
//    public void setProductId(String productId) {
//        this.productId = productId;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
    public double getPrice() {
        return price;
    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public double getQty() {
//        return qty;
//    }
//
//    public void setQty(double qty) {
//        this.qty = qty;
//    }
//
    public double getDiscount() {
        return discount;
    }
//
//    public void setDiscount(double discount) {
//        this.discount = discount;
//    }
}
