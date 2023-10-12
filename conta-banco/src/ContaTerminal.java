import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Digite o número da agência:");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
        sc.close();
    }
}
