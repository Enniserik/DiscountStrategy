package discountstrategy;

/**
 * This class implements the Customer interface and stores information about
 * the customer (for an Credit card customer).
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class CreditCustomer implements CustomerStrategy{
    
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
    
    /**
     * Stores the customer id.
     * @param customerId - Customer Id to store.
     * @throws IllegalArgumentException if customerId is null or empty
     */
    @Override
    public void setCustomerId(String customerId) throws IllegalArgumentException {
        if(customerId == null || customerId.isEmpty()){
            throw new IllegalArgumentException("Invalid customer Id.");
        }
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Stores the first name.
     * @param firstName - First Name to store.
     * @throws IllegalArgumentException if firstName is null or empty
     */
    public void setFirstName(String firstName) throws IllegalArgumentException {
        if(firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("Invalid first name.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Stores the customer last name.
     * @param lastName - Last Name to store.
     * @throws IllegalArgumentException if lastName is null or empty
     */
    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("Invalid last name.");
        }
        this.lastName = lastName;
    }

    
}
