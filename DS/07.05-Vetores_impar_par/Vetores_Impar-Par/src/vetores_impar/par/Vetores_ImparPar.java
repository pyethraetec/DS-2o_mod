/* 
  1)Crie um projeto que permita que o usuário informe o número de elementos do vetor de nome numeros do tipo inteiro que será criado. 
  2)Após  o  usuário  informar  o  tamanho  de  elementos  do  vetor, criar o vetor numeros com o tamanho informado. 
  3)Permitir que o usuário digite os valores dos elementos e gravar no vetor numeros estes valores, a cada valor lido 
 determinar quantos números pares e ímpares que foram informados. 
  4)Ao término da leitura dos valores, criar 2 vetores, um de nome par e outro de nome impar, ambos do tipo inteiro, 
 mas cada um do tamanho que caiba seus respectivos valores. 
  5)Percorrer o vetor numeros, e alimentar os vetores par e impar de acordo com o valor do elemento do vetor numeros. 
  6)Terminando de percorrer o vetor numeros, exibir o índice e o valor dos vetores par e impar, um de cada vez. 
 */
package vetores_impar.par;

import java.util.Scanner;

public class Vetores_ImparPar {

    public static void main(String[] args) {
        
        int tamanho;
        Scanner teclado = new Scanner (System.in);
        
        //pegando tamanho do vetor
        System.out.println("Qual o tamanho do vetor? ");
        tamanho = teclado.nextInt();
        int [] numeros = new int [tamanho];
        
        int par=0;
        int impar=0;
        
        //pegando valores do vetor
        for (int i=0;i<numeros.length; i=i+1){
           System.out.println("\nInsira os valores: ");
           numeros [i] = teclado.nextInt();
           
           //testando numeros
           if (numeros[i]%2==0){
               par++;
           } else {
               impar++;
           }
          
        }
        
        int [] pares = new int [par];
        int [] impares = new int [impar];
        
        for (int i=0;i<numeros.length; i=i+1){           
           //testando numeros
           if (numeros[i]%2==0){
               pares[i] = numeros[i];
           } else {
               impares[i] = numeros[i];
           }
          
        }
        
        
        //par
        
        for (int i=0;i<pares.length; i=i+1){
            System.out.println("Total par ["+pares.length+"]");
            //imprimindo vetor par
            System.out.println("Par ["+pares[i]+"] = "+pares[i]);
        }
        
        //impar
        
        for (int i=0;i<impares.length; i=i+1){
            System.out.println("Total impar ["+impares.length+"]");
            //imprimindo vetor impar
            System.out.println("Impar ["+impares[i]+"] = "+impares[i]);
        }
        
    }
    
}
