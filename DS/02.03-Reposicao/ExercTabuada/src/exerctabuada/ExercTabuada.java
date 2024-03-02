/*
 Exerc Tabuada
    Crie um projeto chamado Tabuada
    Leia o valor da variavel tabuada (int);
    Criar um laço de repetição para exibir o numero de 1 a 10 a ser multiplicado 
   pela variavel tabuada;
    ~1~ x n =
    A cada linha do laço deve ser lido a variavel resultado (int)
   e se o valor digitado corresponder a multiplicação de tabuada pelo numero
   exibir correto ou errado;
    O programa deve imprimir no final o numero de acertos e erros das digitações;
 */
package exerctabuada;

   import java.util.Scanner;

public class ExercTabuada {

    public static void main(String[] args) {
       int tabuada, resultado;
       int num = 1;
       int teste;
       int tentativas = 0;
       Scanner teclado;
        
       System.out.println("Escolha uma tabuada");
       teclado = new Scanner (System.in);
       tabuada = teclado.nextInt();   
       

       //laço
       do {
           System.out.println("Tabuada do "+ tabuada);       
           System.out.println(num +" x "+ tabuada + " = ");
           
           //calcula resultado
            teste = num * tabuada;  
           
           //recebe resultado
           teclado = new Scanner (System.in);
           resultado = teclado.nextInt();
           System.out.println("Errou :(");
           
           //controle
           tentativas = tentativas + 1;
           
       } while (teste != tabuada);
       
       System.out.println("Acertou!");
       System.out.println("Numero de tentativas: " + tentativas);
    }

}
