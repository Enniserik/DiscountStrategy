package discountstrategy;

/**
 *
 * @author Erik
 */
public class FakeDatabase {
    
    // Array of customers
    private Customer[] customers = {new CashCustomer("A102"),
                                    new OnlineCustomer("B122", "tgrubble112"),
                                    new CreditCustomer("A165", "Sarah", "Hills")};
    
    // Array of products
    private Product[] products = {new Product(new FlatDiscountStrategy(), "11039", "Black Socks", 6.99, 1.00), 
                                  new Product(new FlatDiscountStrategy(), "12045", "Baseball Cap", 13.99, 2.00),
                                  new Product(new PercentDiscountStrategy(), "11078", "Vest", 29.99, 0.15),
                                  new Product(new PercentDiscountStrategy(), "14222", "Top Hat", 17.99, 0.10)};
    
    
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
