package discountstrategy;

/**
 *
 * @author Erik
 */
public class FakeDatabase {
    
    // Array of customers
    private Customer[] customers = {new Customer("A102", "Sarah Hills"),
                                    new Customer("B122", "Tyler Grubble")};
    
    // Array of products
    private Product[] products = {new Product(new FlatDiscountStrategy(), "11039", "Black Socks", 6.99, 1.00), 
                                  new Product(new FlatDiscountStrategy(), "12045", "Baseball Cap", 13.99, 2.00),
                                  new Product(new PercentDiscountStrategy(), "11078", "Vest", 29.99, 0.15)};
    
    
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
