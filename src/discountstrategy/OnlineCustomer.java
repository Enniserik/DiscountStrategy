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

    @Override
    public void setCustomerId(String customerId) {
        if(customerId == null || customerId.equals("")){
            throw new NullPointerException("Invalid customer Id.");
        }
        this.customerId = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(customerId == null || customerId.equals("")){
            throw new NullPointerException("Invalid username.");
        }
        this.userName = userName;
    }
    
}
