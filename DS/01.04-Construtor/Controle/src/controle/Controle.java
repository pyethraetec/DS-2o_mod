/*
Atividade 1
    Crie um projeto em java chamado Controle
    Neste projeto deve ser criado uma classe de nome documento, com os atributos:
   numero (int), titulo (string) e valor (double), com os respectivos metodos setters e getters e com um construtor com todos os atributos
    No arquivo controle.java deve ser instanciado 5 objetos da classe Documento usando o construtor 
   que requisita todos dados da classe os dados devem ser digitados pelo usuario
    O programa deve imprimir no final o titulo e valor dos documentos de menor e maior valor
   a soma de todos os valores e media dos valores informados
 */
package controle;

import java.util.HashSet;
import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {
        
        int Numero = 0;
        String Titulo = null;
        double Valor = 0;
        
        Scanner teclado = new Scanner (System.in);
        
        //Primeiro documento
        Documento Doc1 = new Documento(Numero, Titulo, Valor);        
        System.out.println("Cadastro de documentação");
               
        System.out.println("\nDocumento 1");
        System.out.println("Insira numero: ");
        Doc1.numero = teclado.nextInt();
        System.out.println("Insira titulo: ");
        Doc1.titulo = teclado.next();
        System.out.println("Insira valor: ");
        Doc1.valor = teclado.nextDouble();
        
        //Segundo documento
        Documento Doc2 = new Documento(Numero, Titulo, Valor);        
        
        System.out.println("\nDocumento 2");
        System.out.println("Insira numero: ");
        Doc2.numero = teclado.nextInt();
        System.out.println("Insira titulo: ");
        Doc2.titulo = teclado.next();
        System.out.println("Insira valor: ");
        Doc2.valor = teclado.nextDouble();
        
        //Terceiro documento
        Documento Doc3 = new Documento(Numero, Titulo, Valor);        
        
        System.out.println("\nDocumento 2");
        System.out.println("Insira numero: ");
        Doc3.numero = teclado.nextInt();
        System.out.println("Insira titulo: ");
        Doc3.titulo = teclado.next();
        System.out.println("Insira valor: ");
        Doc3.valor = teclado.nextDouble();
        
        //Quarto documento
        Documento Doc4 = new Documento(Numero, Titulo, Valor);        
        
        System.out.println("\nDocumento 2");
        System.out.println("Insira numero: ");
        Doc4.numero = teclado.nextInt();
        System.out.println("Insira titulo: ");
        Doc4.titulo = teclado.next();
        System.out.println("Insira valor: ");
        Doc4.valor = teclado.nextDouble();
        
        //Quinto documento
        Documento Doc5 = new Documento(Numero, Titulo, Valor);        
        
        System.out.println("\nDocumento 2");
        System.out.println("Insira numero: ");    
        Doc5.numero = teclado.nextInt();
        System.out.println("Insira titulo: ");
        Doc5.titulo = teclado.next();
        System.out.println("Insira valor: ");
        Doc5.valor = teclado.nextDouble();
        
        //O programa deve imprimir no final o titulo e valor dos documentos de menor e maior valor
        //a soma de todos os valores e media dos valores informados        
        
                
    }
    
}
