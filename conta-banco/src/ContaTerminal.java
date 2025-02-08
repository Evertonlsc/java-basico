import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o número da conta:");
            String numeroConta = scanner.nextLine();

            System.out.println("Digite sua agência:");
            String agencia = scanner.nextLine();

            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite seu saldo:");
            double saldo = scanner.nextDouble();

            // Uso da condição ternária para verificar se o saldo é positivo
            String statusSaldo = saldo >= 0 ? "positivo" : "negativo";

            System.out.println(String.format("Seu conta é: %s\nSua agência: %s\nNome do Cliente: %s\nSeu Saldo é: %.2f (%s)", 
                                              numeroConta, agencia, nomeCliente, saldo, statusSaldo));
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

//Neste exemplo, a condição ternária `saldo >= 0 ? "positivo" : "negativo"` é usada para determinar se o saldo é positivo ou negativo. Assim, você obtém uma verificação concisa e fácil de entender.

