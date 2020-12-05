package controller;
//calendaro_dos_signos
import javax.swing.JTextField;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 1
 * @since 30/11/2020
 */
public class ViewFinder {
    
    public void clear(JTextField name, JTextField day, JTextField month, JTextField year){
        
        name.setText("");
        day.setText("");
        month.setText("");
        year.setText("");
        
    }
    
}
