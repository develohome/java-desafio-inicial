package exercicios;

import java.util.*;
import java.util.stream.Collectors;

public class ListaNome {

    public static void ListaNome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas idades deseja inserir ? ");
        Map<String, Integer> idades = new HashMap<String, Integer>();
        Set<String> nomes = new HashSet<>();
        int numerosDeIdades = scanner.nextInt();
        int idade;
        String keyName;

        for (int i = 0; i < numerosDeIdades; i++) {
            System.out.println("Digite o nome da chave: ");
            keyName = scanner.next();
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();
            idades.put(keyName, idade);
        }

        for (Map.Entry<String, Integer> entry : idades.entrySet()) {
            if(entry.getValue()>=30){
                nomes.add(entry.getKey());
            }
        }
        List<String> nomesOrdenados = nomes.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("+------------------------------+");
        System.out.println("|      MAIORES DE 30 ANOS      |");
        System.out.println("+------------------------------+");

        for (String nome : nomesOrdenados) {
            System.out.println(" " + nome);
            System.out.println("+------------------------------+");
        }
    }
}
