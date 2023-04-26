import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente, tipoConta, menu;
        double saldo;
        int opcao = 0;
        Scanner lerEntrada = new Scanner(System.in);

        nomeCliente = "Aquele Cliente";
        tipoConta = "Corrente";
        saldo = 2253.20;

        String dadosIniciais = """
                ****************************************
                Nome: %s
                Tipo conta: %s
                Saldo: R$ %.2f
                ****************************************
                """.formatted(nomeCliente, tipoConta, saldo);

        System.out.println(dadosIniciais);

        menu = """
                    Digite sua opção:
                    1 - Consultar saldo;
                    2 - Receber valor;
                    3 - Transferir valor;
                    4 - Sair;
                    
                    """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = lerEntrada.nextInt();
            switch (opcao){
                case 1:{
                    System.out.println("Seu saldo atual é de: R$ " + saldo);
                    break;
                }
                case 2:{
                    System.out.println("Informe o valor recebido:");
                    double valorRecebido = lerEntrada.nextDouble();
                    if (valorRecebido < 0){
                        System.out.println("Valor não pode ser negativo.");
                    }
                    else {
                        saldo += valorRecebido;
                        System.out.println("Saldo atualizado.");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Informe valor a ser transferido:");
                    double valorTransferido = lerEntrada.nextDouble();
                    if (valorTransferido > saldo){
                        System.out.println("Saldo insuficiente para a transferencia.");
                    }
                    else {
                        saldo -= valorTransferido;
                        System.out.println("Saldo atualizado.");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Até breve");
                    break;
                }
                default:{
                    System.out.println("Opção inválida");
                }
            }
        }
    }
}
