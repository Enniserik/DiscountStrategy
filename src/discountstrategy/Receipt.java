package discountstrategy;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class builds and formats a String and sends it to a ReceiptOutput object
 * for output.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class Receipt {
    
    Date date;
    
    public Receipt(){
        date = new Date();
    }
    
    /**
     * Creates and formats a String based on Customer and LineItem[] array
     * that are passed in. Also delegates the actual printing of the String
     * to the ReceiptOutput object.
     * @param writer
     * @param customer
     * @param items 
     */
    public void printReceipt(ReceiptOutput writer, CustomerStrategy customer, LineItem[] items, double taxRate){
        String format = "%-20s %-15s %-15s %-15s %-20s%n";
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String formattedReceipt = "Kohl's Department Store\n" + customer.getCustomerInfo() + "\n";
        double subTotal = 0;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        formattedReceipt += dateFormat.format(date) + "\n\n";
        formattedReceipt += String.format(format, "Description", "Quantity", "Price", "Discount", "Ext Price");
        formattedReceipt += "------------------------------------------------------------------------------\n";
        for(LineItem li : items){
            formattedReceipt += li.toString(format, nf) + "\n";
            subTotal += (li.getPrice() - li.getDiscount());
        }
        formattedReceipt += String.format(format, "", "", "", "SubTotal:", nf.format(subTotal));
        formattedReceipt += String.format(format, "", "", "", "Tax:", nf.format(subTotal * taxRate));
        formattedReceipt += String.format(format, "", "", "", "Total:", nf.format(subTotal + (subTotal * taxRate)));
        formattedReceipt += "Thank you for shopping at Kohl's!\n";
        writer.outputString(formattedReceipt);
    }
      
}
