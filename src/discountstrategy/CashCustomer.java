package discountstrategy;

/**
 * 
 * 
 * 
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class CashCustomer implements Customer {
    
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

    @Override
    public void setCustomerId(String customerId) {
        if(customerId == null || customerId.isEmpty()){
            throw new IllegalArgumentException("Invalid customer Id.");
        }
        this.customerId = customerId;
    }

}
