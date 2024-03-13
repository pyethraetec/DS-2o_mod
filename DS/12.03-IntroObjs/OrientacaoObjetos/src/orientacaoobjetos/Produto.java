package orientacaoobjetos;

public class Produto {
    
    //criando atributos para produto
    private int id;
    private String nome;
    private String desc;
    private String sessao;
    private int preco;

    //ID
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    //Nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //Desc
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }


    //Sessao
    public void setSessao(String sessao) {
        this.sessao = sessao;
    }
    public String getSessao() {
        return sessao;
    }

    //Preço
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public int getPreco() {
        return preco;
    }
    
    
}
