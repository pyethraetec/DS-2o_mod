
package testavaloresinteiros;

import java.util.Scanner;

public class TestaValoresInteiros {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int [] pins = {9, 3, 7, 2};
        
        System.out.println("Digite o numero que deseja buscar: ");
        int procurar = teclado.nextInt();
        boolean achou=false;
        
        for (int i=0;i<pins.length;i++){
            if (pins[i] == procurar){
                achou = true;
                break;
            }
        }
        
        if (achou){
            System.out.println("O numero que voce procura esta na array :D");
        } else {
            System.out.println("O numero que voce procura nao esta na array :/");
        }
    }
    
}
