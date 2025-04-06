import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Desafio DIO

        Scanner sc = new Scanner(System.in);
        int digito;
        int conta = 1021;
        String nomeCliente = "MARIO ANDRADE";
        String agencia;
        Double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência e depois o digito: ");
        agencia = sc.next();

        System.out.println("Digito");
        digito = sc.nextInt();


        System.out.println("Olá, " + nomeCliente +", obrigado por criar uma conta em nosso banco, " +
        "sua agência é: " +  agencia + "-" + digito  + ", conta " + conta + " e seu saldo " + saldo);

        sc.close();
    }
}
