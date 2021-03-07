import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        int salir;
            do{
                Random premios = new Random();

                Scanner obj = new Scanner((System.in));

                int opcion;

                String[] premio = {"Q1.00", "Q10.00", "Q100.00", "Q1,000.00", "Q10,000.00"};

                System.out.println("Bienvenido al juego de la rueda de la fortuna");
                System.out.println("");
                System.out.println("¿Desea jugar?");
                System.out.println("1. Si || 2. No");
                System.out.println("");

                opcion = obj.nextInt();

                if (opcion == 1){

                    int random = premios.nextInt(premio.length);
                    System.out.println("La rueda de la fortuna está girando...");
                    System.out.println("");
                    System.out.println("Felicidades usted ha ganado el premio de: " + premio[random]);
                    System.out.println("");

                } else {

                    System.out.println("Saliendo");
                }

                System.out.println("¿Desea continuar?");
                System.out.println("1. Si || 2. No");
                System.out.println("");
                salir = obj.nextInt();
            }
        while (salir == 1);
    }
}