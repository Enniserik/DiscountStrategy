package discountstrategy;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class GUIWriter implements Writer {
    
    @Override
    public void outputString(String s) {
        JDialog dialog = new JOptionPane("Your input was: " + s).createDialog("GUIWriter");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        dialog.dispose();
    }
    
}
