import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da agência");
        int agencia = sc.nextInt();

        System.out.println("Digite o número da conta");
        String conta = sc.next();

        System.out.println("Informe o nome do cliente");
        String nomeCliente = sc.next();

        System.out.println("Informe o saldo da conta");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, conta, saldo);

        sc.close();
    }
}