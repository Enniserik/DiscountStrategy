package discountstrategy;

/**
 *
 * @author Erik
 */
public interface DiscountStrategy {
    
    public abstract double getDiscountedPrice(double price, double discount);
    
}
