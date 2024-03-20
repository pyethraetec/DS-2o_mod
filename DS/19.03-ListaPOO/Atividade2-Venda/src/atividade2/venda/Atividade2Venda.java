/*
    Atividade 2
    Crie um Projeto em Java chamado Venda;
    Neste projeto deve ser criado uma Classe, em um arquivo novo de nome Produto, 
    esta classe deve ter os atributos: numero(int), descricao(String)e preco(double), com os respectivos métodos Setters e Getters;
    No arquivo venda.java no método publicstaticvoidmain, deve ser instanciado 5objetosda classe Produto (item1, item2, item3, item4 e item5), 
    depois de criar os objetos, devem ser usados os Setterspara informar os valores dos atributos deles, digitados pelo usuário;
    No final o programa deve exibir o valor total dos ítens.
 */
package atividade2.venda;

import java.util.Scanner;

public class Atividade2Venda {

    public static void main(String[] args) {
        
        Produto item01;
        item01 = new Produto();
        
        Produto item02;
        item02 = new Produto();
        
        Produto item03;
        item03 = new Produto();
        
        Produto item04;
        item04 = new Produto();
        
        Produto item05;
        item05 = new Produto();
                
        Scanner teclado;
        teclado = new Scanner (System.in);
        
        System.out.println("Cadastro de itens");
        
        //Primeiro item
        System.out.println("\nItem 1");
        System.out.println("Insira código de referência: ");
        item01.setNumero(teclado.nextInt());
        System.out.println("Insira descricao: ");
        item01.setDescricao(teclado.next());
        System.out.println("Insira preco: ");
        item01.setPreco(teclado.nextDouble());
        
        //Segundo item
        System.out.println("\nItem 2");
        System.out.println("Insira código de referência: ");
        item02.setNumero(teclado.nextInt());
        System.out.println("Insira descricao: ");
        item02.setDescricao(teclado.next());
        System.out.println("Insira preco: ");
        item02.setPreco(teclado.nextDouble());
        
        //Terceiro item
        System.out.println("\nItem 3");
        System.out.println("Insira código de referência: ");
        item03.setNumero(teclado.nextInt());
        System.out.println("Insira descricao: ");
        item03.setDescricao(teclado.next());
        System.out.println("Insira preco: ");
        item03.setPreco(teclado.nextDouble());
        
        //Terceiro item
        System.out.println("\nItem 4");
        System.out.println("Insira código de referência: ");
        item04.setNumero(teclado.nextInt());
        System.out.println("Insira descricao: ");
        item04.setDescricao(teclado.next());
        System.out.println("Insira preco: ");
        item04.setPreco(teclado.nextDouble());
        
        //Terceiro item
        System.out.println("\nItem 5");
        System.out.println("Insira código de referência: ");
        item05.setNumero(teclado.nextInt());
        System.out.println("Insira descricao: ");
        item05.setDescricao(teclado.next());
        System.out.println("Insira preco: ");
        item05.setPreco(teclado.nextDouble());
        
        //Informando preço para o algorimo
        item01.getPreco();
        item02.getPreco();
        item03.getPreco();
        item04.getPreco();
        item05.getPreco();
        
        double precoTotal;
        precoTotal=item01.getPreco() + item02.getPreco() + item03.getPreco() + item04.getPreco() + item05.getPreco();
        System.out.println("Total dos produtos cadastrados: RS "+precoTotal);
    }
    
}
