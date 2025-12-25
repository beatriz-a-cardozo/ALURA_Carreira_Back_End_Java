import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Client beatriz = new Client("Beatriz Cardozo", "Corrente", 2805);

        System.out.println(beatriz);

        int option = 0;

        while (option != 4) {
            System.out.println();
            System.out.println("""
                         ___________________________
                        |                           |
                        | 1 - Consultar saldos      |
                        | 2 - Receber valor         |
                        | 3 - Transferir valor      |
                        | 4 - Sair                  |
                        |___________________________|
                    """);

            System.out.print("Insira uma das opções: ");

            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println(beatriz.consultBalance());
                    break;

                case 2:
                    System.out.println("========================================");
                    System.out.print("Insira o valor recebido: ");
                    double valorRecebido = input.nextDouble();
                    System.out.println();
                    System.out.println(beatriz.receiveMoney(valorRecebido));

                    break;

                case 3:
                    System.out.println("========================================");
                    System.out.print("Insira o valor a transferir: ");
                    double valorTransferido = input.nextDouble();
                    System.out.println();
                    System.out.println(beatriz.transferMoney(valorTransferido));

                    break;

                case 4:
                    System.out.println("Até mais!");

                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente!");
            }
        }

    }
}
