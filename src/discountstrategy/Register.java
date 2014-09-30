package discountstrategy;

/**
 * This class stores references to Order, DataAccessStrategy, and ReceiptOutput. 
 * The Register is responsible for managing the Order and looking up information
 * from the DataAccessStrategy. Delegates work to Order object.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class Register {
    
    private Order order;
    private DataAccessStrategy das;
    private ReceiptOutput writer;

    public Register(ReceiptOutput writer, DataAccessStrategy das){
        this.writer = writer;
        this.das = das;
    }
    
    /**
     * Creates a new Order object and looks up the Customer based on customerId
     * @param customerId - String to pass to DataAccessStrategy object
     */
    public void startNewSale(String customerId){
        order = new Order(das.getCustomer(customerId));
        //receipt = new Receipt(writer);
        //receipt.setCustomer(fd.getCustomer(customerId));
    }
    
    /**
     * Calls the Order object's addItem method and looks up a Product based
     * on productId. Passes Product object and qty to addItem method.
     * @param productId - String to pass to DataAccessStrategy object
     * @param qty - quantity of Product
     */
    public void addItem(String productId, int qty){
        order.addItem(das.getProduct(productId), qty);
        //receipt.addItem(fd.getProduct(productId), qty);
    }

    public void endSaleAndPrintReceipt(){
        order.printReceipt(writer);
    }
    
}
