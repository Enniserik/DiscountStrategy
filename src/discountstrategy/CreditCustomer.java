/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Erik
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
        if(customerId == null || customerId.equals("")){
            throw new NullPointerException("Invalid customer Id.");
        }
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(customerId == null || customerId.equals("")){
            throw new NullPointerException("Invalid first name.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(customerId == null || customerId.equals("")){
            throw new NullPointerException("Invalid last name.");
        }
        this.lastName = lastName;
    }

    
}
