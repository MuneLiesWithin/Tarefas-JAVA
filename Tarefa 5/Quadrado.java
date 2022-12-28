public class Quadrado extends Figura{
    public void calculaArea(double x){
        System.out.printf("%nÁrea do quadrado: %.1f", Math.pow(x,2));
    }
    
    public void calculaPerimetro(double x){
        System.out.printf("%nPerímetro do quadrado: %.1f", x*4);
    }
}