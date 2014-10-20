package discountstrategy;

/**
 * This class stores information about a Product, provides getters and setters
 * for all properties.
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
        return ds.getDiscountAmount(unitPrice, discount);
    }

    public double getDiscount() {
        return discount;
    }
    
    /**
     * Stores the discount
     * @param discount - double to store
     * @throws IllegalArgumentException if discount is below 0.
     */
    public void setDiscount(double discount) throws IllegalArgumentException {
        if(discount < 0){
            throw new IllegalArgumentException("Discount must be at least 0.");
        }
        this.discount = discount;
    }

    public DiscountStrategy getDs() {
        return ds;
    }
    
    /**
     * Stores the DiscountStrategy object
     * @param ds - DiscountStrategy object to store
     * @throws NullPointerException if argument is null
     */
    public void setDs(DiscountStrategy ds) throws IllegalArgumentException {
        if(ds == null){
            throw new IllegalArgumentException("DiscountStrategy object must not be null.");
        }
        this.ds = ds;
    }

    public String getProductId() {
        return productId;
    }
    
    /**
     * Stores the productId String
     * @param productId - String to store
     * @throws IllegalArgumentException if productId is null or empty
     */
    public void setProductId(String productId) throws IllegalArgumentException {
        if(productId == null || productId.isEmpty()){
            throw new IllegalArgumentException("Product Id is invalid.");
        }
        this.productId = productId;
    }
    
    public String getDesc() {
        return desc;
    }

    /**
     * Stores the description String
     * @param desc - String to store
     * @throws IllegalArgumentException if description is null or empty
     */
    public void setDesc(String desc) throws IllegalArgumentException {
        if(desc == null || desc.isEmpty()){
            throw new IllegalArgumentException("Description is invalid.");
        }
        this.desc = desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    
    /**
     * Stores the unitPrice
     * @param unitPrice - double to store
     * @throws IllegalArgumentException if unitPrice is below 0.
     */
    public void setUnitPrice(double unitPrice) throws IllegalArgumentException {
        if(discount < 0){
            throw new IllegalArgumentException("Unit price must be at least 0.");
        }
        this.unitPrice = unitPrice;
    }
    
    
    
}
