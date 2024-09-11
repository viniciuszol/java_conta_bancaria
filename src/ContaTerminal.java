import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nomecliente = scanner.nextLine();

        System.out.println("Digite o número da sua âgencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o número do seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }

}