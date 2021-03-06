package discountstrategy;

/**
 * This class calculates a discounted price based on arguments passed in.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class NoDiscountStrategy implements DiscountStrategy {

    /**
     * Calculates a discounted price based on arguments.
     * @param price - Product price for calculation
     * @param discountAmount - Discount price for calculation
     * @return - returns the discounted price as a double
     */
    @Override
    public double getDiscountAmount(double price, double discountAmount) {
        return 0;
    }
    
}
