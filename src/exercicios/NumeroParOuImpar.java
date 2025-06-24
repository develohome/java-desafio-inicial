package exercicios;

public class NumeroParOuImpar {

    public static void NumeroParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.printf("O número %d é par ", numero);
        }
        else{
            System.out.printf("O número %d é impar ", numero);
        }
    }
}
