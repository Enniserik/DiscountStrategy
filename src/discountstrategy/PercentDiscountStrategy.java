package discountstrategy;

/**
 *
 * @author Erik
 */
public class PercentDiscountStrategy implements DiscountStrategy {

    @Override
    public double getDiscountedPrice(double price, double discount) {
        return price * discount;
    }
    
}
