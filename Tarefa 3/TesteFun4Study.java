public class TesteFun4Study{
    
    //Métodos cadastroCidade, cadastroEstudante e updateSenha foram criados para evitarem a repetição de código
    private static Cidade cadastroCidade(){
         Cidade cadastro_cidade = new Cidade(Teclado.leInt("Digite o código: "),
                                             Teclado.leString("Digite a descrição: "),
                                             Teclado.leString("Digite o UF: "));
                                             
         return cadastro_cidade;                                       
    }
    
    private static Estudante cadastroEstudante(Cidade cidade){
        Estudante cadastro_estudante = new Estudante(Teclado.leInt("Digite seu código: "),
                                                     Teclado.leString("Digite seu nome: "),
                                                     Teclado.leString("Digite sua data de nascimento: "),
                                                     Teclado.leString("Digite seu E-mail: "),
                                                     Teclado.leString("Digite sua senha: "),
                                                     cidade);
                                                      
        return cadastro_estudante;                                              
    }
    
    private static void updateSenha(Estudante estudante){
        System.out.print("\n#### Atualização de senha! ####");
        System.out.printf("%n####   Aluno(a): %s   ####%n%n", estudante.getNome());
        
        String senhaAtual = Teclado.leString("Digite sua senha atual: ");
        String senhaNova = Teclado.leString("Digite sua nova senha: ");
        String repeatSenhaNova = Teclado.leString("Digite mais uma vez a nova senha: ");
        
        if (senhaAtual.equals(estudante.getSenha()) && senhaNova.equals(repeatSenhaNova)){
            estudante.setSenha(senhaNova);
            System.out.print("\nSENHA ATUALIZADA COM SUCESSO!\n\n");
        }
        else
            System.out.print("\nSENHA ATUAL OU NOVA SENHA INCORRETAS!\n\n");
        
        estudante.exibeDados();
    }
    
    //Método Main
    public static void main(String args[]){
        
        System.out.print("#### Cadastro da cidade 1 ####\n\n");
        
        Cidade c1 = cadastroCidade();
        
        System.out.print("\n#### Cadastro da cidade 2 ####\n\n");
        
        Cidade c2 = cadastroCidade();
                               
        System.out.print("\n### Cadastro do estudante 1 ###\n\n");                       
                               
        Estudante e1 = cadastroEstudante(c1);
                                     
        updateSenha(e1);
        
        System.out.print("\n### Cadastro do estudante 2 ###\n\n");                       
                               
        Estudante e2 = cadastroEstudante(c1);
                                     
        updateSenha(e2);
                               
        System.out.print("\n### Cadastro do estudante 3 ###\n\n");                       
                               
        Estudante e3 = cadastroEstudante(c2);
                                     
        updateSenha(e3);
        
        System.out.print("\n### Cadastro do estudante 4 ###\n\n");                       
                               
        Estudante e4 = cadastroEstudante(c2);
                                     
        updateSenha(e4);
                                 
    }
}