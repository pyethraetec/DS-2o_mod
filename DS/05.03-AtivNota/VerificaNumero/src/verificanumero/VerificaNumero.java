/*
 Atividade 4
    Crie um projeto chamado VerificaNumero
    Criar um laço de repetição para ler a variável dado(int),até que a o valor 0 seja atingido;
    A cada numero digitado deve ser impresso na sua frente, se o valor é “par” ou “impar” , e se ele é um “número primo” ou “não é número primo”;
 */
package verificanumero;

    import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {
        int dado;
        int controle;
        Scanner teclado;
        
        
        for (controle = 10; controle != 0; controle--){
            
            System.out.println("\nInsira um numero");
            teclado = new Scanner (System.in);
            dado = teclado.nextInt();
            
            //teste par
            if (dado%2 == 0){
                System.out.println("Seu numero eh par");
            } else System.out.println("Seu numero eh impar");
            
            //teste primo
            if (dado%dado==0){
                System.out.println("Seu numero eh primo");
            } else System.out.println("Seu numero nao eh primo");
            
        }
    }
    
}
