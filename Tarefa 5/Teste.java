import java.util.*;

public class Teste{
    public static void main(String args[]){
        
        Scanner read = new Scanner(System.in);
        int opcao;
        double medida = 0;
        Figura f = null;
        boolean controle = true;
        
        while(controle){
            
            System.out.print("Vamos criar uma figura e calcular sua área e perímetro?\n\n");
            System.out.println("1- Quadrado");
            System.out.println("2- Triângulo");
            System.out.println("3- Círculo");
            System.out.print("\nDigite a opção de qual figura queres criar: ");
            opcao = read.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("\nDigite a medida do lado do quadrado: ");
                    medida = read.nextDouble();
                    f = new Quadrado();
                    controle = false;
                    break;
                
                case 2:
                    System.out.print("\nDigite a medida do lado do triângulo (equilátero): ");
                    medida = read.nextDouble();
                    f = new Triangulo();
                    controle = false;
                    break;
                    
                case 3:
                    System.out.print("\nDigite a medida do raio do círculo: ");
                    medida = read.nextDouble();
                    f = new Circulo();
                    controle = false;
                    break;
                    
                default:
                    System.out.print("\nOpção inválida. Tente novamente!\n\n");            
            }
        }
        
        f.calculaArea(medida);
        f.calculaPerimetro(medida);
    }
}