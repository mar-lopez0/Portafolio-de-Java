package programas;

import java.util.Scanner;

public class Mayormenortres {

    public static void Mayormenortres() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("Indica el primer número: ");
        int numo1 = scannerNumeros.nextInt();

        System.out.print("Indica el segundo número: ");
        int numo2 = scannerNumeros.nextInt();

        System.out.print("Indica el tercer número: ");
        int nuo3 = scannerNumeros.nextInt();

        int mayorr = numo1;
        if (numo2 > mayorr) {
        mayorr = numo2;
        }
        if (nuo3 > mayorr) {
        mayorr = nuo3;
        }

        int menorr = numo1;
        if (numo2 < menorr) {
        menorr = numo2;
        }
        if (nuo3 < menorr) {
        menorr = nuo3;
        }

        int menorrr = numo1;
        if (numo2 < menorrr) {
        menorrr = numo2;
        }
        if (nuo3 < menorr) {
        menorr = nuo3;
        }

        System.out.println("El número mayor es: " + mayorr);
        System.out.println("El número menor es: " + menorr);
    }
}