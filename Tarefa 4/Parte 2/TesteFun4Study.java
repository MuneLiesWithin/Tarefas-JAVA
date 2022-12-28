public class TesteFun4Study{
    public static void main(String args[]){
        
        boolean controleCidade = true, controleEstudante = true, controleSenha = true;
        int opcao, quantidadeEstudante = 0;
        Cidade cidade, novaCidade;
        Estudante estudante;
        String senhaAtual, senhaNova, repeatSenhaNova;
        
        while(controleCidade){
        
            System.out.print("#### Cadastro de cidade ####\n\n");
            cidade = new Cidade(Teclado.leInt("Digite o código: "),
                                Teclado.leString("Digite a descrição: "),
                                Teclado.leString("Digite o UF: "));
            System.out.println();
            cidade.exibeDados();
            
            while(controleEstudante){
                
                System.out.print("\n### Cadastro de estudante ###\n\n");
                estudante = new Estudante(Teclado.leInt("Digite seu código: "),
                                          Teclado.leString("Digite seu nome: "),
                                          Teclado.leString("Digite sua data de nascimento: "),
                                          Teclado.leString("Digite seu E-mail: "),
                                          Teclado.leString("Digite sua senha: "),
                                          cidade);
                quantidadeEstudante++;                          
                System.out.println();
                estudante.exibeDados();
                
                opcao = Teclado.leInt("\nDeseja alterar algum dado? (0- SIM/1- NÃO): ");
                if(opcao == 0){
                    System.out.print("\n#### Atualização de dados! ####");
                    System.out.printf("%n####   Aluno(a): %s   ####%n%n", estudante.getNome());
        
                    System.out.println("1- Código");
                    System.out.println("2- Nome");
                    System.out.println("3- Data de Nascimento");
                    System.out.println("4- E-mail");
                    System.out.println("5- Senha");
                    System.out.println("6- Cidade");
                    
                    opcao = Teclado.leInt("\nDigite a opção do dado que queres atualizar: ");
                    switch(opcao){
                        case 1: 
                            estudante.setCodigo(Teclado.leInt("\nDigite o novo código: "));
                            System.out.print("\nCódigo atualizado com sucesso!\n\n");
                            break;
                                
                        case 2: 
                            estudante.setNome(Teclado.leString("\nDigite o novo nome: "));
                            System.out.print("\nNome atualizado com sucesso!\n\n");
                            break;
                        
                        case 3: 
                            estudante.setNascimento(Teclado.leString("\nDigite a nova data de nascimento: "));
                            System.out.print("\nData de nascimento atualizada com sucesso!\n\n");
                            break;
                        
                        case 4: 
                            estudante.setEmail(Teclado.leString("\nDigite o novo E-mail: "));
                            System.out.print("\nE-mail atualizado com sucesso!\n\n");
                            break;
                        
                        case 5: 
                            while(controleSenha){
                                   
                                senhaAtual = Teclado.leString("\nDigite sua senha atual: ");
                                senhaNova = Teclado.leString("Digite sua nova senha: ");
                                repeatSenhaNova = Teclado.leString("Digite mais uma vez a nova senha: ");
                    
                                if(senhaAtual.equals(estudante.getSenha()) && senhaNova.equals(repeatSenhaNova)){
                                    estudante.setSenha(senhaNova);
                                    controleSenha = false;
                                    System.out.print("\nSenha atualizada com sucesso!\n\n");
                                }
                                else{
                                    System.out.print("\nSenha atual ou nova senha incorretas. Tente novamente!\n");
                                }
                                    
                            }
                            break;
                                    
                        case 6: 
                            System.out.print("\nInsira os dados da nova cidade!\n\n");
                            novaCidade = new Cidade(Teclado.leInt("Digite o código: "),
                                                    Teclado.leString("Digite a descrição: "),
                                                    Teclado.leString("Digite o UF: "));
                            estudante.setCidade(novaCidade);
                            novaCidade.adicionaEstudante();
                            cidade.retiraEstudante();
                            System.out.print("\nCidade atualizada com sucesso!\n\n");
                            break;
                                
                        default: 
                            System.out.print("\nOpção inválida!\n\n");
                    }
            
                    estudante.exibeDados();
                }
                else{
                    System.out.print("\nVocê optou por não alterar dados!\n");
                }
                
                opcao = Teclado.leInt("\nDeseja terminar o cadastro de estudantes? (0- SIM/1- NÃO): ");
                if(opcao == 0 && quantidadeEstudante >= 4){
                    controleEstudante = false;
                    quantidadeEstudante = 0;
                    System.out.print("\nFim do cadastro de estudantes!\n");   
                }
                else{
                    System.out.print("\nVocê optou por continuar ou quantidade de estudantes insuficiente (Mínimo 4)!\n");
                    System.out.printf("Quantidade de estudantes cadastrados até o momento: %d\n", quantidadeEstudante);
                }
                   
            }
            
            opcao = Teclado.leInt("\nDeseja terminar o cadastro de cidades? (0- SIM/1- NÃO): ");
            if(opcao == 0){
                controleCidade = false;
                System.out.print("\n#### FIM ####");
            }
            else{
                controleEstudante = true;
                controleSenha = true;
                System.out.print("\nVocê optou por continuar!\n\n");
            }
        
        }
        
    }
}