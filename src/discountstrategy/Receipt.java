package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author Erik
 */
public class Receipt {

    public Receipt(){

    }

    public void printReceipt(Writer writer, Customer customer, LineItem[] items){
        String format = "%-20s %-15s %-15s %-15s %-15s%n";
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
