/*
 Atividade 1
    Crie um Projeto em Java chamado Cadastro;
    Neste projeto deve ser criado uma Classe, em um arquivo novo de nome Pessoa, 
    esta classe deve ter os atributos: codigo(int), nome(String)e idade(int), com os respectivos métodos Setterse Getters;
    No arquivo cadastro.java no método public static void main, deve ser instanciado 3 objetos da classe Pessoa (registro1, registro2 e registro3), 
    depois de criar os objetos, devem ser usados os Setters para informar os valores dos atributos deles, digitados pelo usuário;
    O programa deve imprimir no final o nome da pessoa que tem a maior idade.
 */
package atividade1.cadastro;

import java.util.Scanner;

public class Atividade1Cadastro {

    public static void main(String[] args) {
        
        Pessoa registro01;
        registro01 = new Pessoa();
        
        Pessoa registro02;
        registro02 = new Pessoa();
        
        Pessoa registro03;
        registro03 = new Pessoa();
        
        Scanner teclado;
        teclado = new Scanner (System.in);
        
        System.out.println("Cadastro de pessoas para comparação");
        
        //Primeira pessoa
        System.out.println("\nPessoa 1");
        System.out.println("Insira código de referência: ");
        registro01.setCodigo(teclado.nextInt());
        System.out.println("Insira nome: ");
        registro01.setNome(teclado.next());
        System.out.println("Insira idade: ");
        registro01.setIdade(teclado.nextInt());
        
        //Segunda pessoa
        System.out.println("\nPessoa 2");
        System.out.println("Insira código de referência: ");
        registro02.setCodigo(teclado.nextInt());
        System.out.println("Insira nome: ");
        registro02.setNome(teclado.next());
        System.out.println("Insira idade: ");
        registro02.setIdade(teclado.nextInt());
        
        //Terceira pessoa
        System.out.println("\nPessoa 3");
        System.out.println("Insira código de referência: ");
        registro03.setCodigo(teclado.nextInt());
        System.out.println("Insira nome: ");
        registro03.setNome(teclado.next());
        System.out.println("Insira idade: ");
        registro03.setIdade(teclado.nextInt());
        
        //Informando idade para o algorimo
        registro01.getIdade();
        registro02.getIdade();
        registro03.getIdade();
        
        //Testa o primeiro
        if (registro01.getIdade() > registro02.getIdade() && registro01.getIdade() > registro03.getIdade()){
            System.out.println(registro01.getNome()+" eh o mais velho");
        
        //Testa o segundo
        } else if (registro02.getIdade() > registro01.getIdade() && registro02.getIdade() > registro03.getIdade()){
            System.out.println(registro02.getNome()+" eh o mais velho");
            
        //Testa o terceiro
        } else if (registro03.getIdade() > registro01.getIdade() && registro03.getIdade() > registro02.getIdade()){
            System.out.println(registro03.getNome()+" eh o mais velho");
        }
    }
}
