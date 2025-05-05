package programas;

import java.util.Scanner;

public class Promedio {

    public static void Promedio() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.println("Indica el primer numero:");
                    double numr1 = scannerNumeros.nextInt();

                    System.out.print("Indica el segundo número: ");
                    double numr2 = scannerNumeros.nextInt();

                    System.out.print("Indica el tercer número: ");
                    double numr3 = scannerNumeros.nextInt();
                    
                    double promedio = (numr1 + numr2 +numr3) / 3; 

                    System.out.println("El promedio de los tres números es: " + promedio);
        
    }
}