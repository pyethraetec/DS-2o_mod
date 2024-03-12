/*
 Atividade 3
    Crie um projeto chamado Numeros
    Ler o valor da variável leituras (int);
    Criar um laço de repetição para ler a variável numero(int) até que a quantidade de leituras seja atingido;
    Ao termino do laço de repetição deve ser informado o “maior valor” e o “menor valor”;
 */
package maiormenosvalor;
    import java.util.Scanner;

public class MaiorMenosValor {

    public static void main(String[] args) {
       int maior=0;
       int num;
       int leituras;
       
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos numeros vamos analisar?");
        leituras = entrada.nextInt();
        
        System.out.print("Insira o " + leituras+ " numero");
        num = entrada.nextInt();
        
        for (num = 0; num <= leituras; leituras ++){
            
        }

            while(leituras <= 10){
             System.out.print("Numero " + leituras + ": ");
             num = entrada.nextInt();

             if(num > maior){
              maior = num;
             }

             leituras++;
            }

        System.out.println("O maior numero digitado é: "+maior);
 
        }
    }