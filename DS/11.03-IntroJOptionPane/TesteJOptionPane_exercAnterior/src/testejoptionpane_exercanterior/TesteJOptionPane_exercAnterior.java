/*
 
 */
package testejoptionpane_exercanterior;

import javax.swing.JOptionPane;

public class TesteJOptionPane_exercAnterior {

    public static void main(String[] args) {
       int resultado;
       int num = 1;
       int teste;
       int tentativas = 0;
       int tabuada;
        
      //showInputDialog = abre janela pop up pra inserir dados igual o alert no js
       tabuada = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma tabuada: "));
       
       
       //laço
       do {                    
           //Integer.parseInt converte a entrada de texto padrão (string) em int
           resultado = Integer.parseInt(JOptionPane.showInputDialog(num + " x "+ tabuada + " = "));
       
           //teste
            teste = num * tabuada;
             if (resultado != teste) {
                 tentativas = tentativas + 1;
             }
           
           num = num + 1;
           
       }  while (num <= 10);
       
        //showMessageDialog = retorna valores atraves da janela pop up
           JOptionPane.showMessageDialog(null, "Total de erros: "+ tentativas);
    }
}

