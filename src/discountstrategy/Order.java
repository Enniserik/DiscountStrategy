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
public class Order {
    
    private Receipt receipt;
    private Customer customer;
    private LineItem[] items;
    
    public Order(Customer customer){
        items = new LineItem[0];
        receipt = new Receipt();
        this.customer = customer;
    }
    
    public void addItem(Product p, int qty){
        LineItem[] temp = new LineItem[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[items.length] = new LineItem(p.getProductId(), p.getDesc(), p.getUnitPrice() * qty, qty, p.getDiscountAmount() * qty);
        items = temp;
    }

    public void printReceipt(ReceiptOutput writer){
        receipt.printReceipt(writer, customer, items);
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        if(receipt == null){
            throw new NullPointerException("Receipt must not be null.");
        }
        this.receipt = receipt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if(customer == null){
            throw new NullPointerException("Customer must not be null.");
        }
        this.customer = customer;
    }
    
}
