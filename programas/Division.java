package programas;

import java.util.Scanner;

public class Division {

    public static void división() {
       Scanner scannerNumeros = new Scanner(System.in);
 
        System.out.println("Indica el primer numero:");
                    double nu1 = scannerNumeros.nextDouble();

                    System.out.print("Indica el segundo número: ");
                    double numere2 = scannerNumeros.nextDouble();

                    if (numere2 != 0) {

                    double resultad = nu1 / numere2;

                    System.out.println("El resultado de la división de " + nu1 + " entre " + numere2 + " es: " + resultad);
                    }
        
    }
}