package programas;

import java.util.Scanner;

public class resta {

    public static void rerta() {
        Scanner scannerNUmeros = new Scanner(System.in);

        System.out.println("[n3]: ");
        double n3 = scannerNUmeros.nextDouble();

        System.out.println("[n4] ");
        double n4 = scannerNUmeros.nextDouble();

        System.out.println("[Re]: "+ (n3-n4));
        
    }
}