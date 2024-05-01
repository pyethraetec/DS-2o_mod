/*
 
 */
package fechamento;

import java.util.Scanner;

public class Fechamento {

    public static void main(String[] args) {
        
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        
     
        
        double soma = 0 ;
        double media = 0;
        
        Requisicao[] item = new Requisicao[5];
        
        for(int cont = 0; cont < item.length; cont=cont+1){
            item[cont] = new Requisicao();
            System.out.println("Digite o código: ");
            item[cont].setCodigo(teclado.nextInt());
            
            
            System.out.println("Digite o nome: ");
            item[cont].setNome(teclado.next());
            
            
            System.out.println("Digite o preço: ");
            item[cont].setValor(teclado.nextDouble());
            
            
       soma = soma + item[cont].getValor();
        }
        
        
        media = soma/item.length;
        
        System.out.println("Todos os valores somados são: "+soma);
        System.out.println("A média dos valores são: "+media);
        
    }
    
}
