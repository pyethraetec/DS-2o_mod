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
        
        Scanner teclado;
        teclado = new Scanner (System.in);
        int codigo=0;
        String nome=null;
        double valor=0;
        double Valor1 = 0, Valor2=0, Valor3=0, Valor4=0;
              
        System.out.println("Cadastro de documentação");
        
        for (int i = 0; i <= 4; ++i) {
                      
            switch (i){
                case 1:
                    Despesa Doc1 = new Despesa(codigo, nome, valor);
                    System.out.println("\nDespesa 1");
                    System.out.println("Insira codigo: ");
                    Doc1.codigo = teclado.nextInt();
                    System.out.println("Insira nome: ");
                    Doc1.nome = teclado.next();
                    System.out.println("Insira valor: ");
                    Doc1.valor = teclado.nextDouble();            
                    Valor1 = Doc1.getValor();
                    break;
                case 2:
                    Despesa Doc2 = new Despesa(codigo, nome, valor);
                    System.out.println("\nDespesa 2");
                    System.out.println("Insira codigo: ");
                    Doc2.codigo = teclado.nextInt();
                    System.out.println("Insira nome: ");
                    Doc2.nome = teclado.next();
                    System.out.println("Insira valor: ");
                    Doc2.valor = teclado.nextDouble();
                    Valor2 = Doc2.getValor();
                    break;
                case 3:
                    Despesa Doc3 = new Despesa(codigo, nome, valor);
                    System.out.println("\nDespesa 3");
                    System.out.println("Insira codigo: ");
                    Doc3.codigo = teclado.nextInt();
                    System.out.println("Insira nome: ");
                    Doc3.nome = teclado.next();
                    System.out.println("Insira valor: ");
                    Doc3.valor = teclado.nextDouble();            
                    Valor3 = Doc3.getValor();
                    break;
                case 4:
                    Despesa Doc4 = new Despesa(codigo, nome, valor);
                    System.out.println("\nDespesa 4");
                    System.out.println("Insira codigo: ");
                    Doc4.codigo = teclado.nextInt();
                    System.out.println("Insira nome: ");
                    Doc4.nome = teclado.next();
                    System.out.println("Insira valor: ");
                    Doc4.valor = teclado.nextDouble();            
                    Valor4 = Doc4.getValor();
                    break;
            }     
        }   
                        
        double soma;
        soma = Valor1+Valor2+Valor3+Valor4;
        System.out.println("A soma dos valores eh: "+soma);                   
        
        double media;
        media = soma/4;
        System.out.println("A media dos valores eh: "+media); 
               
    }
}