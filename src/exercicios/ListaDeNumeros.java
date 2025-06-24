package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaDeNumeros {

    public static void ListaDeNumeros(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ListaDeNumeros = new ArrayList<>();

        System.out.println("Quantos números deseja inserir na lista ?");
        int qntNumeros = scanner.nextInt();

        for (int i = 0; i < qntNumeros ; i++) {
            if (i == 0){
                System.out.println("Digite um número");
            }else {
                System.out.println("Digite mais um número");
            }
            ListaDeNumeros.add(scanner.nextInt());
        }
        // filtrar os números impares
        List<Integer> numerosImpares = ListaDeNumeros.stream()
                        .filter(el -> el % 2 != 0)
                        .collect(Collectors.toList());

        // dobra os valores impares
        List<Integer> dobrarValoresImpares = numerosImpares.stream()
                        .map(el -> el * 2)
                        .collect(Collectors.toList());

        // ordena os valores da lista original
        List<Integer> ordenarValores = ListaDeNumeros.stream()
                        .sorted()
                        .collect(Collectors.toList());

        List<Integer> novoArray = ListaDeNumeros.stream()
                        .filter(el -> el % 2 != 0)
                        .map(el -> el * 2)
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(novoArray);
    }
}
