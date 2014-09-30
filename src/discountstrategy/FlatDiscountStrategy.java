package discountstrategy;

/**
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class FlatDiscountStrategy implements DiscountStrategy {
    
    @Override
    public double getDiscountedPrice(double price, double discount){
        return discount;
    }
    
}
