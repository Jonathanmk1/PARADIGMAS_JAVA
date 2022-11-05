package d09222022;

import java.io.IOException;
import utilerias.Lectura;

public class Ecuac_cuadra {

    public static void main(String[] args) throws IOException {
        int a, b, c;
        float x1, x2, d;

        a = Lectura.leerInt("dame a: ");
        b = Lectura.leerInt("dame b: ");
        c = Lectura.leerInt("dame c: ");

        if (a == 0) {
            System.out.println("Es una ecuacion lineal");
        } else {
            d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("La solucion es compleja");
            } else {
                x1 = (-b + (float) (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
                x2 = (-b - (float) (Math.sqrt(b * b - 4 * a * c))) / (2 * a);

                Lectura.imprimirString("x1= " + x1 + "\nx2= " + x2);
            }
        }

    }
}
