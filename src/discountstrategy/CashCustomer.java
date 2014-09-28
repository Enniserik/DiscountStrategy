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
        this.customerId = customerId;
    }

}
