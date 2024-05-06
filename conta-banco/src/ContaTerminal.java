import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int numeroConta;
        String idAgencia;
        String nomeCliente;
        float saldo;

        System.out.print("Digite o número da conta: ");
        numeroConta = sc.nextInt();
        
        System.out.print("Digite o código da agência: ");
        idAgencia = sc.next();
        
        System.out.print("Digite o nome do cliente: ");
        nomeCliente = sc.next();
        
        System.out.print("Digite o saldo do cliente: ");
        saldo = sc.nextFloat();
        
        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, idAgencia, numeroConta, saldo);
    }
}
