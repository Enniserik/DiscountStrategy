package discountstrategy;

/**
 * This interface provides a template for different types of customers
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public interface Customer {
    
    public abstract String getCustomerInfo();
    public abstract String getCustomerId();
    
    /**
     * Provides a template method for inheritance, stores a String
     * @param customerId - String for customerId
     */
    public abstract void setCustomerId(String customerId);

}
