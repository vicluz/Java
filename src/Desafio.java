import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "João da Silva";
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        int opcao = 0;

        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo disponivel: " + saldo);
        System.out.println("\n**************************");

        String menu = """
                 ** Digite sua opção **
                 1 - Consultar saldo
                 2 - Enviar pix
                 3 - Receber pix
                 4 - Sair
                
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é :" + saldo);

            } else if (opcao == 2) {
                System.out.println("qual o valor que deseja transferir ?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("\nSaldo insuficiente");
                    System.out.println(" ");
                }else {
                    saldo -=  valor;
                    System.out.println("Novo saldo " + saldo);
                }

                
            } else if (opcao == 3) {
                System.out.println("Qual valor você deseja receber ?");
                double valor = leitura.nextDouble();
                saldo +=valor;
                System.out.println("\nNovo saldo " + saldo );
                System.out.println(" ");



            } else if (opcao != 4) {
                System.out.println("Opção invalida");
                System.out.println(" ");

            }

        }

    }
}
