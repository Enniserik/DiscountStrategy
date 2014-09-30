package discountstrategy;

/**
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public interface DataAccessStrategy {
    
    public Customer getCustomer(String customerId);
    public Product getProduct(String productId);
    
}
