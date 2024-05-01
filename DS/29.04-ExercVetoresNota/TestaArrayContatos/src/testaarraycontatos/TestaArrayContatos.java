
package testaarraycontatos;

public class TestaArrayContatos {

    public static void main(String[] args) {
        
        Contato[] agenda = new Contato[5];
        
        agenda[0] = new Contato("Maria", "123456");
        agenda[1] = new Contato("Pedro", "123456");
        agenda[2] = new Contato("Marta", "123456");
        agenda[3] = new Contato("Joao", "123456");
        agenda[4] = new Contato("Miriam", "123456");
        
        System.out.println("***MINHA AGENDA DE CONTATOS***");
        
        for (int i=0;i<agenda.length;i++){
            System.out.println("Nome: "+agenda[i].getNome());
            System.out.println("Telefone: "+agenda[i].getTelefone());
        }
    }
    
}
