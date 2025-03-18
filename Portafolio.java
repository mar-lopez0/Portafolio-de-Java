import java.util.Scanner;

public class Portafolio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenidos a mi Mar java [Mar Versión 2.0]");

            System.out.println("__ __ _ ____      ");
            System.out.println("| \\/ | /\\ | _\\ ");
            System.out.println("| |\\/| | / _ \\ | |_)| ");
            System.out.println("| | | |/ ___ \\| _ < ");
            System.out.println("|_| |_/_/ \\_\\_| \\_\\");
            System.out.println("");
            System.out.println("");

            System.out.println("[?] seleciona una opción para continuar");
            System.out.println("---> Desarrollado por Margeory 2025");
            System.out.println("");


            // MENÚ
            System.out.println("[1] La suma de dos numeros");
            System.out.println("[2] ");
            System.out.println("[3] ");
            System.out.println("[0] Salir");
            System.out.println("[?] ");
            opcion = scanner.nextInt();

            //OPCIONES
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    System.out.println("Opcion-2");
                    break;
                case 3:
                    System.out.println("Opcion-3");
                    break;
                case 4:
                    System.out.println("Opcion-4");
                    break;
                case 5:
                    System.out.println("Saliendo del programa!!!");

                    return;
            }
            System.out.println();
    }while (opcion == 5); {
            }
        
    }
}