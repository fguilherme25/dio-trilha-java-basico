import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o Primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Por favor, digite o Segundo número:");
        int numero2 = scanner.nextInt();

        compararNumeros(numero1, numero2);

        scanner.close();
    }

    static void compararNumeros(int numero1, int numero2) throws ParametrosInvalidosException {
        try {
            if (numero1 < 0 || numero2 < 0) {
                throw new ParametrosInvalidosException("ERRO! Números negativos não são permitidos.");
            } else if (numero1 > numero2) {
                throw new ParametrosInvalidosException("ERRO! O Primeiro número não pode ser maior que o segundo.");
            } else {
                System.out.println("Contando de " + numero1 + " até " + numero2 + ":");
                for(int i = numero1; i <= numero2; i++) {
                    System.out.println(i);
                }
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            return;
        }

    }
}