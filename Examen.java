package d09292022;

import java.io.IOException;
import java.util.Scanner;
import utilerias.Lectura;
import utilerias.MetodoExamen;

public class Examen {
    

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        Examen e = new Examen();
        int resp;
        System.out.println("\033[31m**********MENU************:\033[0m ");
        System.out.println("\033[35m1. Calificación Parcial 1\033[0m");
        System.out.println("\033[36m2. Venta de Computadoras\033[0m");
        System.out.println("\033[35m3. Reporte de ventas de computadoras\033[0m");
        System.out.println("\033[36m4. Salr\033[0m");
        resp = Lectura.leerInt("\033[34m-----Seleccione una opcion----\033[0m");

        while (resp != 4) {
            switch (resp) {
                case 1:
                    MetodoExamen.Calificacion();
                case 2:
                    
                    MetodoExamen.Computadoras();
                    break;
                case 3:
                    MetodoExamen.imrpimir();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("valor fuera del rango (1-5)");
                    break;

            }
            System.out.println("\033[31m**********MENU************:\033[0m ");
            System.out.println("\033[35m1. Calificación Parcial 1\033[0m");
            System.out.println("\033[36m2. Venta de Computadoras\033[0m");
            System.out.println("\033[35m3. Reporte de ventas de computadoras\033[0m");
            System.out.println("\033[36m4. Salr\033[0m");
            System.out.println("\033[34m-----Seleccione una opcion----\033[0m");
            resp = s.nextInt();
        }
        //System.out.println("presione una tecla para continuar: ");
        //s.next();

    }
}
