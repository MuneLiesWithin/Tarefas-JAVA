public class Estudante{
    
    //Atributos da classe
    private int codigo;
    private String nome;
    private String nascimento;
    private String email;
    private String senha;
    private Cidade cidade;
    
    //Construtor 
    public Estudante(int codigo, String nome, String nascimento, String email, String senha, Cidade cidade){
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        cidade.adicionaNovoEstudante();
    }
    
    //Métodos Get & Set
    public int getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getNascimento(){
        return nascimento;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public Cidade getCidade(){
        return cidade;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setCidade(Cidade cidade){
        this.cidade = cidade;
    }
    
    //Método que imprime os dados na tela
    public void exibeDados(){
        System.out.print("----- Dados Estudante! ------");
        System.out.printf("%nCódigo: %d", codigo);
        System.out.printf("%nNome: %s", nome);
        System.out.printf("%nNascimento: %s", nascimento);
        System.out.printf("%nE-mail: %s", email);
        System.out.printf("%nSenha: %s", senha);
        System.out.printf("%n-----------------------------%n");
        cidade.exibeDados();   
    }
}