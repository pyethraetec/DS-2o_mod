/*
 Criar um projeto em Java de nome ListaValores
 - Perguntar pro usuário qual o tamanho do vetor
 - Criar um vetor do tipo int de nome lista com o tamanho informado pelo usuario
 - Montar um laço de repetição para ler os dados do vetor criado
 - Após ler os dados dos elementos do vetor, elabore um loop para exibir os dados informados "Lista[x] => XX"
 */
package exerc_listavalores;

import java.util.Scanner;

public class Exerc_ListaValores {

    public static void main(String[] args) {
            
        int tamanho;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Qual o tamanho do vetor? ");
        tamanho = teclado.nextInt();
        
        int [] lista = new int [tamanho];
     //tipo de vetor [] nome do vetor = *new* tipo do vetor [tamanho do vetor];
     //                                                      |-> pode ser preenchido ou não
        
            for (int i=0;i<lista.length; i=i+1){
                System.out.println("\nInsira os valores: ");
                lista [i] = teclado.nextInt();
            }
        
            for (int i=0;i<lista.length; i=i+1){
                System.out.println("\nValores do vetor: ");
                System.out.println("Lista ["+lista.length+"] = "+lista[i]);
        }
    }
    
}
