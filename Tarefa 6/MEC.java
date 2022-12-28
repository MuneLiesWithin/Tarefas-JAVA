public class MEC{
    public void imprimeUniversidade(Universidade[] uni){
        for(int i = 0; i < uni.length; i++){
            uni[i].imprimeInfo();
        }
    }
    
    public void maisCara(Universidade[] uni){
        
        double maior = 0;
        Privada cara = null;
        boolean controleCara = true;
        
        for(int i = 0; i < uni.length; i++){
            if(uni[i] instanceof Privada && ((Privada)uni[i]).getValorMensalidade() > maior){
                controleCara = false;
                maior = ((Privada)uni[i]).getValorMensalidade();
                cara = (Privada)uni[i];
            }  
        }
        
        if(controleCara){
            System.out.print("Nenhuma universidade mais cara cadastrada!\n\n");
        }
        else{
            cara.imprimeInfo();
        }   
    }
    
    public void universidadesDoSul(Universidade[] uni){
        
        boolean controleSul = true;
        
        for(int i = 0; i < uni.length; i++){
            if(uni[i] instanceof Publica){
                if(((Publica)uni[i]).getEstado().toUpperCase().equals("PR") || 
                   ((Publica)uni[i]).getEstado().toUpperCase().equals("SC") || 
                   ((Publica)uni[i]).getEstado().toUpperCase().equals("RS")){
                    controleSul = false;  
                    uni[i].imprimeInfo();
                }
            }
        }
        
        if(controleSul){
            System.out.print("Nenhuma universidade no sul cadastrada!\n\n");
        }        
    }
}