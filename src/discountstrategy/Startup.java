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
 */
public class Startup {

    public static void main(String[] args) {
        
        Register r = new Register(new ConsoleWriter());
        // Creates a receipt and sets the customer
        r.startNewSale("B122");
        
        // Adds items to the order
        r.addItem("11039", 2);
        r.addItem("12045", 1);
        r.addItem("11078", 1);
        
        // Tells receipt to calculate totals and send to output
        r.endSaleAndPrintReceipt();
        
        r.startNewSale("A102");
        
        r.addItem("12045", 3);
        r.addItem("11078", 2);
        
        r.endSaleAndPrintReceipt();
        
    }
    
}
