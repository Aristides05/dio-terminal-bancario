import java.util.Scanner;
import java.util.Random;

public class Layout {
    public void layout(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String nomeCliente;

        System.out.println("========================");
        System.out.println("SISTEMA BANCARIO");
        System.out.println("========================");
        System.out.println("INFORME SEU NOME PARA A ABERTURA DE CONTA:");
        nomeCliente = input.next();

        Cliente cliente = new Cliente(nomeCliente);
        cliente.setAgencia(random.nextInt(900)+100);
        cliente.setConta(random.nextInt(900000)+100000);
        cliente.setSaldo(random.nextDouble()*1000);

        System.out.println("SUA CONTA E AGENCIA JÁ FOI GERADA, SEGUEM OS DADOS:");
        System.out.println("========================");
        System.out.printf("Nome do Cliente: %s \n", cliente.getNomeCliente());
        System.out.printf("Agencia: %d \n", cliente.getAgencia());
        System.out.printf("Conta: %d \n", cliente.getConta());
        System.out.printf("Saldo: %.2f \n", cliente.getSaldo());
        System.out.println("========================  \n \n");

        System.out.println("INFORME O VALOR QUE DESEJA SACAR:");
        Double saqueSolicitado = input.nextDouble();

        if(saqueSolicitado > cliente.getSaldo()){
            System.out.printf("Saldo Insuficiente, \nSaldo disponivel %.2f Reais", cliente.getSaldo());
            input.close();
            return;
        }

        cliente.setSaldo(cliente.getSaldo()-saqueSolicitado);
        System.out.printf("Saque de %.2f Reais Realizado\nSaldo Restante %.2f", saqueSolicitado, cliente.getSaldo());

        System.out.printf("\n\n");

        input.close();
    }
}
