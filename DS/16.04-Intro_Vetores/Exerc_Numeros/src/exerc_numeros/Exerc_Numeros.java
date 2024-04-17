/*
 Criar um projeto em java de nome Numeros
 Perguntar ao usuario qual a quantidade de valores
 Criar um vetor do tipo double de nome numeros com o tamanho informado pelo usuario
 ler os dados do vetor criado
 exibir apenas os valores impares do vetor lido
 */
package exerc_numeros;

import java.util.Scanner;

public class Exerc_Numeros {

    public static void main(String[] args) {
       
        int tamanho;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Qual o tamanho do vetor? ");
        tamanho = teclado.nextInt();
        double [] numeros = new double [tamanho];
        
            for (int i=0;i<numeros.length; i=i+1){
                System.out.println("\nInsira os valores: ");
                numeros [i] = teclado.nextInt();
            }
        
            for (int i=0;i<numeros.length; i=i+1){
                
                if (numeros[i]%2!=0){
                    System.out.println("\nOs valores impares do vetor sao: "+numeros[i]);
                }
        }        
        
    }
    
}
