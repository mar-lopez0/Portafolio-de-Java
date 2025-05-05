package programas;

import java.util.Scanner;

public class Modulo {

    public static void Modulo() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.println("Indica el primer numero:");
        int numero = scannerNumeros.nextInt();

        System.out.print("Indica el segundo número: ");
        int numero1 = scannerNumeros.nextInt();

        int residuo = numero % numero1;

        System.out.println("El residuo de la división de " + numero + " entre " + numero1 + " es: " + residuo);
    }
}