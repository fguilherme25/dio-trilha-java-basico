import java.util.Scanner;

/**
 * <h1>Desafio - Conta Terminal</h1>
 * O Conta Terminal é um programa que simula a criação de uma conta bancária através do terminal.
 * <p>
 * <b>Legacy:</b> Este código foi desenvolvido como parte de um desafio de programação.
 * <p>
 * <b>Note:</b> Certifique-se de fornecer entradas válidas ao executar o programa.
 * 
 * @author Fabio Francisco
 * @version 1.0
 * @since 2025-09-04
 * 
 */


public class ContaTerminal {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
