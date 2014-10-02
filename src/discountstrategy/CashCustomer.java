package discountstrategy;

/**
 * This class implements the Customer interface and stores information about
 * the customer (for an Cash customer).
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class CashCustomer implements CustomerStrategy {
    
    private String customerId;
    
    public CashCustomer(String customerId){
        this.customerId = customerId;
    }
    
    @Override
    public String getCustomerInfo(){
        return "";
    }

    @Override
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Stores the customer id.
     * @param customerId - Customer Id to store.
     * @throws IllegalArgumentException if customerId is null or empty
     */
    @Override
    public void setCustomerId(String customerId) {
        if(customerId == null || customerId.isEmpty()){
            throw new IllegalArgumentException("Invalid customer Id.");
        }
        this.customerId = customerId;
    }

}
