package discountstrategy;

/**
 *
 * @author Erik
 */

/**
 * TODO ----
 * 1. Add Order between register and receipt 
 * 2. Create Different types of customers (online, credit, cash), will affect output
 * 3. 
 * 
 * 
 * 
 */
public class Startup {

    public static void main(String[] args) {
        
        Register r = new Register();
        // Creates a receipt and sets the customer
        r.startNewSale("A102");
        
        // Adds items to the order
        r.addItem("11039", 2);
        r.addItem("12045", 1);
        
        // Tells receipt to calculate totals and send to output
        r.endSaleAndPrintReceipt();
        
    }
    
}
