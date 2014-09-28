package discountstrategy;

/**
 *
 * @author Erik
 */
public class FlatDiscountStrategy implements DiscountStrategy {
    
    @Override
    public double getDiscountedPrice(double price, double discount){
        return discount;
    }
    
}
