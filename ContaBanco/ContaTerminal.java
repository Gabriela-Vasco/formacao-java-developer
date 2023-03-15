import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta nº " + conta + " e seu saldo de R$" + saldo + "já está disponível para saque.");
        



    }
}