package discountstrategy;

/**
 * This class stores Receipt, Customer, and LineItem[] objects. Populates
 * LineItem[] array and delegates work to Receipt object.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class Order {
    
    private Receipt receipt;
    private CustomerStrategy customer;
    private LineItem[] items;
    
    public Order(CustomerStrategy customer){
        items = new LineItem[0];
        receipt = new Receipt();
        this.customer = customer;
    }
    
    /**
     * Adds a new LineItem object to the LineItem[] array
     * @param p - Product object 
     * @param qty - quantity of product
     */
    public void addItem(Product p, int qty){
        LineItem[] temp = new LineItem[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[items.length] = new LineItem(p.getProductId(), p.getDesc(), p.getUnitPrice() * qty, qty, p.getDiscountAmount() * qty);
        items = temp;
    }

    /**
     * Calls the Receipt object's printReceipt method
     * @param writer - ReceiptOutput object to use
     * @throws NullPointerException if ReceiptOutput argument is null.
     */
    public void printReceipt(ReceiptOutput writer, double taxRate) throws IllegalArgumentException {
        if(writer == null){
            throw new IllegalArgumentException("ReceiptOutput object must not be null.");
        }
        receipt.printReceipt(writer, customer, items, taxRate);
    }

    public Receipt getReceipt() {
        return receipt;
    }
    
    /**
     * Stores Receipt object.
     * @param receipt - Receipt object to store.
     * @throws NullPointerException if argument is null
     */
    public void setReceipt(Receipt receipt) throws IllegalArgumentException {
        if(receipt == null){
            throw new IllegalArgumentException("Receipt must not be null.");
        }
        this.receipt = receipt;
    }

    public CustomerStrategy getCustomer() {
        return customer;
    }
    
    /**
     * Stores Customer object.
     * @param customer - Customer object to store.
     * @throws NullPointerException if argument is null
     */
    public void setCustomer(CustomerStrategy customer) throws IllegalArgumentException {
        if(customer == null){
            throw new IllegalArgumentException("Customer must not be null.");
        }
        this.customer = customer;
    }
    
}
