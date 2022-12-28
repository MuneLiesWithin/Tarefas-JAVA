public class Triangulo extends Figura{
    public void calculaArea(double x){
        //Teorema de Pitágoras para calcular a altura
        double altura = Math.sqrt((Math.pow(x,2))-(Math.pow(x/2,2)));
        System.out.printf("%nÁrea do triângulo: %.1f", (x*altura)/2);
    }
    
    public void calculaPerimetro(double x){
        System.out.printf("%nPerímetro do triângulo: %.1f", x*3);
    }
}