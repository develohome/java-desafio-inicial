package exercicios;

public class Tabuada {

    public static void Tabuada(int numero) {
        System.out.printf("Tabuada do : %d\n", numero);
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
}
