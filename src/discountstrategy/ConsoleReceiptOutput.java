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
public class ConsoleReceiptOutput implements ReceiptOutput {

    @Override
    public void outputString(String s) {
        System.out.println(s);
    }
    
    
    
}
