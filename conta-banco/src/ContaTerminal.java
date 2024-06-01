import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner texto = new Scanner (System.in).useLocale(Locale.US);
        String agencia;
        System.out.println("Por favor, digite o número da Agência !(067-8) ");
        agencia = texto.nextLine();
        System.out.println("O número da Agência é: " + agencia);

        System.out.println("Digite o número da conta:(1021) ");
        int numero = texto.nextInt();
        System.out.println("O número da conta digitada foi: " + numero);

        System.out.println("Digite o seu nome:(MARIO ANDRADE) ");
        String nomeCliente = texto.nextLine();
        nomeCliente = texto.nextLine();
        System.out.println("O nome digitado foi: " + nomeCliente);

        System.out.print("O seu saldo é:(237.48) ");
        double saldo = texto.nextDouble();
        System.out.println("O saldo digitado foi: " + saldo);

        System.out.println();
        System.out.printf("Óla %s, obrigado por criar uma conta em "
        + "nosso banco, sua agência é %s, "
        + "conta %d e seu saldo %.2f já está disponível"
        + " para saque.", nomeCliente, agencia, numero, saldo);
 
        texto.close();

    }

}

