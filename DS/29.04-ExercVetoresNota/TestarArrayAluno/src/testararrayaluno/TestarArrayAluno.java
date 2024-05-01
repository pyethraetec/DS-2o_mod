/*
  Crie um projeto de nome TestarArrayAlunoque que possua um vetor de objetos, 
 chamado turma, do tipo Aluno, com capacidade para 5 objetos. 
 Crie a classe aluno tal como apresentada no diagrama abaixo.
 *Crie os métodos gets e sets para cada um dos atributos 
 *O método calcularMediaretorna um valor do tipo double representando a média aritmética 
 das duas notas do aluno.* 
 Leia os dados para os objetos criados.* 
 No final apresente uma lista contendo o nome e a média de cada um dos alunos.
 */
package testararrayaluno;

import java.util.Scanner;

public class TestarArrayAluno {

    public static void main(String[] args) {
        
        Aluno [] turma = new Aluno [5];
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Cadastro aluno/nota");
        
        for (int i=0; i<turma.length;i++){
            turma[i] = new Aluno();
            System.out.println("\nInsira o nome do aluno: ");
            turma[i].setNome(teclado.next());
            System.out.println("Insira 1a nota: ");
            turma[i].setNota1(teclado.nextDouble());
            System.out.println("Insira 2a nota ");
            turma[i].setNota2(teclado.nextDouble());
            turma[i].calcularMedia();
            
            System.out.println("Nome: "+turma[i].getNome());
            System.out.println("Nome: "+turma[i].calcularMedia());
        }
        
        
        
    }
    
}
