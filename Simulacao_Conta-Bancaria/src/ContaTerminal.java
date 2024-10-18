import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua conta: ");
        int contaBancaria = scanner.nextInt();

        System.out.println("Digite sua agência com dígito: ");
        String agenciaBancaria = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        Double saldoBancario = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agenciaBancaria + " e o seu saldo de R$" + saldoBancario + " já está disponível para saque.");

    }
}
