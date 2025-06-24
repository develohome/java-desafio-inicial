package exercicios;

public class CalculadoraSimples {

    public static void CalculadoraSimples(int valorA, int valorB, String operacao) {
        int resultado = 0;

        if (operacao.equals("+")) {
            System.out.println("--- Soma ---");
           resultado = valorA + valorB;
        }
        else
            if (operacao.equals("-")) {
                System.out.println("--- Subtração ---");
               resultado = valorA - valorB;
           }
           else
               if (operacao.equals("/")){
                   System.out.println("--- Divisão ---");
                   resultado = valorA / valorB;
               }else
                   if (operacao.equals("*")){
                       System.out.println("--- Multiplicação ---");
                       resultado =valorA * valorB;
                    }
        System.out.printf("Resultado: %d\n", resultado);

    }
}
