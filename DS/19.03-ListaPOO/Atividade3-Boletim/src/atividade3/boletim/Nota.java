/*
    Atividade 3
    Crie um Projeto em Java chamado Boletim;
    Neste projeto deve ser criado uma Classe, em um arquivo novo de nome Nota, 
    esta classe deve ter os atributos: bimestre(int), valorNota(double), com os respectivos métodos Setterse Getters;
    No arquivo boletim.java no método public static void main, deve ser instanciado 4 objetos da classe Nota (b1, b2, b3 e b4), 
    após criar os objetos, devem ser usados os Setters para informar os valores dos atributos deles, digitados pelo usuário;
    Deve ser impresso no final a média das notas dos objetos.
 */
package atividade3.boletim;

public class Nota {
    
    int bimestre;
    double valorNota;

    public int getBimestre() {
        return bimestre;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }    
    
}
