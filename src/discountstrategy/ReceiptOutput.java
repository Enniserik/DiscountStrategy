package discountstrategy;

/**
 * This interface allows for different type of outputs.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public interface ReceiptOutput {
    
    /**
     * Provides a template for outputting a String.
     * @param s - String to output
     */
    public abstract void outputString(String s);
    
}
