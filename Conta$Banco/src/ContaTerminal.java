import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = entrada.next();

        System.out.println("Digite sua agência: ");
        String agenciaCliente = entrada.next();

        System.out.println("Digite o número da agência: ");
        int numeroAgenciaCliente = entrada.nextInt();

        System.out.println("Digite seu saldo: ");
        Float saldoCliente = entrada.nextFloat();

        System.out.println("");
        entrada.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.3f já está disponível para saque", nomeCliente, agenciaCliente, numeroAgenciaCliente, saldoCliente);
    }
}
