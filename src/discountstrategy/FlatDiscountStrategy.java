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
     * @param discountAmount - Discount price for calculation
     * @return - returns the discounted price as a double
     * @throws IllegalArgumentException if price or discountAmount are below .01.
     */
    @Override
    public double getDiscountAmount(double price, double discountAmount) throws IllegalArgumentException {
        if(price < .01 || discountAmount < .01){
            throw new IllegalArgumentException("Price and discount must be at least"
                    + ".01.");
        }
        return discountAmount;
    }
    
}
