package discountstrategy;

/**
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class CreditCustomer implements Customer{
    
    private String customerId;
    private String firstName;
    private String lastName;

    public CreditCustomer(String customerId, String firstName, String lastName){
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    @Override
    public String getCustomerInfo(){
        return firstName + " " + lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("Invalid first name.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("Invalid last name.");
        }
        this.lastName = lastName;
    }

    
}
