package programas;

import java.util.Scanner;

public class Kilogramosagramos {

    public static void Kilogramosagramos() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("Indica la cantidad: ");
                    double kilogramos = scannerNumeros.nextDouble();

                    double gramo = kilogramos * 1000;
                    System.out.println(kilogramos + " kilogramos equivalen a " + gramo + " gramo.");
    }
}