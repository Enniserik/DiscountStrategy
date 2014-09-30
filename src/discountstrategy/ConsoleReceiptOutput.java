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
     */
    @Override
    public void outputString(String s) {
        System.out.println(s);
    }
    
    
    
}
