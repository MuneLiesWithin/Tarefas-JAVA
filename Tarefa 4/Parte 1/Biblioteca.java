import java.util.Scanner;

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
    
    //Método para retirar ou devolver um livro
    public void Livro(){
        if(aberta_ou_fechada == true){
            
            Scanner read = new Scanner(System.in);
            System.out.print("Digite o nome do livro: ");
            String livro = read.nextLine();
            System.out.printf("Devolver ou retirar %s? (Digite 1 para retirar ou 2 para devolver): ", livro);
            int opcao = read.nextInt();
            
            switch(opcao){
                case 1: quantLivros--;
                        System.out.printf("%nO livro %s foi retirado com sucesso! %nQuantidade de livros: %d", livro, quantLivros);
                        break;
            
                case 2: quantLivros++;
                        System.out.printf("%nO livro %s foi devolvido com sucesso! %nQuantidade de livros: %d", livro, quantLivros);
                        break;
            
                default: System.out.print("\nOpção inválida!");
            }   
        }
        else{
            System.out.printf("A biblioteca %s se encontra fechada!", nome);
        }
    }
    
    //Método para exibir os dados
    public void exibeDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Quantidade de livros: "+ quantLivros);
        System.out.println("Aberta: "+ aberta_ou_fechada);
    }  
}
