/*
 Introdução a vetores;
 */
package vetores;

public class Vetores {

    public static void main(String[] args) {
        
        int [] v = {1, 2, 4, 8, 100, 15, 25, 18, 20};
        
        //length => função que lê o tamanho do vetor
        for (int i=0;i<v.length; i=i+1){
            System.out.println("Valores do vetor: ");
            System.out.println(v[i]);
        }
        
        
    }
    
}
