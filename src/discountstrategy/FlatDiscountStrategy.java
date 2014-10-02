package discountstrategy;

/**
 * This class calculates a discounted price based on arguments passed in.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class FlatDiscountStrategy implements DiscountStrategy {
    
    /**
     * Calculates a discounted price based on arguments.
     * @param price - Product price for calculation
     * @param discount - Discount price for calculation
     * @return - returns the discounted price as a double
     * @throws IllegalArgumentException if price or discount are below .01.
     */
    @Override
    public double getDiscountedPrice(double price, double discount){
        if(price < .01 || discount < .01){
            throw new IllegalArgumentException("Price and discount must be at least"
                    + ".01.");
        }
        return discount;
    }
    
}
