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
public class Register {
    
    private Receipt receipt;
    private FakeDatabase fd;

    public Register(Writer writer){
        receipt = new Receipt(writer);
        fd = new FakeDatabase();
    }
    
    public void startNewSale(String customerId){
        receipt.setCustomer(fd.getCustomer(customerId));
    }
    
    public void addItem(String productId, int qty){
        receipt.addItem(fd.getProduct(productId), qty);
    }
    
    public void endSaleAndPrintReceipt(){
        receipt.printReceipt();
    }
    
}
