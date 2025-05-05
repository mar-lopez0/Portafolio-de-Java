package programas;

import java.util.Scanner;

public class Multiplicacion {

    public static void multiplicacion() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.println("Indica el primer numero:");
                    double numer = scannerNumeros.nextInt();

                    System.out.print("Indica el segundo número: ");
                    double numer2 = scannerNumeros.nextDouble();

                    double resulta = numer * numer2;

                    System.out.println("El resultado de la multiplicación de " + numer + " y " + numer2 + " es: " + resulta);
        
        
    }
}