
package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Calculo conta01;
        conta01 = new Calculo();
        
        Scanner teclado;
        teclado = new Scanner (System.in);
        
        System.out.println("Insira o numero 1: ");
        conta01.setNumero1(teclado.nextDouble());
        
        System.out.println("Qual o operador? ");
        conta01.setOperador(teclado.next());
                
        System.out.println("Insira o numero 2: ");
        conta01.setNumero2(teclado.nextDouble());
                
        System.out.println("Resultado: "+conta01.resultado());
    }
    
}
