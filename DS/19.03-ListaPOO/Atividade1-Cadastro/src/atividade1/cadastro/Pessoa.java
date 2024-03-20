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

public class Pessoa {
    int codigo;
    String nome;
    int idade;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
