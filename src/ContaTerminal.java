import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int numeroconta;
        String agencia, nomecliente;
        double saldo = 25;

        System.out.println("Por favor digite seu nome : ");
        nomecliente = ler.next();

        System.out.println("Por favor o numero da agencia : ");
        agencia = ler.next();

        System.out.println("Por favor digite o numero da conta : ");
        numeroconta = ler.nextInt();

        System.out.println("Por Favor digite o valor para deposito : ");
        saldo = ler.nextDouble();

        System.out.println(
                "\nOlá, " + nomecliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + numeroconta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
