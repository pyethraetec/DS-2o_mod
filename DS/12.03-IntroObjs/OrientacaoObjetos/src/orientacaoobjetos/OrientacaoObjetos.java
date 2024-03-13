
package orientacaoobjetos;

import java.util.HashSet;
import java.util.Set;

public class OrientacaoObjetos {

    
    public static void main(String[] args) {
        
        //Criando objeto da classe
        Produto Prod1;
        Prod1 = new Produto();
        
        //Informando atributos do objeto
        Prod1.setId(01);
        Prod1.setNome("Camiseta");
        Prod1.setPreco(25);
        Prod1.setSessao("Primavera");
        
        //Imprimindo atributos do objeto
        System.out.println("Id: "+Prod1.getId());
        System.out.println("Nome: "+Prod1.getNome());
        System.out.println("Preço: R$"+Prod1.getPreco());
        System.out.println("Sessão: "+Prod1.getSessao());
        
    }
    
}
