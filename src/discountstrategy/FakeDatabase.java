package discountstrategy;

/**
 * This class is a dummy database that stores Customer and Product arrays. 
 * Provides methods to find a Customer or Product object based on a customerId 
 * or productId.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class FakeDatabase implements DataAccessStrategy {
    
    // Array of customers
    private CustomerStrategy[] customers = {new CashCustomer("A102"),
                                    new OnlineCustomer("B122", "tgrubble112"),
                                    new CreditCustomer("A165", "Sarah", "Hills")};
    
    // Array of products
    private Product[] products = {new Product(new FlatDiscountStrategy(), "11039", "Black Socks", 6.99, 1.00), 
                                  new Product(new FlatDiscountStrategy(), "12045", "Baseball Cap", 13.99, 2.00),
                                  new Product(new PercentDiscountStrategy(), "11078", "Vest", 29.99, 0.15),
                                  new Product(new PercentDiscountStrategy(), "14222", "Top Hat", 17.99, 0.10),
                                  new Product(new NoDiscountStrategy(), "15432", "Gloves", 19.99, 0)};
    
    
    /**
     * Finds a Customer object in the array based on a String argument.
     * @param customerId - String to compare
     * @throws NullPointerException if Customer object is not found.
     * @return - returns a Customer object
     */
    @Override
    public CustomerStrategy getCustomer(String customerId){
        
        for(CustomerStrategy c : customers){
            if(c.getCustomerId().equals(customerId)){
                return c;
            }
        }
        
        throw new NullPointerException("There is no customer with that Id.");
    }
    
    
    /**
     * Finds a Product object in the array based on a String argument.
     * @param productId - String to compare
     * @throws NullPointerException if Product object is not found.
     * @return - returns a Product object
     */
    @Override
    public Product getProduct(String productId){
        
        for(Product p : products){
            if(p.getProductId().equals(productId)){
                return p;
            }
        }
        
        throw new NullPointerException("There is no product with that Id.");
    }
    
}
