/*
 Atividade 3
    Na empresa onde trabalhamos, há tabelas com o valor gasto em cada mes.
   Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
   Em janeiro foram gastos 15000 reais; 
   Em fevereiro 23000 reais;
   Em março 17000 reais;

    Faça um programa que imprima o gasto total no trimestre e, no final,
   avise SE o gasto total estourou o orçamento de 50000 para o trimestre.
 */
package atividade3;

public class BalancoTrimestral {

    public static void main(String[] args) {
        int jan=15000;
        int fev=23000;
        int mar=17000;
        int gastoTrimestre= jan+fev+mar;
        
        System.out.println("O valor gasto no trimestre foi: R$" + gastoTrimestre);
        
        
        if (gastoTrimestre > 50000) {
            System.out.println("Estourou o orçamento!");
        }
    }
    
}