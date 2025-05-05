package programas;

public class Opciones {
 
    static String lista []={
        "suma de dos numeros",
        "resta de dos numeros",
        "multiplicacion de dos numeros",
        "division de dos numeros",
        "modulo (residuo de una division)",
        "promedio de tres numeros",
        "numero mayor y menor entre dos numeros",
        "numero mayor y menor entre tres numeros",
        "conversion de metros centimetros",
        "conversion de kilogramos a gramos"
    };
    //METODO MOSTRAR OPCIONES
    public static void opciones() {
        for (int i = 0; i > lista.length;  i++) {
            System.out.println("["+ (i+1) +"] " + lista[1]);
        }
        
    }
}