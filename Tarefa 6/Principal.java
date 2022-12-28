public class Principal{
    public static void main(String args[]){
        
        System.out.print("Bem-vindo ao sistema de cadastro de universidades!\n\n");
        
        int opcao;
        Universidade[] uni = new Universidade[Teclado.leInt("Deseja cadastrar quantas universidades: ")];
        MEC mec = new MEC();
        
        for(int i = 0; i < uni.length; i++){
                
            opcao = Teclado.leInt("\nQual tipo de universidade queres cadastrar?(1-PÚBLICA/2-PRIVADA)");
               
            switch(opcao){
                case 1:
                    uni[i] = new Publica(Teclado.leString("\nDigite o nome da universidade: "),
                                         Teclado.leInt("Digite a quantidade de alunos: "),
                                         Teclado.leInt("Digite a quantidade de professores: "),
                                         Teclado.leString("Digite o nome do Estado: "),
                                         Teclado.leString("Digite o nome da Cidade: ")
                                         );   
                    break;
                    
                case 2:
                    uni[i] = new Privada(Teclado.leString("\nDigite o nome da universidade: "),
                                         Teclado.leInt("Digite a quantidade de alunos: "),
                                         Teclado.leInt("Digite a quantidade de professores: "),
                                         Teclado.leDouble("Digite o valor da mensalidade: ")
                                        );
                    break;
                        
                default: 
                    System.out.print("\nOpção inválida. Tente novamente!\n");
                    i--;
                    
            }  
        }
        
        System.out.print("\n### UNIVERSIDADES CADASTRADAS ###\n\n");
        mec.imprimeUniversidade(uni);
        
        System.out.print("### UNIVERSIDADE PRIVADA MAIS CARA ###\n\n");
        mec.maisCara(uni);
        
        System.out.print("### UNIVERSIDADES LOCALIZADAS NO SUL ###\n\n");
        mec.universidadesDoSul(uni);
        
    }
}