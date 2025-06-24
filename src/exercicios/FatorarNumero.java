package exercicios;

import java.util.Scanner;

public class FatorarNumero {

    public static void FatorarNumero(int numero) {
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para fatorar: ");
        int numero = scanner.nextInt();
        scanner.close();*/
        int n = numero;

        for (int i = 2; i <= n; i++) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }
        System.out.println();

    }
}
