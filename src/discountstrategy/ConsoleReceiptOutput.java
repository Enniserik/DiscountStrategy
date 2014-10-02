package discountstrategy;

/**
 * This class implements ReceiptOutput and overrides the outputString method.
 * Outputs a string to the console.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class ConsoleReceiptOutput implements ReceiptOutput {

    /**
     * Outputs a string to the console.
     * @param s - String to output
     * @throws NullPointerException if s is null or empty
     */
    @Override
    public void outputString(String s) {
        if(s == null || s.isEmpty()){
            throw new NullPointerException("A null or empty string is not valid.");
        }
        System.out.println(s);
    }
    
    
    
}
