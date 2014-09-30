package discountstrategy;

/**
 * This interface provides an interchangeable method for Product discounts.
 * This allows for different kinds of discounts for different products.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public interface DiscountStrategy {
    
    /**
     * Provides a template for calculating a discounted price based on arguments
     * @param price - Product price for calculation
     * @param discount - Discount price for calculation
     * @return - returns the discounted price as a double
     */
    public abstract double getDiscountedPrice(double price, double discount);
    
}
