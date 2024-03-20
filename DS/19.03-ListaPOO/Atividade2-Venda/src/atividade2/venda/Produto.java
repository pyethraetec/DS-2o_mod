/*
    Atividade 2
    Crie um Projeto em Java chamado Venda;
    Neste projeto deve ser criado uma Classe, em um arquivo novo de nome Produto, 
    esta classe deve ter os atributos: numero(int), descricao(String)e preco(double), com os respectivos métodos Setters e Getters;
    No arquivo venda.java no método public static void main, deve ser instanciado 5 objetos da classe Produto (item1, item2, item3, item4 e item5), 
    depois de criar os objetos, devem ser usados os Setters para informar os valores dos atributos deles, digitados pelo usuário;
    No final o programa deve exibir o valor total dos ítens.
 */
package atividade2.venda;

public class Produto {
    
    int numero;
    String descricao;
    double preco;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
