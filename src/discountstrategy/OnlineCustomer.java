package discountstrategy;

/**
 * This class implements the Customer interface and stores information about
 * the customer (for an Online customer).
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class OnlineCustomer implements Customer {
    
    private String customerId;
    private String userName;
    
    public OnlineCustomer(String customerId, String userName){
        this.customerId = customerId;
        this.userName = userName;
    }
    
    @Override
    public String getCustomerInfo(){
        return userName;
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

    public String getUserName() {
        return userName;
    }

    /**
     * Stores the customer username.
     * @param userName - Customer username to store.
     * @throws IllegalArgumentException if userName is null or empty
     */
    public void setUserName(String userName) {
        if(userName == null || userName.isEmpty()){
            throw new IllegalArgumentException("Invalid username.");
        }
        this.userName = userName;
    }
    
}
