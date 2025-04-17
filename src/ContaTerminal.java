import java.util.Scanner;

public class ContaTerminal {
    int conta;
    String agencia;
    String nomeCliente;
    Double saldo;

    public static void main() throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();
        contaTerminal.execucao();
    }

    public void execucao(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite sua Agencia: ");
        agencia = scanner.next();

        System.out.println("Digite sua conta: ");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá %s,\n obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque\"");

        scanner.close();
    }

   
}
