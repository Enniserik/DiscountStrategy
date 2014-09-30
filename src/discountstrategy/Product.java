package discountstrategy;

/**
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
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
        if(discount < 0){
            throw new IllegalArgumentException("Discount must be at least 0.");
        }
        this.discount = discount;
    }

    public DiscountStrategy getDs() {
        return ds;
    }

    public void setDs(DiscountStrategy ds) {
        if(ds == null){
            throw new NullPointerException("DiscountStrategy object must not be null.");
        }
        this.ds = ds;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        if(productId == null || productId.isEmpty()){
            throw new IllegalArgumentException("Product Id is invalid.");
        }
        this.productId = productId;
    }
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        if(desc == null || desc.isEmpty()){
            throw new IllegalArgumentException("Description is invalid.");
        }
        this.desc = desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(discount < 0){
            throw new IllegalArgumentException("Unit price must be at least 0.");
        }
        this.unitPrice = unitPrice;
    }
    
    
    
}
