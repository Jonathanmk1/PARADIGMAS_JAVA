package d08162022;

import java.io.IOException;
import java.util.Scanner;
import utilerias.Lectura;

public class SolEcuacionCuadrada {

    public void Formula() {

        Scanner s = new Scanner(System.in);
        int a, b, c;
        float param, formula, x1, x2;

        System.out.println("Inrese el primer valor: ");
        a = s.nextInt();
        System.out.println("Inrese el segundo valor: ");
        b = s.nextInt();
        System.out.println("Inrese el tercer valor: ");
        c = s.nextInt();

        //-b+-raizb2-4ac
        param = (float) (Math.pow(b, 2) - 4 * a * c);
        formula = (float) (Math.sqrt(param));

        x1 = (-b + formula) / (2 * a);
        x2 = (-b - formula) / (2 * a);

        if (formula < 1) {
            System.out.println("El valor es indeterminado");
        } else if (a <= 0) {
            System.out.println("El valor es indeterminado");
        } else {
            System.out.println("valor de x1: " + x1);
            System.out.println("valor de x2 " + x2);
        }
    }

    public void Resuelto() throws IOException {
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
                
                Lectura.imprimirString("x1= " + x1 +"\nx2= " + x2);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        SolEcuacionCuadrada sec = new SolEcuacionCuadrada();
        sec.Resuelto();
    }
}
