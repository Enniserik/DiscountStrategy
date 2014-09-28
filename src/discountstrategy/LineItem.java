package discountstrategy;

/**
 *
 * @author Erik
 */
public class LineItem {
    
    // Stores info on each line item
    private String productId;
    private String description;
    private double price;
    private double qty;
    private double discount;

    public LineItem(String productId, String description, double unitPrice, double qty, double discount) {
        this.productId = productId;
        this.description = description;
        this.price = unitPrice;
        this.qty = qty;
        this.discount = discount;
    }
    
    @Override
    public String toString(){
        return description + "          " + qty + "   " + price + "   " + discount + "    " +
                (price - discount);
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

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
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
}
