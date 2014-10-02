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
     * @param discount - Discount price for calculation
     * @return - returns the discounted price as a double
     * @throws IllegalArgumentException if price is less than 0.
     */
    @Override
    public double getDiscountedPrice(double price, double discount) {
        if(price <= 0){
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
        return price;
    }
    
}
