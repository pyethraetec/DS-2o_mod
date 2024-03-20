/*
    Atividade 3
    Crie um Projeto em Java chamado Boletim;
    Neste projeto deve ser criado uma Classe, em um arquivo novo de nome Nota, 
    esta classe deve ter os atributos: bimestre(int), valorNota(double), com os respectivos métodos Setters e Getters;
    No arquivo boletim.java no método public static void main, deve ser instanciado 4 objetos da classe Nota (b1, b2, b3 e b4), 
    após criar os objetos, devem ser usados os Setters para informar os valores dos atributos deles, digitados pelo usuário;
    Deve ser impresso no final a média das notas dos objetos.
 */
package atividade3.boletim;
import java.util.Scanner;

public class Atividade3Boletim {

    public static void main(String[] args) {
        
        Nota B01;
        B01 = new Nota();
            
        Nota B02;
        B02 = new Nota();
        
        Nota B03;
        B03 = new Nota();
        
        Nota B04;
        B04 = new Nota();
        
        
        Scanner teclado;
        teclado = new Scanner (System.in);
        
        System.out.println("Cadastro de notas");
        
        //Primeiro bimestre
        System.out.println("Insira o bimestre: ");
        B01.setBimestre(teclado.nextInt());
        System.out.println("Insira nota: ");
        B01.setValorNota(teclado.nextDouble());
        
        //Segundo bimestre
        System.out.println("Insira o bimestre: ");
        B02.setBimestre(teclado.nextInt());
        System.out.println("Insira nota: ");
        B01.setValorNota(teclado.nextDouble());
        
        
        //Terceiro bimestre
        System.out.println("Insira o bimestre: ");
        B03.setBimestre(teclado.nextInt());
        System.out.println("Insira nota: ");
        B03.setValorNota(teclado.nextDouble());
        
        //Quarto bimestre
        System.out.println("Insira o bimestre: ");
        B04.setBimestre(teclado.nextInt());
        System.out.println("Insira nota: ");
        B04.setValorNota(teclado.nextDouble());
        
        
        //Informando preço para o algorimo
        B01.getValorNota();
        B02.getValorNota();
        B03.getValorNota();
        B04.getValorNota();
        
        double notaFinal;
        notaFinal= ((B01.getValorNota() + B01.getValorNota() + B01.getValorNota() + B01.getValorNota())/4);
        System.out.println("Média final: "+notaFinal);
    }
    
}
