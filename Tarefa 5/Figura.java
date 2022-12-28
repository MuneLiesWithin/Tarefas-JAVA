public class Figura{
    public void calculaArea(double x){
        System.out.printf("%nÁrea: %.1f", Math.pow(x,2));
    }
    
    public void calculaPerimetro(double x){
        System.out.printf("%nPerímetro: %.1f", x*4);
    }
}