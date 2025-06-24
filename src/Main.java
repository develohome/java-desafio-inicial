import exercicios.*;
import menu.MostrarMenu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int opcao = scanner.nextInt(); está dando erro
        /*
        *   Jun 24, 2025 2:10:01 PM sun.rmi.transport.tcp.TCPTransport$AcceptLoop run
            WARNING: RMI TCP Accept-0: accept loop for ServerSocket[addr=0.0.0.0/0.0.0.0,localport=51970] throws
            java.io.IOException: The server sockets created using the LocalRMIServerSocketFactory only accept connections from clients running on the host where the RMI remote objects have been exported.
            at jdk.management.agent/sun.management.jmxremote.LocalRMIServerSocketFactory$1.accept(LocalRMIServerSocketFactory.java:114)
            at java.rmi/sun.rmi.transport.tcp.TCPTransport$AcceptLoop.executeAcceptLoop(TCPTransport.java:413)
            at java.rmi/sun.rmi.transport.tcp.TCPTransport$AcceptLoop.run(TCPTransport.java:377)
            at java.base/java.lang.Thread.run(Thread.java:840)
        * */
        MostrarMenu.mostrarMenu();
        int opcao = 5;
        int numeroA = 10;
        int numeroB = 20;
        String operador = "/";

        switch (opcao) {
            case 1:
                CalculadoraSimples.CalculadoraSimples(numeroA, numeroB, operador);
                break;
            case 2:
                NumeroParOuImpar.NumeroParOuImpar(numeroA);
                break;
            case 3:
                FatorarNumero.FatorarNumero(numeroA);
                break;
            case 4:
                Tabuada.Tabuada(numeroA);
                break;
            case 5:
                Matriz.Matriz();
                break;
        }
        //scanner.close();
    }
}