package discountstrategy;

/**
 *
 * @author Erik
 */
public class Register {
    
    private Order order;
    private FakeDatabase fd;
    private Writer writer;

    public Register(Writer writer){
        this.writer = writer;
        fd = new FakeDatabase();
    }
    
    public void startNewSale(String customerId){
        order = new Order(fd.getCustomer(customerId));
        //receipt = new Receipt(writer);
        //receipt.setCustomer(fd.getCustomer(customerId));
    }
    
    public void addItem(String productId, int qty){
        order.addItem(fd.getProduct(productId), qty);
        //receipt.addItem(fd.getProduct(productId), qty);
    }
    
    public void endSaleAndPrintReceipt(){
        order.printReceipt(writer);
    }
    
}
