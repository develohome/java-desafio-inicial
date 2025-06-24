package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matriz {

    public static void Matriz(){
        Scanner numero = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int linha = 3;
        int coluna = linha;
        int somaLinhas[] = new int[3];
        int soma;
        int total = 0;
        for (int i = 0; i < linha; i++) {
            soma = 0;
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite um numero");
                matriz[i][j] = numero.nextInt();
                soma += matriz[i][j];
                total += soma;
            }
            somaLinhas[i] = soma;
        }


        numero.close();
    }

}
