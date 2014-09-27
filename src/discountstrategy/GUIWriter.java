/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
