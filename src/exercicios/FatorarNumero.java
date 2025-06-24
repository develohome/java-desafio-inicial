package exercicios;

import java.util.Scanner;

public class FatorarNumero {

    public static void FatorarNumero(int numero) {
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
