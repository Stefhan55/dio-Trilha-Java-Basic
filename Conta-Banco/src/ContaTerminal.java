
 import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, Digite o numero da Agencia:");
        String agencia = scanner.nextLine();



        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por Favor, Digite  o Saldo inicial: ");
        double saldo = scanner.nextDouble();

        scanner.close();
 
        String mensagem =  " Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua Agencia é " + agencia + ", conta "+ numero + " e seu saldo " + saldo + "  Já esta disponivel para saque. ";
        
        System.out.println(mensagem);
    }
}
