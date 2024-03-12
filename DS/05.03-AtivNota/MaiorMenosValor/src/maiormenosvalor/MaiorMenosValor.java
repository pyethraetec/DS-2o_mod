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
       int maior;
       int num;
       int leituras;
       int menor;
       int controle;
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Analisando maior e menor");
        
        System.out.println("Quantos numeros vamos analisar? ");
        controle=entrada.nextInt();
        
            for (leituras = 0;leituras <= controle; leituras ++){
                System.out.print("Numero " + leituras + ": ");
                num = entrada.nextInt();
                maior = num;
                
                if(num > maior){
                  maior = num;
                 }
                
                if (num < menor){
                  menor = num;
                 }
            }

        System.out.println("O maior numero digitado é: "+maior);
        System.out.println("O menor numero digitado é: "+menor);
        }
    }