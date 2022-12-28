public class Biblioteca{
    
    //Atributos
    private String nome;
    private int quantLivros;
    private boolean aberta_ou_fechada;

    //Construtor
    public Biblioteca(String nom, int quantLiv, boolean abert){     
        nome = nom;
        quantLivros = quantLiv;
        aberta_ou_fechada = abert;    
    }
    
    //Métodos Get & Set
    public void setNome(String nom){
        nome = nom;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setQuantLivros(int quantLiv){
        quantLivros = quantLiv;
    }
    
    public int getQuantLivros(){
        return quantLivros;
    }
    
    public void setAberta(boolean abert){
        aberta_ou_fechada = abert;
    }
    
    public boolean getAberta(){
        return aberta_ou_fechada;
    }
    
    //Outros Métodos
    public void entregarLivro(){
        quantLivros++;
    }
    
    public void retirarLivro(){
        quantLivros--;
    }
    
    public void exibeDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Quantidade de livros: "+ quantLivros);
        System.out.println("Aberta: "+ aberta_ou_fechada);
    }  
}
