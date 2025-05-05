package programas;

import java.util.Scanner;

public class Metrosacentimetros {

    public static void Metrosacentimetros() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("Indica la cantidad de metros: ");
                    double metros = scannerNumeros.nextDouble();
                    
                    double centimetros = metros * 100;

                    System.out.println(metros + "metros equivalen a" + centimetros + "centímetros");
    }
}