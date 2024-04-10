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

public class Despesa {
    
    int codigo;
    String nome;
    double valor;

    Despesa(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
