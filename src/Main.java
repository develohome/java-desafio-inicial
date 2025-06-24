import exercicios.*;
import menu.MostrarMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MostrarMenu.mostrarMenu();

        int opcao = scanner.nextInt();
        String operador = "";

        switch (opcao) {
            case 1:
                do{
                    System.out.println("Digite um dos operadores '+', '-', '*', '/'");
                    operador = scanner.nextLine();
                }while  (operador.equals(""));

                CalculadoraSimples.CalculadoraSimples(RetornaValorDigitado(), RetornaValorDigitado(), operador);
                break;
            case 2:
                NumeroParOuImpar.NumeroParOuImpar(RetornaValorDigitado());
                break;
            case 3:
                FatorarNumero.FatorarNumero(RetornaValorDigitado());
                break;
            case 4:
                Tabuada.Tabuada(RetornaValorDigitado());
                break;
            case 5:
                Matriz.Matriz();
                break;
        }
        scanner.close();
    }

    public static int RetornaValorDigitado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        return numero;
    }
}