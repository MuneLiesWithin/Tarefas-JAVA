
public class Privada extends Universidade {
    private double valorMensalidade;

    public Privada(String n, int qA, int qP, double vM) {
        super(n, qA, qP);
        this.valorMensalidade = vM;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double vM) {
        valorMensalidade = vM;
    }
    
    public void imprimeInfo(){
        System.out.printf("----Universidade Privada-----%n");
        super.imprimeInfo();
        System.out.println("Valor da mensalidade: R$"+valorMensalidade);
        System.out.printf("-----------------------------%n%n");
    }
    
}
