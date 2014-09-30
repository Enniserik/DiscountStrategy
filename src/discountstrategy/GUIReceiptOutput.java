package discountstrategy;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * 
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class GUIReceiptOutput implements ReceiptOutput {
    
    @Override
    public void outputString(String s) {
        JDialog dialog = new JOptionPane(s).createDialog("GUIWriter");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        dialog.dispose();
    }
    
}
