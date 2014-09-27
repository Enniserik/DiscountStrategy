/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Erik
 */
public class LineItem {
    
    // Stores info on each line item
    private String productId;
    private String description;
    private double unitPrice;
    private double qty;
    private double discount;
    private double extendedPrice;

    public LineItem(String productId, String description, double unitPrice, double qty, double discount, double extendedPrice) {
        this.productId = productId;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.discount = discount;
        this.extendedPrice = extendedPrice;
    }
    
    @Override
    public String toString(){
        double priceSubtotal = unitPrice * qty;
        double discountSubtotal = discount * qty;
        return description + "    " + qty + "   " + priceSubtotal + "   " + discountSubtotal + "    " +
                (priceSubtotal - discountSubtotal);
    }
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(double extendedPrice) {
        this.extendedPrice = extendedPrice;
    }
    
    
    
}
