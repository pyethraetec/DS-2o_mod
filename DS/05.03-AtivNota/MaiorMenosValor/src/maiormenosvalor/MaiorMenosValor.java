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
       int num=0;
       int maior=0;
       int menor=0;
       int leituras;
       Scanner teclado;
            
	for (leituras = 10; leituras <= num; leituras = leituras + 1); {
        
            System.out.println("Maior e menor");
            System.out.println("Insira um numero");
            teclado = new Scanner (System.in);
            num = teclado.nextInt();   

            if (num > maior) {
                maior = num;
            }
            
            if (num < menor); {
                menor = num;
            }
        System.out.println("Maior número é " + maior);
	System.out.println("Menor número é " + menor);
        }
    }
}