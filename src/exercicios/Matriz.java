package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Matriz {

    public static void Matriz(){
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int somaLinha;
        int somaLinhas[] = new int[3];
        int totalDeValores = 0;
        System.out.println("Digite 9 números");

        for (int i = 0; i < 3; i++) {
            somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um número");
                matriz[i][j] = scanner.nextInt();
                somaLinha += matriz[i][j];
            }
            somaLinhas[i] = somaLinha;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
                totalDeValores += matriz[i][j];
            }
            System.out.println("");
        }

        for (int i = 0; i < somaLinhas.length ; i++) {
            System.out.println("-----------------------------");
            System.out.printf("Soma da linha %d = %d\n", (i+1), somaLinhas[i]);
        }

        System.out.println("-----------------------------");
        System.out.printf("Soma total: %d", totalDeValores);

        scanner.close();
    }

}
