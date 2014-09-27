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
public class FakeDatabase {
    
    // Array of customers
    private Customer[] customers = {new Customer("A102", "Sarah Hills")};
    
    // Array of products
    private Product[] products = {new Product(new FlatDiscountStrategy(), "11039", "Black Socks", 6.99), 
                                  new Product(new FlatDiscountStrategy(), "12045", "Baseball Cap", 13.99)};
    
    
    // Lookup Customer Id
    public Customer getCustomer(String customerId){
        
        for(Customer c : customers){
            if(c.getCustomerId().equals(customerId)){
                return c;
            }
        }
        
        throw new NullPointerException("There is no customer with that Id.");
    }
    
    
    // Lookup Product Id
    public Product getProduct(String productId){
        
        for(Product p : products){
            if(p.getProductId().equals(productId)){
                return p;
            }
        }
        
        throw new NullPointerException("There is no product with that Id.");
    }
    
}
