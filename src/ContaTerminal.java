import java.util.Scanner;

public class ContaTerminal {
    int conta;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();
        contaTerminal.execucao();
    }

    public void execucao(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite sua Agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Digite sua conta: ");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s,\nobrigado por criar uma conta em nosso banco!\n", nomeCliente);
        System.out.printf("Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", agencia, conta, saldo);

        scanner.close();
    }

   
}
