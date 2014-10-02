package discountstrategy;

/**
 * This class calculates a discounted price based on arguments passed in.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class PercentDiscountStrategy implements DiscountStrategy {
    
    /**
     * Calculates a discounted price based on arguments.
     * @param price - Product price for calculation
     * @param discountRate - Discount price for calculation
     * @return - returns the discounted price as a double
     * @throws IllegalArgumentException if price or discountRate are below .01.
     */
    @Override
    public double getDiscountAmount(double price, double discountRate) {
        if(price < .01 || discountRate < .01){
            throw new IllegalArgumentException("Price and discount must be at least"
                    + ".01.");
        }
        return price * discountRate;
    }
    
}
