package discountstrategy;

import java.text.NumberFormat;

/**
 * This class builds and formats a String and sends it to a ReceiptOutput object
 * for output.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class Receipt {

    public Receipt(){

    }
    
    /**
     * Creates and formats a String based on Customer and LineItem[] array
     * that are passed in. Also delegates the actual printing of the String
     * to the ReceiptOutput object.
     * @param writer
     * @param customer
     * @param items 
     */
    public void printReceipt(ReceiptOutput writer, Customer customer, LineItem[] items){
        String format = "%-20s %-15s %-15s %-15s %-20s%n";
        String formattedReceipt = "Kohl's Department Store\n" + customer.getCustomerInfo() + "\n\n";
        double grandTotal = 0;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        formattedReceipt += String.format(format, "Description", "Quantity", "Price", "Discount", "Ext Price");
        formattedReceipt += "------------------------------------------------------------------------------\n";
        for(LineItem li : items){
            formattedReceipt += li.toString(format, nf) + "\n";
            grandTotal += (li.getPrice() - li.getDiscount());
        }
        formattedReceipt += String.format(format, "", "", "", "Total:", nf.format(grandTotal));
        formattedReceipt += "Thank you for shopping at Kohl's!\n";
        writer.outputString(formattedReceipt);
    }
      
}
