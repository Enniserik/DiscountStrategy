/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Erik
 */
public class Receipt {
 
    // Puts together line items and formats output
    // Sends output to output object
    
    private LineItem[] items;
    private Customer customer;
    private Writer writer;
    
    public Receipt(Writer writer){
        items = new LineItem[0];
        this.writer = writer;
        
    }
    
    public void addItem(Product p, int qty){
        LineItem[] temp = new LineItem[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[items.length] = new LineItem(p.getProductId(), p.getDesc(), p.getUnitPrice() * qty, qty, p.getDiscountAmount() * qty);
        items = temp;
    }
    
    public void printReceipt(){
        String formattedReceipt = "Blah Blah Title \n" + customer.getName() + "\n";
        for(LineItem li : items){
            formattedReceipt += li.toString() + "\n";
        }
        
        writer.outputString(formattedReceipt);
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
}
