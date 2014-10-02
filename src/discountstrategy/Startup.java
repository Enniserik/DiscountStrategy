package discountstrategy;

/**
 * Creates a Register object and handles all input.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class Startup {

    public static void main(String[] args) {
        
        Register r = new Register(new ConsoleReceiptOutput(), new FakeDatabase());
        
        // Sale 1
        r.startNewSale("B122");
        
        r.addItem("11039", 2);
        r.addItem("12045", 1);
        r.addItem("11078", 1);
        
        r.endSaleAndPrintReceipt();
        
        // Sale 2
//        r.startNewSale("A102");
//        
//        r.addItem("12045", 3);
//        r.addItem("11078", 2);
//        
//        r.endSaleAndPrintReceipt();
//        
//        // Sale 3
//        r.startNewSale("A165");
//        
//        r.addItem("14222", 1);
//        r.addItem("15432", 2);
//        
//        r.endSaleAndPrintReceipt();
        
    }
    
}
