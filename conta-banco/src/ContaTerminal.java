import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a  Conta Bancaria !");
        String agencia = scanner.next();

        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do deposito inicial !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
