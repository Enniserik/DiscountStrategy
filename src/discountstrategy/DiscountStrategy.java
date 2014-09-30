package discountstrategy;

/**
 * This interface provides an interchangeable method for Product discounts.
 * This allows for different kinds of discounts for different products.
 * 
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public interface DiscountStrategy {
    
    public abstract double getDiscountedPrice(double price, double discount);
    
}
