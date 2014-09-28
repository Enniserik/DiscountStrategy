package discountstrategy;

/**
 *
 * @author Erik
 */
public class Product {
    
    private String productId;
    private String desc;
    private double unitPrice;
    private double discount;
    private DiscountStrategy ds;
    
    public Product(DiscountStrategy ds, String productId, String desc, double unitPrice, double discount){
        this.ds = ds;
        this.productId = productId;
        this.desc = desc;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }
    
    public double getDiscountAmount(){
        return ds.getDiscountedPrice(unitPrice, discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public DiscountStrategy getDs() {
        return ds;
    }

    public void setDs(DiscountStrategy ds) {
        this.ds = ds;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
    
}
