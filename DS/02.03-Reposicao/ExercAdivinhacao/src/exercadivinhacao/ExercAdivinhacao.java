/*
 Exerc - Adivinhação 
    Crie um projeto chamado Adivinhação. Deve ser criado duas variaveis int (segredo, numero, tentativa);
    Ler o valor da variavel segredo;
    Criar um laço de repetição para ler a variavel numero e só terminar o laço quando o numero for igual a segredo;
    O programa deve imprimir no final o numero de tentativas usadas ate o jogador conseguir acertar o valor correto.
 */
package exercadivinhacao;

    import java.util.Scanner;
   
public class ExercAdivinhacao {

    public static void main(String[] args) {
       int numero, segredo;
       int tentativas = 0;
       Scanner teclado;
       
       //Armazenando segredo
       System.out.println("Insira um valor segredo: ");
       teclado = new Scanner (System.in);
       segredo = teclado.nextInt();
       
       
       //laço
       do {
           System.out.println("Qual o numero?");
           teclado = new Scanner (System.in);
           numero = teclado.nextInt();
           System.out.println("Numero errado.\nTente novamente!\n");
           
           tentativas = tentativas + 1;
           
       } while (numero != segredo);
       
        System.out.println("Acertou!");
        System.out.println("Numero de tentativas: "+tentativas);
    }
}
