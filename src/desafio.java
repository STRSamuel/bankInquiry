import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String name = "Samuel";
        String accountType = "Corrente";
        double balance = 9500;
        int option = 0;
        // INFORMAÇÕES DE USUARIO
        System.out.println(
                "-----------------------------\n" +
                        "Name: " + name + "\n" +
                        "Account type: " + accountType + "\n" +
                        "Current balance: " + balance + "\n" +
                        "-----------------------------"
        );
        // MENU
        String menu = """
            1 - Check balance
            2 - Transfer value
            3 - Receive value 
            4 - Quit
             
            ˜ Enter your option ˜˜
        """;

        Scanner leitura = new Scanner(System.in);
        // OPÇÃO 4 - SAIR DO PROGRAMA
        while (option != 4) {
            System.out.println(menu);
            option = leitura.nextInt();
            System.out.println("Finished");
            // OPÇÃO 1 - CONSULTA DE SALDO
            if (option == 1) {
                System.out.println("Your current balance is " + balance);
                // OPÇÃO 2 - TRANSFERIR
            } else if (option == 2) {
                System.out.println("What is the amount to transfer?");
                double value = leitura.nextDouble();
                if (value > balance) {
                    System.out.println("Insufficient balance");
                } else {
                    balance -= value;
                    System.out.println("Balance updated to $" + balance);
                }
                // OPÇÃO 3 - RECEBER VALOR
            } else if (option == 3) {
                System.out.println("Amount received: ");
                double value = leitura.nextDouble();
                balance += value;
                System.out.println("Balance updated to $" + balance);
            }
        }
    }
}
