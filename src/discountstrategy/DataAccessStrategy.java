package discountstrategy;

/**
 * This interface provides a template for different types of data access.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public interface DataAccessStrategy {
    
    /**
     * Provides a template for finding a Customer object
     * @param customerId - String to compare
     * @return - returns a Customer object
     */
    public CustomerStrategy getCustomer(String customerId);
    
    /**
     * Provides a template for finding a Product object
     * @param productId - String to compare
     * @return - returns a Product object
     */
    public Product getProduct(String productId);
    
}
