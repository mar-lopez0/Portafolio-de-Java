import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;


         do {
            vistas.vista.banner();
            programas.Opciones.opciones();
            System.out.println("[0] Salir");
            System.out.println("[?] ");

            opcion = scanner.nextInt();

            //OPCIONES
            switch (opcion) {
                case 1:
                    programas.Sumar.suma();
                    break;

                case 2:
                    programas.resta.rerta();

                    break;

                case 3:
                    programas.Multiplicacion.multiplicacion();
                break;
            

                case 4:
                    programas.Division.división();
                    break;
                
                case 5:
                    programas.Modulo.Modulo();
                    break;

                case 6:
                    programas.Promedio.Promedio();
                    break;

                case 7:
                    programas.Mayormenordos.Mayormenordos();
                    break;

                case 8:
                    programas.Mayormenortres.Mayormenortres();
                break;

                case 9:
                    programas.Metrosacentimetros.Metrosacentimetros();
                    break;

                case 10:
                   programas.Kilogramosagramos.Kilogramosagramos();
                    break;

                case 0:
                System.out.println("Saliendo bye");
                break;

                default: System.out.println("Opcion no valida");
            }
            
        }while (opcion !=0); 
    }
}