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
    
    public Receipt(){
        items = new LineItem[0];
    }
    
    public void addItem(Product p, int qty){
        LineItem[] temp = new LineItem[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[items.length] = new LineItem(p.getProductId(), p.getDesc(), p.getPrice(), qty, getDiscount(), 2);
        items = temp;
    }
    
    public void printReceipt(){
        System.out.println("Blah Blah Title");
        System.out.println(customer.getName());
        for(LineItem li : items){
            System.out.println(li.toString());
        }
    }
    
    private double getDiscount(){
        return 1;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
}
