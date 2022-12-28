public class Circulo extends Figura{
    public void calculaArea(double x){
        System.out.printf("%nÁrea do círculo: %.1f", Math.PI*Math.pow(x,2));
    }
    
    public void calculaPerimetro(double x){
        System.out.printf("%nCircunferência do círculo: %.1f", 2*Math.PI*x);
    }
}