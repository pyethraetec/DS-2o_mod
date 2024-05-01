
package exemplovetor;

import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int [] vetor = new int [5];
        
        //leitura de dados
        for (int i=0;i<5;i++){
            System.out.println("Digite: ");
            vetor[i]=teclado.nextInt();
        }
        
        //escrita de dados
        for (int i=0;i<5;i++){
            System.out.println(vetor[i]);
        }
        
    }
    
}
