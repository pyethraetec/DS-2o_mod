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

public class Documento {
    
    int numero;
    String titulo;
    double valor;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Documento(int numero, String titulo, double valor) {
        this.numero = numero;
        this.titulo = titulo;
        this.valor = valor;
    }    
    
}
