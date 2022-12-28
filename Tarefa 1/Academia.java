public class Academia{
    public static void main(String args[]){

        System.out.println("--- Realize seu cadastro na Academia Corpórea! ---");

        System.out.println();

        String nome = Teclado.leString("Digite seu nome: ");
        int idade = Teclado.leInt("Digite sua idade: ");
        String cpf = Teclado.leString("Digite seu CPF: ");
        double altura = Teclado.leDouble("Digite sua altura: ");
        double peso = Teclado.leInt("Digite seu peso: ");
        char genero = Teclado.leChar("Digite seu gênero: ");
        String bairro = Teclado.leString("Digite seu bairro: ");
        String cidade = Teclado.leString("Digite sua cidade: ");
        String estado = Teclado.leString("Digite seu estado: ");
        String email = Teclado.leString("Digite seu e-mail: ");

        System.out.println();

        System.out.println("--- Confira suas informações! ---");

        System.out.println();

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("CPF: "+ cpf);
        System.out.println("Altura: "+ altura + "m");
        System.out.println("Peso: "+ peso + "kg");
        System.out.println("Gênero: "+ genero);
        System.out.println("Bairro: "+ bairro);
        System.out.println("Cidade: "+ cidade);
        System.out.println("Estado: "+ estado);
        System.out.println("E-mail: "+ email);

    }
}
