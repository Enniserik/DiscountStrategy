package discountstrategy;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * This class implements ReceiptOutput and overrides the outputString method.
 * Outputs a string to a JDialog.
 * 
 * @author Erik Ennis enniserik@gmail.com
 * @version 1.00
 */
public class GUIReceiptOutput implements ReceiptOutput {
    
    /**
     * Outputs a string to a JDialog.
     * @param s - String to output
     */
    @Override
    public void outputString(String s) {
//        JDialog dialog = new JOptionPane(s).createDialog("GUIReceiptOutput");
//        dialog.setAlwaysOnTop(true);
//        dialog.setVisible(true);
//        dialog.dispose();
        JOptionPane.showMessageDialog(null, s);
    }
    
}
