import java.util.Scanner;
public class Layout {
    public void layout(){
        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente(); 

        int agencia, 
            conta;

        double saqueSolicitado;

        System.out.println("========================");
        System.out.println("SISTEMA BANCARIO");
        System.out.println("========================");
        System.out.println("INFORME SUA AGÊNCIA:");
        agencia = input.nextInt();
        System.out.println("INFORME SUA CONTA:");
        conta = input.nextInt();

        System.out.printf("\n\n");

        if((agencia != cliente.AGENCIA) || (conta != cliente.CONTA)){
            return;
        }

        System.out.printf("\n\n");
        System.out.printf("ACESSO AUTORIZADO\n");
        System.out.printf("========================\n");
        System.out.printf("Seja Bem vindo %s\nAgência n° %d\nConta n° %d \n\n", cliente.NOME_CLIENTE, cliente.AGENCIA, cliente.CONTA);
        System.out.println("Qual o valor que deseja sacar?\n");
        saqueSolicitado = input.nextDouble();

        if(saqueSolicitado > cliente.SALDO){
            System.out.printf("Saldo Insuficiente, \nSaldo disponivel %.2f Reais", cliente.SALDO);
            return;
        }

        System.out.printf("Saque de %.2f Reais Realizado\nSaldo Restante %.2f", saqueSolicitado, cliente.SALDO-saqueSolicitado);
    }
}
