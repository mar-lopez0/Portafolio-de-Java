package programas;

import java.util.Scanner;

public class Mayormenordos {

    public static void Mayormenordos() {
        Scanner scannerNumeros = new Scanner(System.in);

                System.out.print("Indica el primer número: ");
                int n1 = scannerNumeros.nextInt();

                System.out.print("Indica el segundo número: ");
                int n2 = scannerNumeros.nextInt();

                int mayor = n1; 
                int menor = n2;
                

                System.out.println("El número mayor es: " + mayor);
                System.out.println("El número menor es: " + menor);
    }
}