
package ldp1;

import javax.swing.JOptionPane;

public class Exercício6 {
    public static void main(String[] args) {
     
        String d1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        float a = Float.parseFloat(d1);
                        
        float calc = (a+a+a+a);
        
        JOptionPane.showMessageDialog(null,calc);
    }
}
