package discountstrategy;

/**
 *
 * @author Erik
 */
public class Receipt {

    public Receipt(){

    }

    public void printReceipt(Writer writer, Customer customer, LineItem[] items){
        String formattedReceipt = "Blah Blah Title \n" + customer.getCustomerInfo() + "\n";
        for(LineItem li : items){
            formattedReceipt += li.toString() + "\n";
        }
        
        writer.outputString(formattedReceipt);
    }
      
}
