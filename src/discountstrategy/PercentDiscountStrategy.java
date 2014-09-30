package discountstrategy;

/**
 * 
 * 
 * 
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class PercentDiscountStrategy implements DiscountStrategy {
    
    /**
     * 
     * @param price
     * @param discount
     * @return 
     */
    @Override
    public double getDiscountedPrice(double price, double discount) {
        return price * discount;
    }
    
}
