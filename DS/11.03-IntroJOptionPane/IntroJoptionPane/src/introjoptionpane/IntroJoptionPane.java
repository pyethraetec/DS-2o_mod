/*
 Testando JOptionPane
 */
package introjoptionpane;

import javax.swing.JOptionPane;

public class IntroJoptionPane {

    public static void main(String[] args) {
        String texto;
        
        texto = JOptionPane.showInputDialog("Digite um texto: ");
        
        JOptionPane.showMessageDialog(null, "Você digitou "+texto);
    }
    
}
