/*
  Crie um Projeto em Java chamado Caixa; 
  Neste projeto deve ser criado uma Classe de nome Despesa, com os atributos: codigo (int), nome (String) e valor (double)
 com os respectivos métodos Setters e Getters e um construtor que requisitará todos os atributos; 
  No arquivo caixa.java, será criado um laço de repetição, que será executado 4 vezes, onde: 
    - Será lido os dados digitados pelo usuário de cada despesa; 
    - A cada interação, será instanciado um novo objeto da classe Despesa; 
    - Não será usado os métodos Setters para informar os dados dos objetos, e sim o construtor; 
  O programa deve imprimir no final o  valor da soma e média de todos os valores informados. 
 */
package caixa;

import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {
        
        int adicionando=0;
        Scanner teclado;
        teclado = new Scanner (System.in);
        
        
        
        
        do {
           System.out.println("Qual o numero?");
           teclado = new Scanner (System.in);
           
           System.out.println("Numero errado.\nTente novamente!\n");
           
           adicionando = adicionando + 1;
           
       } while ();
        
        
        
    }
    
}
