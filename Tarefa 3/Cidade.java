public class Cidade{
    
    //Atributos da classe
    private int codigo;
    private String descricao;
    private String uf;
    private int quantEstudantes;
    
    //Construtor
    public Cidade(int codigo, String descricao, String uf){
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;   
    }
    
    //Métodos Get & Set
    public int getCodigo(){
        return codigo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public String getUf(){
        return uf;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setUf(String uf){
        this.uf = uf;
    }
    
    //Método que adiciona mais um estudante
    public void adicionaNovoEstudante(){
        quantEstudantes++;
    }
    
    //Método que imprime os dados na tela
    public void exibeDados(){
        System.out.printf("------- Dados Cidade! -------");
        System.out.printf("%nCódigo: %d", codigo);
        System.out.printf("%nDescrição: %s", descricao);
        System.out.printf("%nUF: %s", uf);
        System.out.printf("%nQuantidade de estudantes: %d", quantEstudantes);
        System.out.printf("%n-----------------------------%n");
    }
}